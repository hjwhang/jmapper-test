package com.googlecode.jmapper.integrationtest.others;

import java.io.ByteArrayOutputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.integrationtest.others.bean.EnumBean;
import com.googlecode.jmapper.integrationtest.others.bean.StringBean;
import com.googlecode.jmapper.integrationtest.others.bean.EnumBean.Test;

import junit.framework.TestCase;

public class StringEnumTest extends TestCase{

ByteArrayOutputStream log;
	
	public StringEnumTest() {
		log = new ByteArrayOutputStream();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}
	
	public void testStringEnumConversion(){
		JMapper<StringBean, EnumBean> mapper = new JMapper<StringBean, EnumBean>(StringBean.class, EnumBean.class);
		
		EnumBean source = new EnumBean();
		source.setField(Test.FIELD);
		StringBean destination = mapper.getDestination(source);
		
		assertEquals("FIELD", destination.getField());
	}
	
	public void testEnumStringConversion(){
		JMapper<EnumBean, StringBean> mapper = new JMapper<EnumBean, StringBean>(EnumBean.class, StringBean.class);
		
		StringBean source = new StringBean();
		source.setField("FIELD");
		EnumBean destination = mapper.getDestination(source);
		
		assertEquals(Test.FIELD, destination.getField());
	}
}
