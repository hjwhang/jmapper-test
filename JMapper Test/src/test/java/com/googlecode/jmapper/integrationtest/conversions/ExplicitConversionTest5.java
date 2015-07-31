package com.googlecode.jmapper.integrationtest.conversions;

import junit.framework.TestCase;

import org.apache.log4j.PropertyConfigurator;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.integrationtest.conversions.bean.DExplicitConversion5;
import com.googlecode.jmapper.integrationtest.conversions.bean.Explicit$$Conversion5NestedBean;
import com.googlecode.jmapper.integrationtest.conversions.bean.SExplicitConversion5;

public class ExplicitConversionTest5 extends TestCase{
	
JMapper<DExplicitConversion5, SExplicitConversion5> mapper;
	
	@Override
	protected void setUp() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
	}

	
	public void testDefault(){
		mapper = new JMapper<DExplicitConversion5, SExplicitConversion5>(DExplicitConversion5.class, SExplicitConversion5.class,"conversions/conversionTest5.xml");
		DExplicitConversion5 destination = mapper.getDestination(new SExplicitConversion5(new Explicit$$Conversion5NestedBean("$eee")));
		assertEquals("$eee", destination.getLegDuration().getMeasure());
	}
}
