package com.googlecode.jmapper.integrationtest.others.bean;

import com.googlecode.jmapper.annotations.JMap;

public class EnumBean2 {
	public enum Test{ FIELD, FIELD2}
	
	@JMap
	Test field;

	public Test getField() {
		return field;
	}

	public void setField(Test field) {
		this.field = field;
	}

}
