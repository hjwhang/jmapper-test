package com.googlecode.jmapper.integrationtest.others.bean;

public class InheritanceBean {

	private String field;

	public InheritanceBean() {}
	
	public InheritanceBean(String field) {
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
