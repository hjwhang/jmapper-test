package com.googlecode.jmapper.integrationtest.others.bean;

public class EnumBean {

	public enum Test{ FIELD, FIELD2}
	
	Test field;

	public Test getField() {
		return field;
	}

	public void setField(Test field) {
		this.field = field;
	}

	
	
}
