package com.syntax.reviewClass5;

public class ArraysDemo {

	public static void main(String[] args) {
		
		//should create an array
		String name="Oleg";
		String name2="King";
		String name3="Mumtaz";
		
		//should not create an array
		
		String city="New York";
		String country="USA";
		String continent="America";
		//only use 5% of the time
		String[] names= {"Oleg", "king", "Mumtaz"};
		
		//95% of the times you guys will use this approach
		String[] names2=new String[3];
		names2[0]="Olege"; //stores oleg on first position
		names2[1]="King";
		names2[2]="Mumtaz";

	}

}
