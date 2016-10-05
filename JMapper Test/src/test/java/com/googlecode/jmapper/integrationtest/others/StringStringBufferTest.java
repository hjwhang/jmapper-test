package com.googlecode.jmapper.integrationtest.others;

import java.io.ByteArrayOutputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.api.enums.MappingType;
import com.googlecode.jmapper.integrationtest.others.bean.StringBean;
import com.googlecode.jmapper.integrationtest.others.bean.StringBufferBean;

import junit.framework.TestCase;

public class StringStringBufferTest extends TestCase {
	
	ByteArrayOutputStream log;
	
	public StringStringBufferTest() {
		log = new ByteArrayOutputStream();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}
	
	public void testStringBufferStringOperation(){
		JMapper<StringBufferBean, StringBean> mapper = new JMapper<StringBufferBean, StringBean>(StringBufferBean.class, StringBean.class);
		
		StringBufferBean destination = mapper.getDestination(new StringBean("prova"));
		
		assertEquals("prova", destination.getField().toString());
		
		StringBufferBean destination2 = mapper.getDestination(new StringBufferBean(new StringBuffer("sovrascritto")), new StringBean("prova"));
		
		assertEquals("prova", destination2.getField().toString());
		
		StringBufferBean destination3 = mapper.getDestination(new StringBufferBean(new StringBuffer("sovrascritto")), new StringBean("prova"),MappingType.ONLY_NULL_FIELDS,MappingType.ALL_FIELDS);
		
		assertEquals("sovrascritto", destination3.getField().toString());
		
		
	}
	
	public void testStringStringBufferOperation(){
		JMapper<StringBean, StringBufferBean> mapper = new JMapper<StringBean, StringBufferBean>(StringBean.class, StringBufferBean.class);
		
		StringBean destination = mapper.getDestination(new StringBufferBean(new StringBuffer("prova")));
		
		assertEquals("prova", destination.getField());
		
		StringBean destination2 = mapper.getDestination(new StringBean("sovrascritto"), new StringBufferBean(new StringBuffer("prova")));
		
		assertEquals("prova", destination2.getField());
		
		StringBean destination3 = mapper.getDestination(new StringBean(("sovrascritto")), new StringBufferBean(new StringBuffer("prova")),MappingType.ONLY_NULL_FIELDS,MappingType.ALL_FIELDS);
		
		assertEquals("sovrascritto", destination3.getField());
		
		
	}
}
