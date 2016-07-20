package com.main;

public class MainClass {
	public static void main(String[] args){
		MyStringBuffer sb = new MyStringBuffer();
		sb.append("Hey");
		sb.append(null);
		sb.append(909);
		System.out.println(sb.toString());
		
		//YetAnotherStringBuffer - Programming the class within the given time of 30 minutes
		//This class does append() only for String parameters
		YetAnotherStringBuffer yasb = new YetAnotherStringBuffer();
		yasb.append("Hello");
		yasb.append("World");
		System.out.println(yasb.toString());
	}
}
