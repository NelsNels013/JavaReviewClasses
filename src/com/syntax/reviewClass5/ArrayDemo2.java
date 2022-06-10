package com.syntax.reviewClass5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		String[] names=new String[5]; //creates an empty array of size 5 to store String type values
		/*
*		names[0]="Ahmed";
*		names[1]="Kaiser";
*		names[2]="Abdulsamd";
*		names[3]="Zameer";
*    	names[4]="Elisa";
*/
		//names[5]="error";
		Scanner scan=new Scanner(System.in);
		/*
		names[0]=scan.next();
		names[1]=scan.next();
		names[2]=scan.next();
		names[3]=scan.next();
		names[4]=scan.next();
		*/
		
		for(int i=0; i<names.length; i++) {
			names[i]=scan.next();
		}
		
		System.out.println(Arrays.toString(names));
	}

}
