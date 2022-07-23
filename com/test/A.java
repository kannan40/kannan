package com.test;

public class A {
	public static void main(String[] args) {
	String s = "KAn@nAn0123";
	//length
	int length = s.length();
	System.out.println(length);
	//toUpperCase
	String upperCase = s.toUpperCase();
	System.out.println(upperCase);
	//to Lower case
	String lowerCase = s.toLowerCase();
	System.out.println(lowerCase);
	//fetch letter index position
	char c = s.charAt(7);
	System.out.println(c);
	//UpperCase or not
	boolean b = Character.isUpperCase(c);
	System.out.println(b);
	//Lowercase or not
	boolean case1 = Character.isLowerCase(c);
	System.out.println(case1);
	//digit or not
	boolean digit = Character.isDigit(c);
	System.out.println(digit);
	//startswith
	boolean startsWith = s.startsWith("KAn");
	System.out.println(startsWith);
	//end with
	boolean endsWith = s.endsWith("KAn@nAn0123");
	System.out.println(endsWith);
	//replace
	String replace = s.replace('@', ' ');
	System.out.println(replace);
	//replace all
	String replaceAll = replace.replaceAll("KAn ", "kan");
	System.out.println(replaceAll);
	//remove all space
	String s1= "kannan linga rafi mohammed";
	String withoutSpace = s1.replaceAll("\\s", "");
	System.out.println(withoutSpace);
	//return index present at particular value
	int indexOf = s1.indexOf('f');
	System.out.println(indexOf);
	//last index 
	int lastIndexOf = s1.lastIndexOf('a');
	System.out.println(lastIndexOf);
	//equals
	boolean equals = s.equals(s1);
	System.out.println(equals);
	//find the space
//	String op = " ";
//	String di = " ";
//	
//	
//	for (int i = 0; i < s.length(); i++) {
//		char charAt = s.charAt(i);
//		if(Character.isAlphabetic(charAt)) {
//			op = op+charAt;	}
//	else {
//			di = di+charAt;
//		}
//	}
//	
//	System.out.println(op);
//	System.out.println(di);
//
//	}
	
//substring
 String substring = s1.substring(4, 11);
 System.out.println(substring);
//
 String substring2 = s1.substring(4);
 System.out.println(substring2);
 //contain
 boolean d = s1.contains("kan");
 System.out.println(d);
//compare in int
 int compareTo = s.compareTo(s1);
 System.out.println(compareTo);
//value
 int compareToIgnoreCase = s.compareToIgnoreCase(s1);
 System.out.println(compareToIgnoreCase);
//values of letters
// A-Z-->65 to 90
// a-z--->97 to 122
// 0-9-->48 to 57
 
 
	
		
		
		
		
		
		
		
		
		
	}
}
