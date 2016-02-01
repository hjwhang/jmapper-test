package com.googlecode.jmapper.integrationtest.nestedmapping;

import java.io.ByteArrayOutputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.exceptions.JMapperException;
import com.googlecode.jmapper.integrationtest.nestedmapping.bean.Destination;
import com.googlecode.jmapper.integrationtest.nestedmapping.bean.Flatten;
import com.googlecode.jmapper.integrationtest.nestedmapping.bean.Nested;
import com.googlecode.jmapper.integrationtest.nestedmapping.bean.Nested2;
import com.googlecode.jmapper.integrationtest.nestedmapping.bean.Source;
import com.googlecode.jmapper.util.GeneralUtility;

import junit.framework.TestCase;

public class NestedMappingExceptionTest extends TestCase {
	
	ByteArrayOutputStream log;
	
	public NestedMappingExceptionTest() {
		PropertyConfigurator.configure("log4j.properties");
		log = new ByteArrayOutputStream();  
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}

	public void testInvalidNestedSourceMapping(){
		
		log.reset();
		try{
			new JMapper<Destination,Source>(Destination.class,Source.class);
		}catch(JMapperException e){}
		assertEquals("ERROR - InvalidNestedMappingException: Invalid nested mapping: ${field.test} Check the configured field: Source.field (target class: Destination). More information: There is no field test in Class String" + GeneralUtility.newLine, log.toString());
	}
	
	public void testNestedSourceBeanNull(){
		
		log.reset();
		try{
			JMapper<Flatten, Nested> mapper = new JMapper<Flatten,Nested>(Flatten.class,Nested.class);
			mapper.getDestination(new Nested(new Nested2(null)));	
		}catch(JMapperException e){}
		assertEquals("ERROR - NestedBeanNullException: the field nested4 is null, error occured in mapping phase between the fields: Flatten.field and Nested.nested2" + GeneralUtility.newLine,log.toString());
	}
}
