package com.ocpcert.demo;

public class StringDemo1 {

	public static void main(String[] args) {
		//Different ways to create String using int[], byte[], char[]
		int alpha_leng = 26;
		char[] charArray = new char[alpha_leng];
		int[] intArray = new int[alpha_leng];
		byte[] byteArray = new byte[alpha_leng];
		int i=0;
		for(char c = 'A'; c <= 'Z'; c++) {
			charArray[i] = c;
			intArray[i] = (int)c;
			byteArray[i] = (byte)c;
			i++;
		}
		String s1 = new String(charArray);
		System.out.println("charArray::"+s1);
		
		String s2 = new String(byteArray);
		System.out.println("byteArray::"+s2);
		
		String s3 = new String(intArray, 0, intArray.length);
		System.out.println("intArray::"+s3);
		
		//when assigning char[] to String using offset, the third parameter needs to be
		//(char[].length-offset) value else it will give ArrayIndexOutOfBoundsException
		String s4 = new String(charArray, 1, charArray.length - 1);
		System.out.println("charArray with offset 1::"+s4);
		
		//when assigning byte[] to String using offset, we can use fourth parameter for
		//mentioning encoding identifier. For eg, 'java.nio.charset.StandardCharsets.ISO_8859_1'
		String s5 = new String(byteArray, 2, 8);
		System.out.println("byteArray with offset 2::"+s5);
	}

}
