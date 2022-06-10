package com.syntax.classreview2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);	
		
		System.out.println("Please enter your age");
		int age=scanner.nextInt(); //user enters the number plus and hits the enter key
		
		scanner.nextLine(); // consumes the enter that user pressed after the number
		
		System.out.println("Please enter your name");
		String name=scanner.nextLine();
		
		System.out.println(age+name);

	}

}
