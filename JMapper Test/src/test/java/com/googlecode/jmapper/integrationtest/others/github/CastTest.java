package com.googlecode.jmapper.integrationtest.others.github;

import java.io.ByteArrayOutputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.integrationtest.others.github.bean.Buddy;
import com.googlecode.jmapper.integrationtest.others.github.bean.BuddyVO;
import com.googlecode.jmapper.integrationtest.others.github.bean.BuddyVOConverter;

import junit.framework.TestCase;

/**
 * ISSUE #30
 * @author Alessandro Vurro
 *
 */
public class CastTest extends TestCase {
	ByteArrayOutputStream log;
	
	public CastTest() {
		log = new ByteArrayOutputStream();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}
	
	public void testCast(){
		Buddy bu = new Buddy();
		bu.setId(2);
		BuddyVO vo = BuddyVOConverter.convertBOtoVO(bu);
		assertEquals(new Integer(2), vo.getId());
	}

}
