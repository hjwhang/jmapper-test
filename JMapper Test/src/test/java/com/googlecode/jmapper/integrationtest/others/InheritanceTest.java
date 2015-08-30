package com.googlecode.jmapper.integrationtest.others;

import java.io.ByteArrayOutputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.RelationalJMapper;
import com.googlecode.jmapper.annotations.JMap;
import com.googlecode.jmapper.integrationtest.others.bean.InheritanceDest;
import com.googlecode.jmapper.integrationtest.others.bean.InheritanceSrc;
import com.googlecode.jmapper.integrationtest.others.bean.differentpath.InheritanceBean;

import junit.framework.TestCase;

public class InheritanceTest extends TestCase {
	
	ByteArrayOutputStream log;
	
	public InheritanceTest() {
		log = new ByteArrayOutputStream();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}

	/**
	 * Test dell'ereditarietà della mappatura sui campi in formato XML.
	 * In questo caso a JMapper si passa una classe che estende quella configurata in xml.
	 */
	public void testInheritedXMLMapping(){
		
		String xml =
				  "<jmapper>"
				+    "<class name=\"com.googlecode.jmapper.integrationtest.others.bean.InheritanceParent\">"
				+       "<attribute name=\"language\">"
				+          "<value name=\"language\"/>"
				+       "</attribute>"
				+    "</class>"
				+    "<class name=\"com.googlecode.jmapper.integrationtest.others.bean.InheritanceBean\">"
				+       "<global />"
				+    "</class>"
				+ "</jmapper>";
		
		JMapper<InheritanceDest,InheritanceSrc> mapper = 
		new JMapper<InheritanceDest, InheritanceSrc>(InheritanceDest.class, InheritanceSrc.class,xml);
		
		InheritanceDest destination = mapper.getDestination(new InheritanceSrc(new InheritanceBean("well done!")));
		assertEquals("well done!", destination.getLanguage().getField());
	}
	/**
	 * Test dell'ereditarietà della mappatura sui campi con Annotation.
	 * In questo caso a JMapper si passa una classe che estende quella configurata in Annotation.
	 */
	public void testInheritedMapping(){
		
		JMapper<InheritanceDest,InheritanceSrc> mapper = 
		new JMapper<InheritanceDest, InheritanceSrc>(InheritanceDest.class, InheritanceSrc.class);
		
		InheritanceDest destination = mapper.getDestination(new InheritanceSrc(new InheritanceBean("well done!")));
		assertEquals("well done!", destination.getLanguage().getField());
	}	
	
	public void testInheritanceAnnotated(){
			RelationalJMapper<BoI> mapper = new RelationalJMapper<BoI>(BoI.class);
			BoI destination = mapper.manyToOne(new PivotI(2));
			assertEquals(new Integer(2), destination.getBoIfield());
	}
	
	public void testInheritanceXML(){
		RelationalJMapper<BoI> mapper = new RelationalJMapper<BoI>(BoI.class,"configurations/inheritedRelational.xml");
		BoI destination = mapper.manyToOne(new PivotI(2));
		assertEquals(new Integer(2), destination.getBoIfield());
	}
	
	public static class PivotI extends AbstractPivotI {
		public PivotI() {
		}
		public PivotI(Integer id) {
			super(id);
		}
	}

	public static abstract class AbstractPivotI {
		Integer id;
		public AbstractPivotI() {
		}
		public AbstractPivotI(Integer id) {this.id = id;}
		public Integer getId() {return id;}
		public void setId(Integer id) {this.id = id;}
	}

	public static class BoI extends AbstractBoI {
		
		
	}

	public static abstract class AbstractBoI {
		@JMap(attributes={"id"}, classes   ={PivotI.class})
		Integer boIfield;
		public AbstractBoI() {
		}
		public Integer getBoIfield() {
			return boIfield;
		}

		public void setBoIfield(Integer boIfield) {
			this.boIfield = boIfield;
		}
		
		
	}

}
