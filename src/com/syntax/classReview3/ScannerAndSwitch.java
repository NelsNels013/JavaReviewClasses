package com.syntax.classReview3;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the name of the country");
		String country=input.nextLine();
		String capital;
		switch(country) {
		case "Turkey":
			capital="Ankara";
			break;
		case "USA":
			capital="DC";
			break;
		case "Serbia":
			capital="Begrade";
			break;
		case "Albania":
			capital="Tirana";
			break;
		case "Afghanistan":
			capital="Kabul";
			break;
		case "Pakistan":
			capital="Islamabad";
			break;
		default:
			capital="Either country name is included correct or its not a country";
		}
		
		System.out.println(capital);

	}

}
