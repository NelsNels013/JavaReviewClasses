package com.syntax.reviewClass5;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=input.nextInt(); //ask for the size of array
		String[] names=new String[size]; // an array of Strings of that size is created
		
		for(int i=0; i<names.length; i++) {
			names[i]=input.next(); //fill the array with  the input from the user
		}
		
		System.out.println(Arrays.toString(names)); //print the contents of array

	}

}
