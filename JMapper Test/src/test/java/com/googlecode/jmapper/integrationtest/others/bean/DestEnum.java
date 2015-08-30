package com.googlecode.jmapper.integrationtest.others.bean;

import com.googlecode.jmapper.annotations.JMap;

public class DestEnum {

	@JMap
	private EnumTestBean field;

	public EnumTestBean getField() {
		return field;
	}

	public void setField(EnumTestBean field) {
		this.field = field;
	}
	
	
}
