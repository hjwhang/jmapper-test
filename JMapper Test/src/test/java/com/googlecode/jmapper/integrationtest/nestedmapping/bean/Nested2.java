package com.googlecode.jmapper.integrationtest.nestedmapping.bean;

public class Nested2 {

	private Nested3 nested3;

	public Nested2() {}
	
	public Nested2(Nested3 nested3) {
		super();
		this.nested3 = nested3;
	}

	public Nested3 getNested3() {
		return nested3;
	}

	public void setNested3(Nested3 nested3) {
		this.nested3 = nested3;
	}

	
}
