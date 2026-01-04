package com.org.Ey.Basic.TernaryOperator;

import java.util.Scanner;

public class NthTerm {
	public static int  sumOfNthTerm(int num) {
		int n=num;
		int output=(n*(n+1)/2);
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println("enter a number");
      int val=scan.nextInt();
      System.out.println("sum of Nth term is:"+" "+sumOfNthTerm(val));
      
      
	}

}
