/*
Recursion in java is a process in which a method calls itself continuously.
 A method in java that calls itself is called recursive method.
It makes the code compact but complex to understand.
*/

package day_8_Logical_Programs;

public class Recursion {

	public static void main(String[] args) {
			printNum(1);
			printNum(1, 100);
	}

	//Print from 1 to 100
	public static void printNum(int num) {
		
		if(num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
	
	//Print numbers between any two specific ranges
  public static void printNum(int stNumD, int edNum) {
	  System.out.println("Print no between ranges -- >");
		
		if(stNumD<=edNum) {
			System.out.println(stNumD);
			stNumD++;
			printNum(stNumD, edNum);
		}
	}
}

