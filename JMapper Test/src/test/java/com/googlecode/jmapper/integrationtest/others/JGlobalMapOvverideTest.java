package com.googlecode.jmapper.integrationtest.others;

import java.io.ByteArrayOutputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.annotations.JGlobalMap;

import junit.framework.TestCase;

public class JGlobalMapOvverideTest extends TestCase {
	
	ByteArrayOutputStream log;
	
	public JGlobalMapOvverideTest() {
		log = new ByteArrayOutputStream();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}

	public void testBasic(){
			
	   JMapper<JGlobalMapOvverideTest.JGlobalChild, JGlobalMapOvverideTest.JGlobalSource> mapper = 
       new JMapper<JGlobalMapOvverideTest.JGlobalChild, JGlobalMapOvverideTest.JGlobalSource>
	   (JGlobalMapOvverideTest.JGlobalChild.class, JGlobalMapOvverideTest.JGlobalSource.class);
			
	    JGlobalChild destination = mapper.getDestination(new JGlobalSource("field", "field2"));
		
	    assertNull(destination.getField());
	    assertEquals("field2", destination.getField2());
	}
	
	public static class JGlobalSource{
		
		private String field;
		private String field2;
		public JGlobalSource(String field, String field2) {
			super();
			this.field = field;
			this.field2 = field2;
		}
		public String getField() {
			return field;
		}
		public String getField2() {
			return field2;
		}
		
		
	}
	@JGlobalMap(attributes={"field"})
	public static class JGlobalParent{
		
		private String field;
public JGlobalParent() {
}
		public String getField() {
			return field;
		}

		public void setField(String field) {
			this.field = field;
		}
	}
	
	@JGlobalMap(attributes={"field2"})
	public static class JGlobalChild extends JGlobalParent{
		
		private String field2;

		public JGlobalChild() {
		}
		public String getField2() {
			return field2;
		}

		public void setField2(String field2) {
			this.field2 = field2;
		}
		
		
		
	}
}
