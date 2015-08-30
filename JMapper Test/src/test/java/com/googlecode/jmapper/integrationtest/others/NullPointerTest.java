package com.googlecode.jmapper.integrationtest.others;

import java.io.ByteArrayOutputStream;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.exceptions.JMapperException;
import com.googlecode.jmapper.integrationtest.others.bean.NullPointerDest;
import com.googlecode.jmapper.integrationtest.others.bean.NullPointerSrc;

public class NullPointerTest extends TestCase {
	
	ByteArrayOutputStream log;
	
	public NullPointerTest() {
		log = new ByteArrayOutputStream();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}

	public void testBasic(){
		try{
			
			new JMapper<NullPointerDest, NullPointerSrc>(NullPointerDest.class, NullPointerSrc.class).getDestinationWithoutControl(null);
		}catch(Exception e){
			assertEquals(JMapperException.class, e.getClass());
			assertEquals("java.lang.NullPointerException", e.getMessage());
			
		}
	}
}
