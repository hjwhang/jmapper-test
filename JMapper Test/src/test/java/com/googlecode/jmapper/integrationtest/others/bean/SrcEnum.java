package com.googlecode.jmapper.integrationtest.others.bean;

public class SrcEnum {
	private EnumTestBean field;

	public EnumTestBean getField() {
		return field;
	}

	public void setField(EnumTestBean field) {
		this.field = field;
	}

	public SrcEnum(EnumTestBean field) {
		super();
		this.field = field;
	}
	
	
}
