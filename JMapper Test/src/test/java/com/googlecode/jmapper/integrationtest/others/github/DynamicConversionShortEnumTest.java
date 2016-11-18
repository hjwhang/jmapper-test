package com.googlecode.jmapper.integrationtest.others.github;

import java.io.ByteArrayOutputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.annotations.JMapConversion.Type;
import com.googlecode.jmapper.api.JMapperAPI;
import com.googlecode.jmapper.integrationtest.others.github.bean.DynamicDest;
import com.googlecode.jmapper.integrationtest.others.github.bean.DynamicSrc;
import com.googlecode.jmapper.integrationtest.others.github.bean.Enum;

import junit.framework.TestCase;
import static com.googlecode.jmapper.api.JMapperAPI.*;
public class DynamicConversionShortEnumTest extends TestCase {
	
	ByteArrayOutputStream log;
	
	public DynamicConversionShortEnumTest() {
	
		log = new ByteArrayOutputStream();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}

	public void testDynamicConversion(){
		JMapperAPI api = new JMapperAPI().add(
				mappedClass(DynamicDest.class)
					.add(attribute("anEnum") .value("aShort"))
					.add(conversion("shortToEnum").from("aShort").to("anEnum").type(Type.DYNAMIC)
						  .body("return com.googlecode.jmapper.integrationtest.others.github.bean.Enum.get(${source});")));
		
		JMapper<DynamicDest, DynamicSrc> mapper = new JMapper<DynamicDest, DynamicSrc>(DynamicDest.class, DynamicSrc.class, api);
		
		DynamicDest destination = mapper.getDestination(new DynamicSrc((short) 1));
		
		assertEquals(Enum.NUMBER, destination.getAnEnum());
		
	}
}
