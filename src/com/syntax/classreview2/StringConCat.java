package com.syntax.classreview2;

public class StringConCat {

	public static void main(String[] args) {
		
		String firstName="Ali";
		String lastName="Baba";
		String fullName=firstName+lastName;
		int num=10;
		int num2=10;
		System.out.println(fullName);
		System.out.println(firstName+num);
		System.out.println(firstName+num+num2); //1st operation=firstName+num=>Ali1010
		System.out.println(firstName+(num+num2)); //1st operation=(num+num2)=>Ali+20=Ali20
		System.out.println(num+firstName+num2); //10+Ali=>10Ali10+10=>10Ali10

	}

}
