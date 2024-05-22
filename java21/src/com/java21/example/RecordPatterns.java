package com.java21.example;

/**
 * @author Kashif Ur Rehman
 * 
 * Record Pattern (This is also permanent feature i.e. not a provisional feature) : - Immutable carrier of data like POJO.
 * 
 * 
 * 
 * Before this feature it was like :- 
 * 
 * 
 * record point(int x , int y) { } 
 * 
 * if(obj instanceof Point p) {
 * 
 * 	int x = p.x();
 * 	int y = p.y();
 * 	System.out.println(x + y);
 * 
 * }
 * 
 * 
 * 
 * 
 * BUT now after  this feature it will become as :-
 * 
 *  if (obj instanceof Point(int x, int y)) {
 *  
 *  	System.out.println(x + y);
 *  
 *  } 
 * 
 * 
 */

record User(int userId, String name) {}

public class RecordPatterns {
	
	public void testing(Object ob) {
		
		if (ob instanceof User(int userId, String name)) {
			
			System.out.println("User Id " + userId);
			
			System.out.println("Username " + name);
		
		}
	}
	

	public static void main(String[] args) {
		
		RecordPatterns recordPatterns = new RecordPatterns();
		
		recordPatterns.testing(new User (1341, "Kashif"));

	}
	
	// Also used in switch statement not only if
	
	public void print(Object o) {
		
		switch(o) {
		
		case User(int x, String y) -> 	System.out.println("o is a record %d%d%d");
		
		case String s -> 	System.out.println("o is a String  %s%n");
		
		
		default	-> 	System.out.println("o is a something else %s%n");
		
		}
		
	}
	

}
