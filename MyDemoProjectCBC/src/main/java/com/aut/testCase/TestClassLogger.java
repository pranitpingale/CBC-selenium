package com.aut.testCase;

import org.testng.annotations.Test;

import com.aut.utilities.Log4J;
//import com.aut.utility.Log;

public class TestClassLogger {
@Test
	public void testcase1() {
		
		Log4J.startTestCase("testcase1");
		Log4J.info("This is testcase1");
		Log4J.endTestCase("testcase1");
		
	}
@Test	
public void testcase2() {
		
	Log4J.startTestCase("testcase2");
	Log4J.info("This is testcase2");
	Log4J.endTestCase("testcase2");
		
	}
@Test
public void testcase3() {
	
	Log4J.startTestCase("testcase3");
	Log4J.info("This is testcase3");
	Log4J.endTestCase("testcase3");
	
}

}
