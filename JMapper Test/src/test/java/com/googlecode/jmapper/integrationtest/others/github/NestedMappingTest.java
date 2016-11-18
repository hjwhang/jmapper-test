package com.googlecode.jmapper.integrationtest.others.github;

import java.io.ByteArrayOutputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.api.enums.MappingType;
import com.googlecode.jmapper.integrationtest.others.github.bean.Destination;
import com.googlecode.jmapper.integrationtest.others.github.bean.NestedSource;
import com.googlecode.jmapper.integrationtest.others.github.bean.Source;

import junit.framework.TestCase;
/**
 * ISSUE #51
 * @author Alessandro Vurro
 *
 */

public class NestedMappingTest extends TestCase {
	ByteArrayOutputStream log;
	
	public NestedMappingTest() {
		log = new ByteArrayOutputStream();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}

	public void testNestedMapping(){
		JMapper<Destination, Source> mapper = new JMapper<Destination, Source>(Destination.class, Source.class);
		
		NestedSource nestedSource = new NestedSource(null);
		
		Source source = new Source();
		source.setSourceText("sourceText");
		source.setNestedSource(nestedSource);
		
		Destination destination = mapper.getDestination(source,MappingType.ONLY_VALUED_FIELDS);
		
		assertEquals("sourceText", destination.getDestinationText());
		assertEquals("Default Destination Text", destination.getNestedDestination().getNestedDestinationData());
	}
	
}
