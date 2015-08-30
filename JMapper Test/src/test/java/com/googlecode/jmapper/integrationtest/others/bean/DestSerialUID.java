package com.googlecode.jmapper.integrationtest.others.bean;

import java.io.Serializable;

import com.googlecode.jmapper.annotations.JGlobalMap;

@JGlobalMap
public class DestSerialUID implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8677112175141038286L;

	private String field;

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
	
	
}
