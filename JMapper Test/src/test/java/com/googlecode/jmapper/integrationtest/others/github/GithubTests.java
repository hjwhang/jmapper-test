package com.googlecode.jmapper.integrationtest.others.github;

import junit.framework.Test;
import junit.framework.TestSuite;

public class GithubTests {

	public static Test suite() {

		TestSuite suite = new TestSuite(GithubTests.class.getName());
		// $JUnit-BEGIN$

		/* Tests on explicit cast */
		suite.addTestSuite(CastTest.class);
		/* Tests on multi threading */
		suite.addTestSuite(MultiThreadingTest.class);
		/* Tests on conversion via API */
		suite.addTestSuite(APIConversionTest.class);
		/* Test on immutable objects */
		suite.addTestSuite(NotEmptyConstructorTest.class);
		/* Test on nested objects */
		suite.addTestSuite(NestedMappingTest.class);
		/* Test on conversion between nested fields */
		suite.addTestSuite(ConversionNestedMappingTest.class);
		/* Test on dynamic conversion with a source field primitive */
		suite.addTestSuite(DynamicConversionShortEnumTest.class);
		// $JUnit-END$
		return suite;
	}
}
