package com.googlecode.jmapper.integrationtest.others;

import java.io.ByteArrayOutputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.integrationtest.others.bean.EnumBean;
import com.googlecode.jmapper.integrationtest.others.bean.EnumBean.Test;
import com.googlecode.jmapper.integrationtest.others.bean.EnumBean2;

import junit.framework.TestCase;

public class EnumEnumTest extends TestCase {
ByteArrayOutputStream log;
	
	public EnumEnumTest() {
		log = new ByteArrayOutputStream();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}
	
	public void testEnumEnumConversion(){
		JMapper<EnumBean, EnumBean2> mapper = new JMapper<EnumBean, EnumBean2>(EnumBean.class, EnumBean2.class);
		
		EnumBean2 source = new EnumBean2();
		source.setField(com.googlecode.jmapper.integrationtest.others.bean.EnumBean2.Test.FIELD2);
		EnumBean destination = mapper.getDestination(source);
		
		assertEquals(Test.FIELD2, destination.getField());
	}
}
