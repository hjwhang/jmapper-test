package com.googlecode.jmapper.integrationtest.nestedmapping.bean;

import com.googlecode.jmapper.annotations.JMap;

public class Flatten {

	@JMap("${nested2.nested3.nested4}")
	private String field;

	public Flatten() {}
	
	
	public Flatten(String field) {
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
