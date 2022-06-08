/*
 * create com.cashapona.datatypes on 02-jun-2022
 */
package com.cashapona.datatypes.jun02;
/**
 * @author Anuradha
 * create class DatatypeConvertions for convertDoubleToInt(),convertIntToDouble(),convertIntToString(),convertStringToInt()
  */
public class DatatypeConvertions {
	static void convertDoubleToInt() {
		//create double type variable
		double d=123.9;
		System.out.println("double value : "+d);
		//converting double into int
		int i=(int)d;
		System.out.println("After converting double to int  : "+i);
	}
	static void convertIntToDouble() {
		//create int type variable
		int number=23;
		System.out.println("int value : "+number);
		//convert int to double
		double d=number;
		System.out.println("After converting int to double  : "+d);
	}
	static void convertIntToString() {
		//create int type variable
		int number=45;
		System.out.println("int value : "+number);
		//convert int to string
		String string=String.valueOf(number);
		System.out.println("After converting  int to String : "+string);
	}
	static void convertStringToInt() {
		String string="3845";
		System.out.println("string value : "+string);
		//convert string to int
		int number=Integer.parseInt(string);
		System.out.println("After converting String to int : "+number);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		convertDoubleToInt();
		convertIntToDouble();
		convertIntToString();
		convertStringToInt();
	}
}
