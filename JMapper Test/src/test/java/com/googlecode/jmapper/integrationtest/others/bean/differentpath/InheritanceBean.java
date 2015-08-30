package com.googlecode.jmapper.integrationtest.others.bean.differentpath;

import com.googlecode.jmapper.annotations.JMap;

public class InheritanceBean {

	@JMap private String field;

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
