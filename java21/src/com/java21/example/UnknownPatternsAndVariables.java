package com.java21.example;

/**
 * @author Kashif Ur Rehman
 * 
 * Unnamed Patterns and Variables = Now we can skip name of variable if there is no use in future. Example is try -> catch scenario where now it will become as catch(Exception _)
 * 
 */

public class UnknownPatternsAndVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			double d = 100/0;
			System.out.println(d);
			
		} catch(Exception _) { // if some variable is not being used we can skip like this
			System.out.println("Error");
		}
	}

}
