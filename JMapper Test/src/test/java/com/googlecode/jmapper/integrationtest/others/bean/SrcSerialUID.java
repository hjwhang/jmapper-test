package com.googlecode.jmapper.integrationtest.others.bean;

import java.io.Serializable;

public class SrcSerialUID implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -940251623042985855L;
	
	private String field;

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public SrcSerialUID(String field) {
		super();
		this.field = field;
	}
	
}
