package com.googlecode.jmapper.integrationtest.others.github;

import static com.googlecode.jmapper.util.GeneralUtility.newLine;

import java.io.ByteArrayOutputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.api.enums.MappingType;
import com.googlecode.jmapper.DestinationFactory;
import com.googlecode.jmapper.integrationtest.others.github.bean.NotEmptyConstructor;
import com.googlecode.jmapper.integrationtest.others.github.bean.SimpleBean;

import junit.framework.TestCase;

public class NotEmptyConstructorTest extends TestCase {
	
	ByteArrayOutputStream log;
	
	public NotEmptyConstructorTest() {
	
		log = new ByteArrayOutputStream();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}

	public void testNotEmptyConstructorWithDest(){
		
		
		JMapper<NotEmptyConstructor, SimpleBean> mapper = new JMapper<NotEmptyConstructor, SimpleBean>(NotEmptyConstructor.class, SimpleBean.class);
		
		NotEmptyConstructor destination = mapper.getDestination(new NotEmptyConstructor("evvai !!"),new SimpleBean(null),MappingType.ALL_FIELDS, MappingType.ONLY_VALUED_FIELDS);
		
		assertEquals("evvai !!", destination.getField());
	}

	public void testNotEmptyConstructor(){
		
		
		JMapper<NotEmptyConstructor, SimpleBean> mapper = new JMapper<NotEmptyConstructor, SimpleBean>(NotEmptyConstructor.class, SimpleBean.class);
		mapper.destinationFactory(new DestinationFactory<NotEmptyConstructor>() {
			
			@Override
			public NotEmptyConstructor make() {
				return new NotEmptyConstructor("evvai !!");
			}
		});
		
		NotEmptyConstructor destination = mapper.getDestination(new SimpleBean(null),MappingType.ONLY_VALUED_FIELDS);
		
		assertEquals("evvai !!", destination.getField());
	}
	
	public void testNotEmptyConstructorError(){
		
		log.reset();
		JMapper<NotEmptyConstructor, SimpleBean> mapper = new JMapper<NotEmptyConstructor, SimpleBean>(NotEmptyConstructor.class, SimpleBean.class);
		try{
			mapper.getDestination(new SimpleBean(null),MappingType.ONLY_VALUED_FIELDS);
		}catch(Exception e){}
		
		assertEquals("ERROR - AbsentFactoryAndEmptyConstructorException: The NotEmptyConstructor class does not have an empty constructor and there isn't a factory defined."+newLine, log.toString());
	}
}
