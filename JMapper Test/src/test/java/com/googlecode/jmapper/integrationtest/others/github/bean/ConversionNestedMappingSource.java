package com.googlecode.jmapper.integrationtest.others.github.bean;

import com.googlecode.jmapper.annotations.JMap;
import com.googlecode.jmapper.annotations.JMapConversion;

public class ConversionNestedMappingSource {

	@JMap("${nestedDestination.nestedDestinationData}")
	private String field;

	
	public ConversionNestedMappingSource(String field) {
		super();
		this.field = field;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
	
	@JMapConversion(from="field",to="nestedDestinationData")
	public String conversion(String source){
		return source + " converted";
	}
}
