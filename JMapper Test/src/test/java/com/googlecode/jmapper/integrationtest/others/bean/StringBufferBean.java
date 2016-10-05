package com.googlecode.jmapper.integrationtest.others.bean;

public class StringBufferBean {

	private StringBuffer field;

	public StringBuffer getField() {
		return field;
	}

	public void setField(StringBuffer field) {
		this.field = field;
	}
	
	public StringBufferBean() {
	}

	public StringBufferBean(StringBuffer field) {
		super();
		this.field = field;
	}
	
}
