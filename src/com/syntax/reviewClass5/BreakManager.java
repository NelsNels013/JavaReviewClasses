package com.syntax.reviewClass5;

public class BreakManager {

	public static void main(String[] args) {
		
	
		int i=0;
		while(i<5) {
			if(i>2) {
				continue;
			}
			System.out.println("Zameer is fired");
			i++;
		}
		
		System.out.println("We are done looping");

	}

}
