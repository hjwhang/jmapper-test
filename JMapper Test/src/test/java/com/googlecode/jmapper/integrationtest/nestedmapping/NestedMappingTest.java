package com.googlecode.jmapper.integrationtest.nestedmapping;

import org.apache.log4j.PropertyConfigurator;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.integrationtest.nestedmapping.bean.Destination;
import com.googlecode.jmapper.integrationtest.nestedmapping.bean.NestedDest;
import com.googlecode.jmapper.integrationtest.nestedmapping.bean.NestedSrc;
import com.googlecode.jmapper.integrationtest.nestedmapping.bean.Source;

import junit.framework.TestCase;

public class NestedMappingTest extends TestCase {

	@Override
	protected void setUp() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
	}
	
	public void testInvalidNestedMapping(){
		try{
			new JMapper<Destination,Source>(Destination.class,Source.class);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void testIdentificationNesting(){
		try{
			new JMapper<NestedDest,NestedSrc>(NestedDest.class,NestedSrc.class);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
