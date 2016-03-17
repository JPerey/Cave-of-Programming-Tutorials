package com.polyesterprogrammer.RegularExpressionPractice;

import java.util.regex.*;

public class RegexPracticeMain {
	public static void main(String[] args) {
		
		 String longString = " Derek Banas CA 12345 AK PO 1-(412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-1234 ";
         String strangeString = " 1Z aaa **** *** {{{ {{ { ";
         //if you want to search for a particular something --> put it in a Bracket []
         
         
         //gonna look fo a word that is 2 to 20characters in length --> [A-Z-a-z]{2,20}
         //this should be what i need to search for R in my program regexChecker("\\s[R]{1}", longString);
         //regexChecker("([0-9]( |-)?)?(\\(?[0-9]{3}\\)?|[0-9]{3})( |-)?([0-9]{3}( |-)?[0-9]{4}|[a-zA-Z0-9]{7})", longString); // HOLY SHIT!!!!
         //regexChecker();
         
         regexReplace(longString);


	}
	
	public static void regexChecker(String theRegex, String str2Check){
		Pattern checkRegex = Pattern.compile(theRegex);
		
		Matcher regexMatcher = checkRegex.matcher(str2Check);
		
		while(regexMatcher.find()){
			if(regexMatcher.group().length() != 0){
				System.out.println(regexMatcher.group().trim());
			}
			System.out.println("Start index: " + regexMatcher.start());
			System.out.println("End index: " + regexMatcher.end());
		}
	}
	
	public static void regexReplace(String str2Replace){
		
		Pattern replace = Pattern.compile("\\s+");
		
		Matcher regexMatcher = replace.matcher(str2Replace.trim());
		System.out.println(regexMatcher.replaceAll(","));
	}
}
