package com.googlecode.jmapper.integrationtest.others;

import java.io.ByteArrayOutputStream;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.integrationtest.others.bean.InnerClassDest;
import com.googlecode.jmapper.integrationtest.others.bean.InnerClassSrc;
import com.googlecode.jmapper.integrationtest.others.bean.InnerClassSrc.InnerClassBean;

public class InnerClassTest extends TestCase {
	
	ByteArrayOutputStream log;
	
	public InnerClassTest() {
		log = new ByteArrayOutputStream();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}

	public void testBasic(){
		InnerClassDest destination = new JMapper<InnerClassDest, InnerClassSrc>(InnerClassDest.class, InnerClassSrc.class).getDestination(new InnerClassSrc(new InnerClassBean("field")));
		assertEquals("field", destination.getBean().getField());
	}
	
	public void testXML(){
		InnerClassDest destination = new JMapper<InnerClassDest, InnerClassSrc>(InnerClassDest.class, InnerClassSrc.class,"conversions/innerConversion.xml").getDestination(new InnerClassSrc(new InnerClassBean("field")));
		assertEquals("field", destination.getBean().getField());
	}
}
