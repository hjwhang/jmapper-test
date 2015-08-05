package com.googlecode.jmapper.integrationtest.conversions.bean;

import com.googlecode.jmapper.annotations.JMap;

public class DExplicitConversion5 {

	@JMap
	Explicit$$Conversion5NestedBean legDuration;
	
	@JMap("str\\$")
	private String str$;
	
	
	public String getStr$() {
		return str$;
	}

	public void setStr$(String str$) {
		this.str$ = str$;
	}

	public Explicit$$Conversion5NestedBean getLegDuration() {
		return legDuration;
	}

	public void setLegDuration(Explicit$$Conversion5NestedBean legDuration) {
		this.legDuration = legDuration;
	}

	

	
}
