package com.googlecode.jmapper.integrationtest.nestedmapping;

import java.io.ByteArrayOutputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.integrationtest.nestedmapping.bean.Flatten;
import com.googlecode.jmapper.integrationtest.nestedmapping.bean.Nested;
import com.googlecode.jmapper.integrationtest.nestedmapping.bean.Nested2;
import com.googlecode.jmapper.integrationtest.nestedmapping.bean.Nested3;

import junit.framework.TestCase;

public class NestedMappingTest extends TestCase {

	ByteArrayOutputStream log;
	
	public NestedMappingTest() {
		PropertyConfigurator.configure("log4j.properties");
		log = new ByteArrayOutputStream();  
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}
	
	
	public void testSourceNesting(){
		JMapper<Flatten, Nested> mapper = new JMapper<Flatten,Nested>(Flatten.class,Nested.class);
		Flatten destination = mapper.getDestination(new Nested(new Nested2(new Nested3("final value!!"))));	
		assertEquals("final value!!",destination.getField());
	}
	
	public void testDestinationNesting(){
		JMapper<Nested, Flatten> mapper = new JMapper<Nested, Flatten>(Nested.class,Flatten.class);
		Nested destination = mapper.getDestination(new Flatten("final value!!"));	
		assertEquals("final value!!",destination.getNested2().getNested3().getNested4());
	}
	
	public void testWithXmlConfiguration(){
		JMapper<Flatten, Nested> mapper = new JMapper<Flatten,Nested>(Flatten.class,Nested.class,"configurations/nested.xml");
		Flatten destination = mapper.getDestination(new Nested(new Nested2(new Nested3("final value!!"))));	
		assertEquals("final value!!",destination.getField());
	}
}
