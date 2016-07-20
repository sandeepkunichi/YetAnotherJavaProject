/*
 * @(#)YetAnotherStringBuffer.java        1.00 15/12/31
 *
 */

/**
 *  
         YetAnotherStringBuffer class is a mock of the StringBuffer class with a mock-up implementation of append() and toString() methods. Note that this program was implemented within 30 minutes.
 *
 * @version      
         1.00 28 Dec 2015  * @author          
         Sandeep Kunichi  */

package com.main;

public class YetAnotherStringBuffer {
    /**  
    Character array to process and store the final String */
	char[] value;
	
    /** 
     * ...
         Default constructor */
	public YetAnotherStringBuffer(){

	}

    /** 
     * ...
         Constructor that builds the final character array with the input String parameter */
	public YetAnotherStringBuffer(String str){
		this.append(str);
	}
    /**
     * ...
         Method that takes in a String parameter as input and appends the value to the final output string */
	public YetAnotherStringBuffer append(String str){
		if( value != null){
			String previous = String.valueOf(value);
			value = new char[value.length + str.length()];
			previous.getChars(0, previous.length(), value, 0);
			str.getChars(0, str.length(), value, value.length - str.length());
		}else{
			value = new char[str.length()];
			str.getChars(0, str.length(), value, 0);
		}
		return this;
	}
	
    /**
     * ...
         Method converts the buffer character array to an output string */
	public String toString(){
		return String.valueOf(value);
	}
	
}
