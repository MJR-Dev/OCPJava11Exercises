package com.ocpcert.demo;

//This is used to demonstrate the primitive data types and conversion of one to another.
//Also shows the casting concept in case of widening/narrowing.
public class PrimitiveDataTypesConvCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Short.MAX_VALUE);
		short s = 32767;
		byte b = (byte) s;
		System.out.println(b);		
		
		int var1 = 1;
		byte b1 = (byte) var1;
		char c1 = (char)var1;
		short s1 = (short)var1;
		long l1 = var1;
		float f1 = var1;
		double d1 = var1;
		
		long var2 = 1000000L;
		int i2 = (int)var2;
		double d2 = var2;
		float f2 = var2;
		
		System.out.println("Int range:"+Integer.MIN_VALUE+"  "+Integer.MAX_VALUE);
		System.out.println("Long range:"+Long.MIN_VALUE+"  "+Long.MAX_VALUE);
		int var3=(int)Integer.MAX_VALUE+3;
		System.out.println("After inc by 3 "+var3);
		int j=2,k=3;
		System.out.println("##:"+ (k + + + j)+"::"+ (k + + +j));		
	}

}
