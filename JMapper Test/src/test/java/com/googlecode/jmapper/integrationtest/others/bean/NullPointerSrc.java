package com.googlecode.jmapper.integrationtest.others.bean;

import com.googlecode.jmapper.annotations.JGlobalMap;

@JGlobalMap
public class NullPointerSrc {

	private String field;

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
}
