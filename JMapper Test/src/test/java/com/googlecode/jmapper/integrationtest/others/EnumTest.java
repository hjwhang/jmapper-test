package com.googlecode.jmapper.integrationtest.others;

import java.io.ByteArrayOutputStream;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.integrationtest.others.bean.DestEnum;
import com.googlecode.jmapper.integrationtest.others.bean.EnumTestBean;
import com.googlecode.jmapper.integrationtest.others.bean.SrcEnum;
import com.googlecode.jmapper.xml.XmlHandler;

public class EnumTest extends TestCase {
	
	ByteArrayOutputStream log;
	
	public EnumTest() {
		log = new ByteArrayOutputStream();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}

	public void testBasic(){
		new XmlHandler().addAnnotatedClass(DestEnum.class);
		DestEnum destination = new JMapper<DestEnum, SrcEnum>(DestEnum.class, SrcEnum.class).getDestination(new SrcEnum(EnumTestBean.DESTINATION));
		assertEquals(EnumTestBean.DESTINATION, destination.getField());
	}
}
