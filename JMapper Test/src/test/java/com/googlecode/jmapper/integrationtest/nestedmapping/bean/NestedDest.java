package com.googlecode.jmapper.integrationtest.nestedmapping.bean;

import com.googlecode.jmapper.annotations.JMap;

public class NestedDest {

	@JMap("${nestedSrc2.nestedSrc3}")
	private NestedDest2 nestedDest2;

	public NestedDest2 getNestedDest2() {
		return nestedDest2;
	}

	public void setNestedDest2(NestedDest2 nestedDest2) {
		this.nestedDest2 = nestedDest2;
	}
	
	
}
