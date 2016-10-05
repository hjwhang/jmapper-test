package com.googlecode.jmapper.integrationtest.others.bean;

import java.util.Date;

import com.googlecode.jmapper.annotations.JMap;

public class DateBean {

	@JMap
	private Date field;

	public Date getField() {
		return field;
	}

	public void setField(Date field) {
		this.field = field;
	}
	
	
}
