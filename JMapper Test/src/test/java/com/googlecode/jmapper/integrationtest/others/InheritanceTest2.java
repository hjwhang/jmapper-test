package com.googlecode.jmapper.integrationtest.others;

import java.io.ByteArrayOutputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.RelationalJMapper;
import com.googlecode.jmapper.annotations.JGlobalMap;
import com.googlecode.jmapper.annotations.JMap;

import junit.framework.TestCase;

public class InheritanceTest2 extends TestCase {
	
	ByteArrayOutputStream log;
	
	public InheritanceTest2() {
		log = new ByteArrayOutputStream();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}
	public void testInheritanceAnnotated(){
		RelationalJMapper<BoI> mapper = new RelationalJMapper<BoI>(BoI.class);
		BoI destination = mapper.manyToOne(new PivotI(2));
		assertEquals(new Integer(2), destination.getAsd());
		assertNull(destination.getBoIfield());
		
		destination = mapper.manyToOne(new Pivot2I(3));
		assertNull(destination.getAsd());
		assertEquals(new Integer(3), destination.getBoIfield());
	}
	
	public void testInheritanceXML(){
		
		RelationalJMapper<BoI> mapper = new RelationalJMapper<BoI>(BoI.class,"configurations/inheritedRelational2.xml");
		BoI destination = mapper.manyToOne(new PivotI(2));
		assertEquals(new Integer(2), destination.getAsd());
		assertNull(destination.getBoIfield());
		
		destination = mapper.manyToOne(new Pivot2I(3));
		assertNull(destination.getAsd());
		assertEquals(new Integer(3), destination.getBoIfield());
	}
	
	public static class PivotI extends AbstractPivotI {
		public PivotI() {
		}
		public PivotI(Integer id) {
			super(id);
		}
	}
	public static class Pivot2I extends AbstractPivotI {
		public Pivot2I() {
		}
		public Pivot2I(Integer id) {
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
		
		@JMap(value="id",classes={Pivot2I.class})
		Integer boIfield;
		public BoI() {
		}
		public Integer getBoIfield() {
			return boIfield;
		}
	
		public void setBoIfield(Integer boIfield) {
			this.boIfield = boIfield;
		}
	}
	
	@JGlobalMap(value="id",classes={PivotI.class}, excluded ={"boIfield"})
	public static abstract class AbstractBoI {
		Integer asd;
		public AbstractBoI() {
		}
		public Integer getAsd() {
			return asd;
		}
		public void setAsd(Integer asd) {
			this.asd = asd;
		}
		
		
	}
}
