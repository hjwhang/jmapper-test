package com.googlecode.jmapper.integrationtest.others.github;

import java.io.ByteArrayOutputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.api.JMapperAPI;
import com.googlecode.jmapper.integrationtest.others.github.bean.EnumDest;
import com.googlecode.jmapper.integrationtest.others.github.bean.EnumSrc;
import com.googlecode.jmapper.integrationtest.others.github.bean.Test;
import static com.googlecode.jmapper.api.JMapperAPI.*;
import junit.framework.TestCase;

public class EnumMappingTest extends TestCase {
	ByteArrayOutputStream log;
	
	public EnumMappingTest() {
		log = new ByteArrayOutputStream();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}

	public void testMapping(){
		JMapper<EnumDest, EnumSrc> mapper = new JMapper<EnumDest, EnumSrc>(EnumDest.class, EnumSrc.class);
		EnumSrc src = new EnumSrc();
		src.setTest(Test.PROVA);
		
		EnumDest dest = mapper.getDestination(src);
		
		assertEquals(Test.PROVA, dest.getTest());
	}
	
	public void testMapping2(){
		JMapperAPI api = new JMapperAPI().add(mappedClass(EnumSrc.class).add(global()));
		
		JMapper<EnumDest, EnumSrc> mapper = new JMapper<EnumDest, EnumSrc>(EnumDest.class, EnumSrc.class,api);
		EnumSrc src = new EnumSrc();
		src.setTest(Test.PROVA);
		
		EnumDest dest = mapper.getDestination(src);
		
		assertEquals(Test.PROVA, dest.getTest());
	}
}
