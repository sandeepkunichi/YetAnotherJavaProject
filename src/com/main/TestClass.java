package com.main;

import junit.framework.TestCase;
import org.junit.Test;

public class TestClass extends TestCase {

	   protected String inputString;
	   protected int inputInteger;
	   protected Object inputNull;
	   
	   //Assign the input values required for the test methods
	   protected void setUp(){
		   inputString ="Hello World";
		   inputInteger = 123;
		   inputNull = null;
	   }

	   //Test method to check constructor with String
	   @Test
	   public void testStringConstructor() {
		   MyStringBuffer msb =new MyStringBuffer(inputString);
		   String actualResult = msb.toString();
		   String expectedResult = inputString;
	      assertEquals(expectedResult, actualResult);
	   }
	   
	   //Test method to check default action of append method
	   @Test
	   public void testDefaultAppend() {
		   MyStringBuffer msb =new MyStringBuffer();
		   msb.append(inputString);
		   String actualResult = msb.toString();
		   String expectedResult = inputString;
	      assertEquals(expectedResult, actualResult);
	   }
	   
	   //Test method to check action of append method with integer value as input
	   @Test
	   public void testIntegerAppend() {
		   //String inputString = "Hello World";
		   MyStringBuffer msb =new MyStringBuffer(inputString);
		   msb.append(inputInteger);
		   String actualResult = msb.toString();
		   String expectedResult = inputString + inputInteger;
	      assertEquals(expectedResult, actualResult);
	   }
	   
	   //Test method to check action of append method with null value as input
	   @Test
	   public void testNullAppend() {
		   MyStringBuffer msb =new MyStringBuffer(inputString);
		   msb.append(null);
		   String actualResult = msb.toString();
		   String expectedResult = inputString + String.valueOf(inputNull);
	      assertEquals(expectedResult, actualResult);
	   }
	}
