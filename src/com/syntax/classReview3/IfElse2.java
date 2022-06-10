package com.syntax.classReview3;

public class IfElse2 {

	public static void main(String[] args) {
		
		//when code executes but does not produce expected results we call these mistakes logical errors
		//when code does not even execute we call these mistakes syntax errors
		
		String day="Friday"; // in non-primitive type variables we can store null which means nothing
		if(day.equals("Monday")) {
			System.out.println("weekday");
		}else if("Tuesday".equals(day)) {
			System.out.println("weekday");
		}else if("Wednesday".equals(day)) {
			System.out.println("weekday");
		}else if("Thursday".equals(day)) {
			System.out.println("weekday");
		}else if("Friday".equals(day)) {
			System.out.println("weekday");
		}else if("Saturday".equals(day)) {
			System.out.println("weekday");
		}else if("Sunday".equals(day)) {
			System.out.println("weekday");
		}
		
		
		
		if(day.equals("Monday")) {
			System.out.println("weekday");
		}
		
		if("Tuesday".equals(day)) {
			System.out.println("weekday");
		}
		
		if("Wednesday".equals(day)) {
			System.out.println("weekday");
		}
		
		if("Thursday".equals(day)) {
			System.out.println("weekday");
		}
		
		if("Friday".equals(day)) {
			System.out.println("weekday");
		}
		
		if("Saturday".equals(day)) {
			System.out.println("weekday");
		}
		
		if("Sunday".equals(day)) {
			System.out.println("weekday");
		}
		
		if(day.equals("Monday")||"Tuesday".equals(day)||"Wednesday".equals(day)||"Thursday".equals(day)||
		"Friday".equals(day)||"Saturday".equals(day)||"Sunday".equals(day)) {
			System.out.println("weekday");
		}else if("Saturday".equals(day)||"Sunday".equals(day)) {
			System.out.println("weekend");
		}
		// if we have to test multiple conditions we go with if else if conditions

	}

}
