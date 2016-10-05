package com.googlecode.jmapper.integrationtest.others;

import java.io.ByteArrayOutputStream;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.WriterAppender;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.integrationtest.others.bean.CalendarBean;
import com.googlecode.jmapper.integrationtest.others.bean.DateBean;

import junit.framework.TestCase;

public class DateCalendarTest extends TestCase{
	ByteArrayOutputStream log;
	
	public DateCalendarTest() {
		log = new ByteArrayOutputStream();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger(JMapper.class).addAppender(new WriterAppender(new SimpleLayout(), log));
	}
	
	public void testCalendarDate(){
		JMapper<CalendarBean, DateBean> mapper = new JMapper<CalendarBean, DateBean>(CalendarBean.class, DateBean.class);
		
		Date date = new Date();
		Calendar expected = Calendar.getInstance();
		expected.setTime(date);
		
		DateBean source = new DateBean();
		source.setField(date);
		CalendarBean destination = mapper.getDestination(source);
		assertEquals(expected, destination.getField());
	}
	
	public void testDateCalendar(){
		JMapper<DateBean, CalendarBean> mapper = new JMapper<DateBean, CalendarBean>(DateBean.class, CalendarBean.class);
		
		Date expected = new Date();
		Calendar sourceField = Calendar.getInstance();
		sourceField.setTime(expected);
		
		CalendarBean source = new CalendarBean();
		source.setField(sourceField);
		DateBean destination = mapper.getDestination(source);
		assertEquals(expected, destination.getField());
	}
}
