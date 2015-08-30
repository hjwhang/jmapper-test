package com.googlecode.jmapper.integrationtest.application;


import java.io.IOException;

import junit.framework.TestCase;

import com.googlecode.jmapper.RelationalJMapper;
import com.googlecode.jmapper.integrationtest.operations.bean.AnnotatedClass2;
import com.googlecode.jmapper.integrationtest.operations.bean.Class1;
import com.googlecode.jmapper.integrationtest.operations.bean.Class2;
import com.googlecode.jmapper.integrationtest.operations.bean.Class3;
import com.googlecode.jmapper.integrationtest.operations.bean.GlobalAnnotatedClass;
import com.googlecode.jmapper.integrationtest.operations.bean.GlobalClass;
import com.googlecode.jmapper.integrationtest.operations.bean.GlobalClass2;
import com.googlecode.jmapper.integrationtest.operations.bean.GlobalClass3;
import com.googlecode.jmapper.util.FilesManager;

public class RelationalJMapperTest extends TestCase {

	
	public void testRelationalJMapperWithGlobalAnnotation(){
		RelationalJMapper<GlobalAnnotatedClass> rm = new RelationalJMapper<GlobalAnnotatedClass>(GlobalAnnotatedClass.class);
		
		GlobalAnnotatedClass expected = new GlobalAnnotatedClass(null, "field2Class1", "field3Class1");
		GlobalAnnotatedClass actual = rm.manyToOne(new GlobalClass(null, "field2Class1", "field3Class1"));
		assertEquals(expected, actual);
		
		expected = new GlobalAnnotatedClass("field1Class2", null, "field3Class2");
		actual = rm.manyToOne(new GlobalClass2("field1Class2", null, "field3Class2"));
		assertEquals(expected, actual);
		
		expected = new GlobalAnnotatedClass("field1Class3", "field2Class3", null);
		actual = rm.manyToOne(new GlobalClass3("field1Class3", "field2Class3", null));
		assertEquals(expected, actual);
		
		GlobalClass class1Expected = new GlobalClass(null, "field2Class1", "field3Class1");
		GlobalClass class1Actual = rm.oneToMany(GlobalClass.class,new GlobalAnnotatedClass(null, "field2Class1", "field3Class1"));
		assertEquals(class1Expected, class1Actual);
		
		GlobalClass2 class2Expected = new GlobalClass2("field1Class2", null, "field3Class2");
		GlobalClass2 class2Actual = rm.oneToMany(GlobalClass2.class,new GlobalAnnotatedClass("field1Class2", null, "field3Class2"));
		assertEquals(class2Expected, class2Actual);
		
		GlobalClass3 class3Expected = new GlobalClass3("field1Class3", "field2Class3", null);
		GlobalClass3 class3Actual = rm.oneToMany(GlobalClass3.class,new GlobalAnnotatedClass("field1Class3", "field2Class3", null));
		assertEquals(class3Expected, class3Actual);
	}
	
	public void testRelationalJMapperWithGlobalXML() throws IOException{
		
		String xmlPath = "file:" + FilesManager.searchFile("globalRelational.xml").getCanonicalPath();
		
		RelationalJMapper<GlobalAnnotatedClass> rm = new RelationalJMapper<GlobalAnnotatedClass>(GlobalAnnotatedClass.class,xmlPath);
		
		GlobalAnnotatedClass expected = new GlobalAnnotatedClass(null, "field2Class1", "field3Class1");
		GlobalAnnotatedClass actual = rm.manyToOne(new GlobalClass(null, "field2Class1", "field3Class1"));
		assertEquals(expected, actual);
		
		expected = new GlobalAnnotatedClass("field1Class2", null, "field3Class2");
		actual = rm.manyToOne(new GlobalClass2("field1Class2", null, "field3Class2"));
		assertEquals(expected, actual);
		
		expected = new GlobalAnnotatedClass("field1Class3", "field2Class3", null);
		actual = rm.manyToOne(new GlobalClass3("field1Class3", "field2Class3", null));
		assertEquals(expected, actual);
		
		GlobalClass class1Expected = new GlobalClass(null, "field2Class1", "field3Class1");
		GlobalClass class1Actual = rm.oneToMany(GlobalClass.class,new GlobalAnnotatedClass(null, "field2Class1", "field3Class1"));
		assertEquals(class1Expected, class1Actual);
		
		GlobalClass2 class2Expected = new GlobalClass2("field1Class2", null, "field3Class2");
		GlobalClass2 class2Actual = rm.oneToMany(GlobalClass2.class,new GlobalAnnotatedClass("field1Class2", null, "field3Class2"));
		assertEquals(class2Expected, class2Actual);
		
		GlobalClass3 class3Expected = new GlobalClass3("field1Class3", "field2Class3", null);
		GlobalClass3 class3Actual = rm.oneToMany(GlobalClass3.class,new GlobalAnnotatedClass("field1Class3", "field2Class3", null));
		assertEquals(class3Expected, class3Actual);
	}
	
