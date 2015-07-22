package com.googlecode.jmapper.integrationtest.others;

import java.io.ByteArrayOutputStream;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.integrationtest.others.bean.DestinationClasseA;
import com.googlecode.jmapper.integrationtest.others.bean.DestinationClasseA2;
import com.googlecode.jmapper.integrationtest.others.bean.SourceClasseA;
import com.googlecode.jmapper.integrationtest.others.bean.SourceClasseA2;

public class RecursiveListMappingTest extends TestCase {
	
	ByteArrayOutputStream log;
	
	public RecursiveListMappingTest() {
		log = new ByteArrayOutputStream();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}

	public void testRecursiveListListMapping(){
		new JMapper<DestinationClasseA, SourceClasseA>(DestinationClasseA.class,SourceClasseA.class);
	}
	
	public void testRecursiveListArrayMapping(){
		new JMapper<DestinationClasseA2, SourceClasseA2>(DestinationClasseA2.class,SourceClasseA2.class);
	}
}
