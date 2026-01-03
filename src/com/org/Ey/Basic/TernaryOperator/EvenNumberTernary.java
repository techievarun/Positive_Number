package com.org.Ey.Basic.TernaryOperator;

import java.util.Scanner;

public class EvenNumberTernary {
	
	public static String EvenNumber(int num) {
		int n=num;
		String op=(n%2==0)? "even number":" odd Number";
		return op;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan= new Scanner(System.in);
   System.out.println("enter a number");
   int val=scan.nextInt();
   System.out.println("given number is :"+EvenNumber(val));
   
	}

}
