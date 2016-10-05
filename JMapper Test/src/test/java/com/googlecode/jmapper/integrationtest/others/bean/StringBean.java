package com.googlecode.jmapper.integrationtest.others.bean;

import com.googlecode.jmapper.annotations.JMap;

public class StringBean {

	@JMap private String field;

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public StringBean(String field) {
		super();
		this.field = field;
	}
	
	public StringBean() {
	}
}
