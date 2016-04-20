package com.googlecode.jmapper.integrationtest.others.github.bean;

import java.util.List;

public class DTO2 {

	private List<DTONested> fieldNestedList;

	
	public DTO2(List<DTONested> fieldNestedList) {
		super();
		this.fieldNestedList = fieldNestedList;
	}

	public List<DTONested> getFieldNestedList() {
		return fieldNestedList;
	}

	public void setFieldNestedList(List<DTONested> fieldNestedList) {
		this.fieldNestedList = fieldNestedList;
	}

	
}
