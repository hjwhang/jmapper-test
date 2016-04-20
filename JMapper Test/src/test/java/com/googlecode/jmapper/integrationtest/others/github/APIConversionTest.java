package com.googlecode.jmapper.integrationtest.others.github;

import com.googlecode.jmapper.api.JMapperAPI;
import com.googlecode.jmapper.integrationtest.others.github.bean.DTO1;
import com.googlecode.jmapper.integrationtest.others.github.bean.DTO2;
import com.googlecode.jmapper.integrationtest.others.github.bean.DTONested;

import junit.framework.TestCase;

import static com.googlecode.jmapper.api.JMapperAPI.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;

public class APIConversionTest extends TestCase {
	
		ByteArrayOutputStream log;
		
		public APIConversionTest() {
		
			log = new ByteArrayOutputStream();
			PropertyConfigurator.configure("log4j.properties");
			Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
		}
		
	final JMapperAPI api = new JMapperAPI().add(mappedClass(DTO1.class)
            .add(attribute("fieldX").value("fieldNestedList"))
            .add(conversion("conversion1")
                    .from("fieldNestedList")
                    .to("fieldX")
                    .body("return ((com.googlecode.jmapper.integrationtest.others.github.bean.DTONested)${source}.get(0)).getFieldY();")));
	
	public void testAPICoversion(){
		
		DTO2 source = new DTO2(Arrays.asList(new DTONested("done!"), new DTONested("ok")));
		
		JMapper<DTO1, DTO2> mapper = new JMapper<DTO1, DTO2>(DTO1.class, DTO2.class, api);
		
		DTO1 destination = mapper.getDestination(source);
		
		assertEquals("done!", destination.getFieldX());
	}
}
