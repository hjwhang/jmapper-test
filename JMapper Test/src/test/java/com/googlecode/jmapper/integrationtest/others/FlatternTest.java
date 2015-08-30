package com.googlecode.jmapper.integrationtest.others;

import java.io.ByteArrayOutputStream;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.integrationtest.others.bean.FlatProDestination2;
import com.googlecode.jmapper.integrationtest.others.bean.FlatProSource;
import com.googlecode.jmapper.integrationtest.others.bean.FlatProDestination;
import com.googlecode.jmapper.integrationtest.others.bean.FlatProSource2;

public class FlatternTest extends TestCase {
	
		ByteArrayOutputStream log;
		
		public FlatternTest() {
			log = new ByteArrayOutputStream();
			PropertyConfigurator.configure("log4j.properties");
			Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
		}
		
		public void testFlattenProjection(){
			JMapper<FlatProSource,FlatProDestination> mapper = new JMapper<FlatProSource, FlatProDestination>(FlatProSource.class, FlatProDestination.class);
			
			FlatProSource source = mapper.getDestination(new FlatProDestination("nameDest","surDest","addDest","numDest"));
			
			assertEquals("nameDest", source.getUser().gName());
			assertEquals("surDest", source.getUser().getSurname());
			assertEquals("addDest", source.getUser().getAddress());
			assertEquals("numDest", source.getUser().getNumber());
		}
		
		public void testFlattenProjectionXML(){
			JMapper<FlatProSource2,FlatProDestination2> mapper = new JMapper<FlatProSource2, FlatProDestination2>(FlatProSource2.class, FlatProDestination2.class,"configurations/flattenProjection.xml");
			
			FlatProSource2 source = mapper.getDestination(new FlatProDestination2("nameDest","surDest","addDest","numDest"));
			
			assertEquals("nameDest", source.getUser().gName());
			assertEquals("surDest", source.getUser().getSurname());
			assertEquals("addDest", source.getUser().getAddress());
			assertEquals("numDest", source.getUser().getNumber());
		}
}
