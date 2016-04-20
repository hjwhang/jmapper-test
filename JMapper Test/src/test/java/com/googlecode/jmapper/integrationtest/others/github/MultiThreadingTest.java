package com.googlecode.jmapper.integrationtest.others.github;

import java.io.ByteArrayOutputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.integrationtest.others.github.bean.JMapperTester;

import junit.framework.TestCase;

/**
 * ISSUE #29
 * @author Alessandro Vurro
 *
 */
public class MultiThreadingTest extends TestCase {
	ByteArrayOutputStream log;
	
	public MultiThreadingTest() {
		log = new ByteArrayOutputStream();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}

	public void testMultiThreading(){
		try{
		 Thread thread1 = new Thread(new JMapperTester() );
		 Thread thread2 = new Thread(new JMapperTester() );
		 
		 thread1.start();
		 thread2.start();
		}catch(Throwable e){
			assertTrue(false);
		}
	}
}
