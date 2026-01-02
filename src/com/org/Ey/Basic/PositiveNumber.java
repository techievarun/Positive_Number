package com.org.Ey.Basic;

import java.util.Scanner;

public class PositiveNumber {
	public static String  posNumber(int num) {
		int n=num;
		if(n>=0) {
			return "positive Number";
					
		}
		else {
			return "negative Number";
					
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println("please enter a number");
      int val=scan.nextInt();
      System.out.println("given number is"+" "+posNumber(val));
	}

}
