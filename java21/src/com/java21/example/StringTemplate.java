package com.java21.example;


/**
 * @author Kashif Ur Rehman
 * 
 * 
 * Preview features :- means that feature is complete, but not permanent, may be in future version it can be retained or remove. but it is important
 * String Templates  (it is a preview feature) :- Before Java 21, we use string concatenation to combine two strings, but now we can use StringTemplate (Now we can directly pass the expression into 
 * string ). String templates containing embedded expressions (evaluated at runtime). New string contains variables, methods, or fields commuted at runtime.
 */
public class StringTemplate {

	public static void main(String[] args) {
		
		System.out.println("Program Started");
		
		int a = 45;
		int b = 10;
		
		System.out.println(STR."value of a is \{a}"); // By default this line will show compilation error because it is a preview feature in java 21
		System.out.println(STR."value of b is \{b}"); // By default this line will show compilation error because it is a preview feature in java 21
		
		String title = "Contact Page";
		String heading = "Welcome to programing world";
		String body = "Hello , please do subscribe this channel";
		
		String html = STR."""
				
				<html>
					<head>
						<title>
							\{title}
						</title>
					</head>
					
					<body>
						<heading> \{heading} </heading>
						<p>\{body}</p>
					</body>
				</html>
						
				""";

		System.out.println(html);
	}

}
