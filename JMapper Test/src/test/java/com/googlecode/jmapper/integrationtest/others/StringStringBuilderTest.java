package com.googlecode.jmapper.integrationtest.others;

import java.io.ByteArrayOutputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.api.enums.MappingType;
import com.googlecode.jmapper.integrationtest.others.bean.StringBean;
import com.googlecode.jmapper.integrationtest.others.bean.StringBuilderBean;

import junit.framework.TestCase;

public class StringStringBuilderTest extends TestCase {
	
	ByteArrayOutputStream log;
	
	public StringStringBuilderTest() {
		log = new ByteArrayOutputStream();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}
	
	public void testStringBuilderStringOperation(){
		JMapper<StringBuilderBean, StringBean> mapper = new JMapper<StringBuilderBean, StringBean>(StringBuilderBean.class, StringBean.class);
		
		StringBuilderBean destination = mapper.getDestination(new StringBean("prova"));
		
		assertEquals("prova", destination.getField().toString());
		
		StringBuilderBean destination2 = mapper.getDestination(new StringBuilderBean(new StringBuilder("sovrascritto")), new StringBean("prova"));
		
		assertEquals("prova", destination2.getField().toString());
		
		StringBuilderBean destination3 = mapper.getDestination(new StringBuilderBean(new StringBuilder("sovrascritto")), new StringBean("prova"),MappingType.ONLY_NULL_FIELDS,MappingType.ALL_FIELDS);
		
		assertEquals("sovrascritto", destination3.getField().toString());
		
		
	}
	
	public void testStringStringBuilderOperation(){
		JMapper<StringBean, StringBuilderBean> mapper = new JMapper<StringBean, StringBuilderBean>(StringBean.class, StringBuilderBean.class);
		
		StringBean destination = mapper.getDestination(new StringBuilderBean(new StringBuilder("prova")));
		
		assertEquals("prova", destination.getField());
		
		StringBean destination2 = mapper.getDestination(new StringBean("sovrascritto"), new StringBuilderBean(new StringBuilder("prova")));
		
		assertEquals("prova", destination2.getField());
		
		StringBean destination3 = mapper.getDestination(new StringBean(("sovrascritto")), new StringBuilderBean(new StringBuilder("prova")),MappingType.ONLY_NULL_FIELDS,MappingType.ALL_FIELDS);
		
		assertEquals("sovrascritto", destination3.getField());
		
		
	}
}
