package com.googlecode.jmapper.integrationtest.others;

import java.io.ByteArrayOutputStream;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.RelationalJMapper;
import com.googlecode.jmapper.integrationtest.others.bean.BasicRegexDest;
import com.googlecode.jmapper.integrationtest.others.bean.BasicRegexSrc;
import com.googlecode.jmapper.integrationtest.others.bean.ComplexRegexDest;
import com.googlecode.jmapper.integrationtest.others.bean.ComplexRegexSrc1;
import com.googlecode.jmapper.integrationtest.others.bean.ComplexRegexSrc2;

public class RegexTest extends TestCase {
	ByteArrayOutputStream log;
	
	public RegexTest() {
		log = new ByteArrayOutputStream();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}

	public void testBasicRegex(){
		JMapper<BasicRegexDest,BasicRegexSrc> mapper = new JMapper<BasicRegexDest,BasicRegexSrc>(BasicRegexDest.class, BasicRegexSrc.class);
		BasicRegexDest destination = mapper.getDestination(new BasicRegexSrc(true));
		assertTrue(destination.getBoo());
	}
	
	public void testBasicRegexXML(){
		JMapper<BasicRegexDest,BasicRegexSrc> mapper = new JMapper<BasicRegexDest,BasicRegexSrc>(BasicRegexDest.class, BasicRegexSrc.class,"configurations/regex.xml");
		BasicRegexDest destination = mapper.getDestination(new BasicRegexSrc(true));
		assertTrue(destination.getBoo());
	}
	
	public void testComplexRegex(){
		RelationalJMapper<ComplexRegexDest> mapper = new RelationalJMapper<ComplexRegexDest>(ComplexRegexDest.class);
		
		ComplexRegexDest dest = mapper.manyToOne(new ComplexRegexSrc1("1", "idOther"));
		
		assertEquals("1", dest.getId().toString());
		
		dest = mapper.manyToOne(new ComplexRegexSrc2("2", "idOther"));
		
		assertEquals("2", dest.getId().toString());
	}
	
	public void testComplexRegexXML(){
		RelationalJMapper<ComplexRegexDest> mapper = new RelationalJMapper<ComplexRegexDest>(ComplexRegexDest.class,"configurations/regex.xml");
		
		ComplexRegexDest dest = mapper.manyToOne(new ComplexRegexSrc1("1", "idOther"));
		
		assertEquals("1", dest.getId().toString());
		
		dest = mapper.manyToOne(new ComplexRegexSrc2("2", "idOther"));
		
	}
}
