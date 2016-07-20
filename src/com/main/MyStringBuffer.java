/*
 * @(#)MyStringBuffer.java        1.00 15/12/28
 *
 */

package com.main;

/**
 *  
         MyStringBuffer class is a mock of the StringBuffer class with a mock-up implementation of append() and toString() methods
 *
 * @version      
         1.00 28 Dec 2015  * @author          
         Sandeep Kunichi  */
public class MyStringBuffer {

    /**  
    Character array to process and store the final String */
	char[] value;

    /**  
    String that has the value of previously appended characters to the final value*/
	String previous;

	/**  
    Integer that keeps an incremental count of the length of the strings to be appended */
	int count;

    /**  
    Integer that denotes the current or maximum capacity of the final value */
	int capacity = 0;

    /** 
     * ...
         Default constructor */
	public MyStringBuffer(){

	}

    /** 
     * ...
         Constructor that builds the final character array with the input String parameter */
	public MyStringBuffer(String str){
		this.append(str);
	}

    /**
     * ...
         Method that takes in a String parameter as input and appends the value to the final output string */
	public MyStringBuffer append(String str) {
		if (str == null) str = "null"; //null is referenced as a string
		int len = str.length(); //Use the length of the string to append as the 
		increaseCapacity(len); //Increase the capacity of the resultant value by the length of the new string to append
		str.getChars(0, len, value, count); //Prepare the character array with the new string values
		if(previous != null){
			prePopulate(previous.length()); //Prepare the value char array with the previously appended characters
		}
		count += len;//Increment count by length for future appends
		return this;
	}

    /**
     * ...
         Method that takes in an Integer parameter as input and appends the value to the final output string */
	public MyStringBuffer append(int str){
		this.append(String.valueOf(str));
		return this;
	}

    /**
     * ...
         Method converts the buffer character array to an output string */
	public String toString(){
		return String.valueOf(this.value);
	}

    /**
     * ...
         Method that pre-populates the output String with previously appended values */
	private void prePopulate(int length){
		previous.getChars(0, length, value, 0);
	}

    /**
     * ...
         Method that expands the capacity of the buffer character array with the length of the input String */
	private void increaseCapacity(int len){
		capacity+=len;
		previous = (value != null) ? String.valueOf(value) : null;
		value = new char[capacity];
	}

}
