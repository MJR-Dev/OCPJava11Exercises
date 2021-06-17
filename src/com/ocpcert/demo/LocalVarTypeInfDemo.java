package com.ocpcert.demo;

import java.util.ArrayList;
import java.util.HashMap;

public class LocalVarTypeInfDemo {

	//cannot use 'var' for static class variables declaration
	//static var staticVar = 10;
	//cannot use 'var' for class instance variables declaration
	//var instanceVar = "hello";
	static float tax_rate = 0.06F;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Local variable type inference is where the compiler can figure out
		//the static types for you so you don’t have to type them.
		var i = 10;
		System.out.println("i::"+((Object)i).getClass().getSimpleName());
		
		//Allowed to use var as variable name itself.
		//var var = new String[4];
		//System.out.println("var1::"+((Object)var).getClass().getSimpleName());
		
		var var1 = new HashMap<String,Integer>();
		System.out.println("var::"+((Object)var1).getClass().getSimpleName());
		
		//Allowed to be used for 'for'loop as the compiler infers the type to be int
		for(var var2 = 0; var2 < 3; var2++ ) {
			System.out.println("var2 count :"+var2);
		}
		
		//Allowed to be used for advanced 'for' loop as the args in method is passed as String[].
		//So the compiler infers the type to be of String type
		for(var var4 : args) {
			System.out.println("var4: "+var4);
		}
		
		//Here the inferred type for var4 is int not short. the '+' operator promotes the value
		//to int.
		short var3 = 1;
		var var4 = +var3; 
		
		//Allowed as the ArrayList need not be initialized
		var var5 = new ArrayList<>();		
		
		lvtiTest();
		//valid scenario
		//var var = new ArrayList<String>(Arrays.asList("A","KJD","EJKF","KJSEF"));
		//var(var);
		
		//Cannot use 'var' for type declaration
		//var x = var;
		//Cannot use 'var' without initializing the variable. it will throw compiler error
		//var x;
		//Cannot initialize the 'var' to null as compiler cannot infer the type.
		//var y = null;
		//'var' cannot be used in a compound declaration
		//var v1 = 0, v2 = 0;		
		//var v1, v2 = 0;
		//Cannot use array initializer as it requires explicit target-type
		//var v3 = {"A","B"};
		//'var' is not allowed as an element type of an array
		//var[] v4 = new int[3];
		
	}

	public static void var(ArrayList<String> a1) {
		var var = a1;
		for(var x : var) {
			System.out.println("var x:"+x);
		}
	}
	
	//question from Cert Exam point of view
	public static void lvtiTest() {
		var result = 0;  //int
		var tax_rate = 0.05;  //double
		var price = 100; //int
		var adjusted_tax = price * tax_rate; //double (5.0)
		System.out.println("adjusted tax value :"+adjusted_tax);
		//Compiler error as double is converted to int
		//result = price + adjusted_tax;
		//Implicit casting will reduce the type to int
		result = (int) (price + adjusted_tax);
		System.out.println("Adjusted price :"+result);
	}
	
	//Cannot use 'var' for method return type
	/*public static var method1(String s1) {
		return s1;
	}
	
	//Cannot use 'var' for method parameters
	public Map<String,Integer> method2(var s2){
		return new HashMap<String,Integer>();
	}*/
}
