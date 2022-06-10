package com.syntax.classReview3;

public class IfElse {

	public static void main(String[] args) {
		
		
		String user="Nelson";
		String password="pass123";
		//whenever we us a primitive data types like byte, short, int ,long, float, double, char, boolean
		// we use ==
		//whenever we use non-primitive data types we use .equals method
		if(user.equals("Nelson")&&password.equals("pass123")) {
			System.out.println("Welcome back to Syntax");
		}else {
			System.out.println("username or password id not correct");
		}
		//when Debugging make sure
		//you have not disabled the breakpoint
		//you have not enabled the skip all the breakpoints option in debug window
	}

}
