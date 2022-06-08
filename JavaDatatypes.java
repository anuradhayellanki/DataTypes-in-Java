/*
 * create com.cashapona.datatypes on 02-jun-2022
 */
package com.cashapona.datatypes.jun02;
/**
 * @author Anuardha
 * create class Cashapona
 */
class Cashapona{
	/*
	 * String is non-primitive data type.
	 * declared empId,name,designation as String datatype		
	 */
	String empId,name,designation;
	/*
	 * int,double are primitive datatypes
	 * declared age as int and salary as double
	 */
	int age;
	double salary;
	Cashapona(String empId, String name, String designation, int age,double salary){
		this.empId=empId;
		this.name=name;
		this.designation=designation;
		this.age=age;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Cashapona [empId = " + empId + ", name = " + name + ", designation = " + designation + ", age = " + age+ ", salary = " + salary + "]";
	}
}
public class JavaDatatypes {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("-----------------------Employee details-------------------");
		Cashapona emp1=new Cashapona("A101","Anuradha","Software TRainee",39,12000);
		Cashapona emp2=new Cashapona("P102","Prasanti","Software TRainee",26,12000);
		Cashapona emp3=new Cashapona("T103","Rangadu","Software TRainee",24,16000);
		Cashapona emp4=new Cashapona("T104","Teja","Software TRainee",24,160000);
		Cashapona emp5=new Cashapona("123","Sunil","Software Developer",29,35000);
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		System.out.println(emp5);
		}
}