	public void testRelationalJMapperWithAnnotation(){
		RelationalJMapper<AnnotatedClass2> rm = new RelationalJMapper<AnnotatedClass2>(AnnotatedClass2.class);
		
		AnnotatedClass2 expected = new AnnotatedClass2(null, "field2Class1", "field3Class1");
		AnnotatedClass2 actual = rm.manyToOne(new Class1(null, "field2Class1", "field3Class1"));
		assertEquals(expected, actual);
		
		expected = new AnnotatedClass2("field1Class2", null, "field3Class2");
		actual = rm.manyToOne(new Class2("field1Class2", null, "field3Class2"));
		assertEquals(expected, actual);
		
		expected = new AnnotatedClass2("field1Class3", "field2Class3", null);
		actual = rm.manyToOne(new Class3("field1Class3", "field2Class3", null));
		assertEquals(expected, actual);
		
		Class1 class1Expected = new Class1(null, "field2Class1", "field3Class1");
		Class1 class1Actual = rm.oneToMany(Class1.class,new AnnotatedClass2(null, "field2Class1", "field3Class1"));
		assertEquals(class1Expected, class1Actual);
		
		Class2 class2Expected = new Class2("field1Class2", null, "field3Class2");
		Class2 class2Actual = rm.oneToMany(Class2.class,new AnnotatedClass2("field1Class2", null, "field3Class2"));
		assertEquals(class2Expected, class2Actual);
		
		Class3 class3Expected = new Class3("field1Class3", "field2Class3", null);
		Class3 class3Actual = rm.oneToMany(Class3.class,new AnnotatedClass2("field1Class3", "field2Class3", null));
		assertEquals(class3Expected, class3Actual);
	}
	
	public void testRelationalJMapperWithXML() throws IOException{
		
		String xmlPath = "file:" + FilesManager.searchFile("jmapper-test.xml").getCanonicalPath();
		
		RelationalJMapper<AnnotatedClass2> rm = new RelationalJMapper<AnnotatedClass2>(AnnotatedClass2.class,xmlPath);

		AnnotatedClass2 expected = new AnnotatedClass2(null, "field2Class1", "field3Class1");
		AnnotatedClass2 actual = rm.manyToOne(new Class1("field1Class1", "field2Class1", "field3Class1"));
		assertEquals(expected, actual);
		
		expected = new AnnotatedClass2("field1Class2",null, "field3Class2");
		actual = rm.manyToOne(new Class2("field1Class2", "field2Class2", "field3Class2"));
		assertEquals(expected, actual);
		
		expected = new AnnotatedClass2("field1Class3", "field2Class3", null);
		actual = rm.manyToOne(new Class3("field1Class3", "field2Class3", "field3Class3"));
		assertEquals(expected, actual);
		
		Class1 class1Expected = new Class1(null, "field2Class1", "field3Class1");
		Class1 class1Actual = rm.oneToMany(Class1.class,new AnnotatedClass2("field1Class1", "field2Class1", "field3Class1"));
		assertEquals(class1Expected, class1Actual);
		
		Class2 class2Expected = new Class2("field1Class2", null, "field3Class2");
		Class2 class2Actual = rm.oneToMany(Class2.class,new AnnotatedClass2("field1Class2", "field2Class2", "field3Class2"));
		assertEquals(class2Expected, class2Actual);
		
		Class3 class3Expected = new Class3("field1Class3", "field2Class3", null);
		Class3 class3Actual = rm.oneToMany(Class3.class,new AnnotatedClass2("field1Class3", "field2Class3", "field3Class3"));
		assertEquals(class3Expected, class3Actual);
	}
	
	
}


