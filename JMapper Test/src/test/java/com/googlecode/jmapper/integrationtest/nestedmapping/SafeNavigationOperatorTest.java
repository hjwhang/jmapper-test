package com.googlecode.jmapper.integrationtest.nestedmapping;

import java.io.ByteArrayOutputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.integrationtest.nestedmapping.bean.Flatten2;
import com.googlecode.jmapper.integrationtest.nestedmapping.bean.Nested;

import junit.framework.TestCase;

public class SafeNavigationOperatorTest extends TestCase {

	ByteArrayOutputStream log;
	
	public SafeNavigationOperatorTest() {
		PropertyConfigurator.configure("log4j.properties");
		log = new ByteArrayOutputStream();  
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}

	public void testSafeNavigationOperator(){
		JMapper<Flatten2, Nested> mapper = new JMapper<Flatten2, Nested>(Flatten2.class, Nested.class);
		
		Flatten2 destination = mapper.getDestination(new Nested());
		
		
	}
}
