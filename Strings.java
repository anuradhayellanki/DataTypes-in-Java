/*
 * create com.cashapona.datatypes on 02-jun-2022
 */
package com.cashapona.datatypes.jun02;
/**
 * @author Anuradha
 * create class Strings, String objects are immutable
 */
public class Strings {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// string object created by using constructor of string.
		// strings are immutable in java.
		String s1=new String("anuradha");
		String s2=new String("anuradha");
		String s3=new String("yellanki");
		// string object created by using string literal
		String s="anu";
		String s4="anu";
		//String methods
		//1. concat() value is not assigning to any object, so automatically it is removed by Garbage collector 
		s.concat(s1);
		System.out.println("After concatination not assigning to any variable : "+s);
		s=s.concat(s1);
		System.out.println("After concatination ,assigning to variable : "+s);
		//2. str==str1 Referencce comparision only
		System.out.println();
		System.out.println("String s==s2  : "+(s==s2));   //prints false
		System.out.println("String s==s3  : "+(s==s3));   //prints false
		System.out.println("String s==s4  : "+(s==s4));   //prints false
		//3.str.equals(str1) refers content comparision
		System.out.println();
		System.out.println(" In Strings , equals() method is for comparision of two strings : " +(s1.equals(s2)));
		System.out.println("String s1.equals(s)  : "+(s1.equals(s)));
		System.out.println("String s.equals(s4)  : "+(s.equals(s4)));
		System.out.println("String s1.equals(s2)  : "+(s1.equals(s2)));
		//4.charAt(posi), 
		System.out.println();
		System.out.println("String s : "+s);
		System.out.println("charAt() , display 3rd position in s : "+s.charAt(3));
		//5.trim(), removes blank spaces
		System.out.println();
		String string="    anu radha   ";
		System.out.println("trim() , Removes blank spaces : "+string.trim());
		//6.length(), it prints length of a string
		System.out.println();
		System.out.println("length() returns length of string  : "+string.length()); 
		//7.trim().length() returns length of stirng with spaces remove first and end spaces
		System.out.println();
		System.out.println("trim().length() returns length of string with spaces removes first and end space : "+string.trim().length()); //after removing first & end spaces,print length of string as 9 
		//8.isEmpty, if string empty prints true otherwise false
		System.out.println();
		String string1="";
		System.out.println("Check whether the string is empty or not : "+string1.isEmpty());
		//9.replace(old value,new value) , replace old value with new value
		System.out.println();
		System.out.println("String : "+string);
		System.out.println("in string replace anu with aasha : "+string.replace("anu","aasha"));
		//10.substring(start index,end index), form new string from 2nd charactor to 5th 
		System.out.println();
		System.out.println("substring(2,5) : "+string.substring(2,5));
		//11.contains, prints boolean value
		System.out.println();
		System.out.println("contains(anu) : "+string.contains("anu"));
		//12.toUpperCase(), converts lower case letters to uppercase
		System.out.println();
		System.out.println("string : "+string);
		System.out.println("toUpperCase() : "+string.toUpperCase());
		}
	}

