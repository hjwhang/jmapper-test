package com.googlecode.jmapper.integrationtest.nestedmapping.bean;

import com.googlecode.jmapper.annotations.JMap;

public class Flatten2 {

	@JMap("${nested2.?nested3.?nested4}")
	private String field;

	public Flatten2() {}
	
	
	public Flatten2(String field) {
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
