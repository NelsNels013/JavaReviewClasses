package com.syntax.classreview2;

import java.util.Scanner;

public class IfElseDemo3 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter Your Account Balance");
		double accountBalance=scanner.nextDouble();
		System.out.println("Please enter the amount that you want to lend your friend");
		double amountToLend=scanner.nextDouble();
		
		if(accountBalance>=amountToLend) {
			System.out.println("Yes i can help you");
		}else {
			System.out.println("Sorry i dont have enough money to help you");
		}
		

	}

}
