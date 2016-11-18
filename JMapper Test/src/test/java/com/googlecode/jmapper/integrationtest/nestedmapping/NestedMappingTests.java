package com.googlecode.jmapper.integrationtest.nestedmapping;

import com.googlecode.jmapper.integrationtest.others.OthersTests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class NestedMappingTests {

	public static Test suite() {

		TestSuite suite = new TestSuite(OthersTests.class.getName());
		// $JUnit-BEGIN$
		
		suite.addTestSuite(NestedMappingTest.class);
		suite.addTestSuite(NestedMappingExceptionTest.class);
		//suite.addTestSuite(SafeNavigationOperatorTest.class);
		
		// $JUnit-END$
		return suite;
		
	}
}
