package com.googlecode.jmapper.integrationtest.others.github.bean;

public class NotEmptyConstructor {

	
	private String field;

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	
	public NotEmptyConstructor(String field) {
		super();
		this.field = field;
	}
	
	
}
