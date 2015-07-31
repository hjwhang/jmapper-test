package com.googlecode.jmapper.integrationtest.others;

import java.io.ByteArrayOutputStream;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.integrationtest.others.bean.DestinationXML;
import com.googlecode.jmapper.integrationtest.others.bean.SourceXML;

public class XmlAsContentTest extends TestCase {
	ByteArrayOutputStream log;
	
	public XmlAsContentTest() {
		log = new ByteArrayOutputStream();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}

	public void testXmlAsContent(){
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
		"<jmapper "+
		   "xmlns=\"https://jmapper-framework.googlecode.com\""+
		   "xmlns:xsi=\"http://jmapper-framework.googlecode.com/svn\""+
		   "xsi:noNamespaceSchemaLocation=\"http://jmapper-framework.googlecode.com/svn/jmapper-1.3.1.xsd\">"+
		   
		   "<class name=\"com.googlecode.jmapper.integrationtest.others.bean.DestinationXML\">"+
		    "<global></global>"+
		   "</class>"+
		"</jmapper>";
		
		assertEquals("prova",test(xml).getStr());
	}
	
	public void testXmlAsContent2(){
		String xml = "<jmapper "+
		   "xmlns=\"https://jmapper-framework.googlecode.com\""+
		   "xmlns:xsi=\"http://jmapper-framework.googlecode.com/svn\""+
		   "xsi:noNamespaceSchemaLocation=\"http://jmapper-framework.googlecode.com/svn/jmapper-1.3.1.xsd\">"+
		   
		   "<class name=\"com.googlecode.jmapper.integrationtest.others.bean.DestinationXML\">"+
		    "<global></global>"+
		   "</class>"+
		"</jmapper>";
		
		assertEquals("prova",test(xml).getStr());
	}
	
	public void testXmlAsContent3(){
		String xml = "<jmapper>"+
		   "<class name=\"com.googlecode.jmapper.integrationtest.others.bean.DestinationXML\">"+
		   "<global></global>"+
		   "<conversion name=\"conversion\">"+
               "return \"prova3\";"+
           "</conversion>"+
		   "</class>"+
		"</jmapper>";
		
		assertEquals("prova3",test(xml).getStr());
	}
	
	public void testXmlAsContent4(){
		String xml = "<jmapper>"+
		   "<class name=\"com.googlecode.jmapper.integrationtest.others.bean.DestinationXML\">"+
		   "<global></global>"+
		   "<conversion name=\"conversion2\" type=\"STATIC\">"+
               "return \"prova4\";"+
           "</conversion>"+
		   "</class>"+
		"</jmapper>";
		
		assertEquals("prova4",test(xml).getStr());
	}
	private DestinationXML test(String xml){
		JMapper<DestinationXML, SourceXML> mapper = new JMapper<DestinationXML, SourceXML>(DestinationXML.class, SourceXML.class, xml);
		return mapper.getDestination(new SourceXML("prova"));
	}
}
