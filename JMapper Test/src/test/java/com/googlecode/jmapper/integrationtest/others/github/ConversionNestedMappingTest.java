package com.googlecode.jmapper.integrationtest.others.github;

import java.io.ByteArrayOutputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.integrationtest.others.github.bean.ConversionNestedMappingSource;
import com.googlecode.jmapper.integrationtest.others.github.bean.Destination;

import junit.framework.TestCase;

public class ConversionNestedMappingTest extends TestCase {
	ByteArrayOutputStream log;
	
	public ConversionNestedMappingTest() {
		log = new ByteArrayOutputStream();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}

	public void testConversionNestedMapping(){
		JMapper<Destination, ConversionNestedMappingSource> mapper =
				new JMapper<Destination, ConversionNestedMappingSource>(Destination.class, ConversionNestedMappingSource.class);
		
		Destination destination = mapper.getDestination(new ConversionNestedMappingSource("source field"));
		
		assertEquals("source field converted", destination.getNestedDestination().getNestedDestinationData());
	}
}
