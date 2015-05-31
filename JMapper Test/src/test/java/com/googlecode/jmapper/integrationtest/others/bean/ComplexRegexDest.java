package com.googlecode.jmapper.integrationtest.others.bean;

import com.googlecode.jmapper.annotations.JMap;

public class ComplexRegexDest {

	@JMap(value="\\w+id",classes={ComplexRegexSrc1.class, ComplexRegexSrc2.class})
	private Integer id;
	private String otherField;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOtherField() {
		return otherField;
	}
	public void setOtherField(String otherField) {
		this.otherField = otherField;
	}
	
	
}
