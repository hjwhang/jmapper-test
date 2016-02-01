package com.googlecode.jmapper.integrationtest.nestedmapping.bean;

public class Nested {

	private Nested2 nested2;

	public Nested() {}
	
	public Nested(Nested2 nested2) {
		super();
		this.nested2 = nested2;
	}

	public Nested2 getNested2() {
		return nested2;
	}

	public void setNested2(Nested2 nested2) {
		this.nested2 = nested2;
	}

}
