package day_8_Logical_Programs;

import java.util.Arrays;
import java.util.Scanner;
public class AnagramProgram {
	
	
	public static boolean isAnagram(String str1, String str2) {
		
		if(str1.length() != str2.length()) 
			return false;
		else {
			char[] str1Array = str1.toCharArray();
			char[] str2Array = str2.toCharArray();		
			
			Arrays.sort(str1Array);
			Arrays.sort(str2Array);
           return Arrays.equals(str1Array,str2Array);
		}
	}
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		str1= str1.replaceAll("\\s", "").toLowerCase();
		str2= str2.replaceAll("\\s", "").toLowerCase();

	if(isAnagram(str1, str2)) {
		System.out.println(str1 + str2 + " Are Anagram"); 
	}
	else {
		System.out.println(str1 +"  " + str2 + " Are Not Anagram"); 
	}
	
	}
	
}