package Day7_Arrays;

import java.util.Arrays;

public class FruitsList {
	

	public static void main (String[] args) {
		
		String[] fruitsList = {"Apple", "Mango", "Guava", "PineApple", "Strawberry" };
		
				System.out.println("Length is "+fruitsList.length);
		System.out.println("Last value in the array is "+fruitsList[fruitsList.length-1]);
		
		
		
		//Using Arrays.toString
		System.out.println( "Using Arrays.toString Method " +Arrays.toString(fruitsList)) ; 
	}

}
