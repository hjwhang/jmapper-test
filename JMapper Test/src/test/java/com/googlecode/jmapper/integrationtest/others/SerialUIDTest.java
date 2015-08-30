package com.googlecode.jmapper.integrationtest.others;

import java.io.ByteArrayOutputStream;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.integrationtest.others.bean.DestSerialUID;
import com.googlecode.jmapper.integrationtest.others.bean.SrcSerialUID;

public class SerialUIDTest extends TestCase {
	ByteArrayOutputStream log;
	
	public SerialUIDTest() {
		log = new ByteArrayOutputStream();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}

	public void testBasic(){
		JMapper<DestSerialUID, SrcSerialUID> mapper = new JMapper<DestSerialUID, SrcSerialUID>(DestSerialUID.class, SrcSerialUID.class);
		
		DestSerialUID destination = mapper.getDestination(new SrcSerialUID("prova"));
		
		assertEquals("prova", destination.getField());
	}
}
