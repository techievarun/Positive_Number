package com.org.Ey.Basic.TernaryOperator;

import java.util.Scanner;

public class PositiveNumberTernaryOperator {
 
	public static String posNumber(int num) {
		int n=num;
		String output=(n>=0)? "positive number": "negative number";
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan= new Scanner(System.in);
    System.out.println("please enter a number");
    int val=scan.nextInt();
    System.out.println("given number is :"+" "+posNumber(val));
	}

}
