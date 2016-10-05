package com.googlecode.jmapper.integrationtest.others.github.bean;

import com.googlecode.jmapper.annotations.JMap;

public class SimpleBean {

	@JMap
	private String field;

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public SimpleBean(String field) {
		super();
		this.field = field;
	}
	
	
}
