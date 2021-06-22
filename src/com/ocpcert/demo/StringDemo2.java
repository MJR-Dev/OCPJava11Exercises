package com.ocpcert.demo;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Normal String concatenation
		String s1 = "Sample for";
		String s2 = "OCP Java 11 Cert";
		System.out.println("s1 + s2 :: "+s1+" "+s2);
		//Null object concatenated with a String
		Object o1 = null;
		String s3 = "with Sample String";
		System.out.println("o1 + s3 :: "+o1+" "+s3);
		//Primitive data type concatenated with a String
		int i = 20;
		String s4 = " : PDT int value with Sample String";
		System.out.println("i + s4 :: "+i+s4);
		//Primitive data type with + operator and String - observe the operator precedence.
		//Before the String enclosed in double quotes, the operator + has higher precedence.
		//After the double quotes, the + operator is taken as concatenation operator.
		int j = 35;
		String s5 = i + j +" "+ i + j;
		System.out.println("s5 :: "+s5);
		
		String s6 = ""+ i + j +" "+ i + j;
		System.out.println("s6 :: "+s6);
		//When using + operator, enclosing parenthesis around the operands/operator will give the
		//mathematical result
		String s7 = ""+ (i + j) +"="+ (i + j);
		System.out.println("s7 :: "+s7);
		//When using compound+ operator, on the LHS, if the object is a string, concatenation works fine.
		String s8 = "Demo String";
		s8 += i ;
		System.out.println("s8 with compound + operator of with int :: "+s8);
		//When using compound+ operator, on the LHS, if the object is a Primitive data type, 
		//concatenation does not works.The compiler expects String object on LHS.
		//i += s8;
		
	}

}
