package com.googlecode.jmapper.integrationtest.others.bean;

public class StringBuilderBean {

	private StringBuilder field;

	public StringBuilder getField() {
		return field;
	}

	public void setField(StringBuilder field) {
		this.field = field;
	}

	public StringBuilderBean() {
	}
	public StringBuilderBean(StringBuilder field) {
		super();
		this.field = field;
	}
	
	
}
