package com.googlecode.jmapper.integrationtest.others;

import junit.framework.Test;
import junit.framework.TestSuite;

public class OthersTests {

	public static Test suite() {

		TestSuite suite = new TestSuite(OthersTests.class.getName());
		// $JUnit-BEGIN$

		/* Tests on primitive and wrapper classes */
		suite.addTestSuite(BooleanGetTest.class);
		/* Tests on avoid set method */
		suite.addTestSuite(AvoidSetTest.class);
		/* Tests on regex */
		suite.addTestSuite(RegexTest.class);
		/* Tests on Xml as content */
		suite.addTestSuite(XmlAsContentTest.class);
		/* Tests on Enumerations */
		suite.addTestSuite(EnumTest.class);
		/* Tests on Inner classes */
		suite.addTestSuite(InnerClassTest.class);
		/* Tests on Null Pointer Control */
		suite.addTestSuite(NullPointerTest.class);
		/* Tests on serialVersionUID field */
		suite.addTestSuite(SerialUIDTest.class);
		
		// $JUnit-END$
		return suite;
	}
}
