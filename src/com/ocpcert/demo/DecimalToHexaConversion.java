package com.ocpcert.demo;

import java.util.Scanner;

public class DecimalToHexaConversion {

	static byte b1;
	static short s1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();		
		convertDecToHex(input);
		sc.close();
		
	}

	public static void convertDecToHex(String intput) {
		long ip = Long.parseLong(intput);
		int rem=0, quo = 0;
		StringBuffer hex =new StringBuffer();
		if(ip == -1)
			System.out.println("Invalid numeric value. Cannot be converted to haxadecimal");
		else {
			do {
				quo = (int) ip/16;
				System.out.println("quo:"+quo);
				rem = (int) ip%16;
				System.out.println("rem:"+rem);
				hex = hex.insert(0, returnHexCode(rem));
				System.out.println("hex"+ returnHexCode(rem));
				ip = quo;
			}while(quo > 0);
		}
		System.out.println("Hexadecimal value:"+hex.toString());	
		}
	
	public static String returnHexCode(int rem) {
		switch (rem) {
        case 0:
           return "0";
        case 1:
            return "1";
         case 2:
            return "2";
         case 3:
            return "3";
         case 4:
            return "4";
         case 5:
            return "5";
         case 6:
            return "6";
         case 7:
            return "7";
         case 8:
            return "8";
         case 9:
            return "9";
         case 10:             
            return "A";
         case 11:
            return "B";
         case 12:
            return "C";
         case 13:
            return "D";
         case 14:
            return "E";
         case 15:
            return "F";
         default:
            return "-1";
     }
	}
}
