package com.googlecode.jmapper.integrationtest.nestedmapping.bean;

import com.googlecode.jmapper.annotations.JMap;

public class Source2 {
	@JMap("${field.test}")
	private String field;

	public Source2() {
	}
	
	public Source2(String field) {
		super();
		this.field = field;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
	
	
}