package com.ocpcert.demo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The string literals are created in String Pool area so both the reference variables
		//point to the same literal in the pool.
		String s1 = "hello";
		String s2 = "hello";
		System.out.println("s1==s2::"+(s1==s2));
		
		//Here we are using new operator. so instead of creating literal in String Pool,
		//objects are created in the Heap memory. So both ref var point to diff memory locations
		String s3 = new String("world");
		String s4 = new String("world");
		System.out.println("s3==s4::"+(s3==s4));
		
		//The intern method checks if a literal exists in String Pool and if so, makes the
		//reference variables point to the same literal when invoked
		String s5 = new String("Welcome").intern();
		String s6 = new String("Welcome").intern();
		System.out.println("s5==s6::"+(s5==s6));
	}

}
