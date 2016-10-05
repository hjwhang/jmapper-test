package com.googlecode.jmapper.integrationtest.others.github.bean;

import com.googlecode.jmapper.annotations.JMap;

public class NestedSource {
	 @JMap(value = "nestedDestinationData", classes = NestedDestination.class)
private String nestedSourceData;

	 public NestedSource() {
	}
	 
	 
	public NestedSource(String nestedSourceData) {
		super();
		this.nestedSourceData = nestedSourceData;
	}


	public String getNestedSourceData() {
		return nestedSourceData;
	}

	public void setNestedSourceData(String nestedSourceData) {
		this.nestedSourceData = nestedSourceData;
	}

}
