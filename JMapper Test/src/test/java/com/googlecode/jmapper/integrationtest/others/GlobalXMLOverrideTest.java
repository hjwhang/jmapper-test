package com.googlecode.jmapper.integrationtest.others;

import java.io.ByteArrayOutputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.integrationtest.others.JGlobalMapOvverideTest.JGlobalChild;
import com.googlecode.jmapper.integrationtest.others.JGlobalMapOvverideTest.JGlobalSource;

import junit.framework.TestCase;

public class GlobalXMLOverrideTest extends TestCase {
	
	ByteArrayOutputStream log;
	
	public GlobalXMLOverrideTest() {
		log = new ByteArrayOutputStream();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}

	public void testBasic(){
		
		   JMapper<JGlobalMapOvverideTest.JGlobalChild, JGlobalMapOvverideTest.JGlobalSource> mapper = 
	       new JMapper<JGlobalMapOvverideTest.JGlobalChild, JGlobalMapOvverideTest.JGlobalSource>
		   (JGlobalMapOvverideTest.JGlobalChild.class, JGlobalMapOvverideTest.JGlobalSource.class, "configurations/globaloverride.xml");
				
		    JGlobalChild destination = mapper.getDestination(new JGlobalSource("field", "field2"));
			
		    assertNull(destination.getField());
		    assertEquals("field2", destination.getField2());
		}
}
