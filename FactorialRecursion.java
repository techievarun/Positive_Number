package com.org.Ey.Basic.Recursion;

import java.util.Scanner;

public class FactorialRecursion {
	public static int fact(int n) {
		int a=n;
		if(n==1) {
		 return 1;
		}
		int x=a*fact(a-1);
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println("enter a given number");
      int val=scan.nextInt();
      System.out.println("factorial of given number :"+" "+fact(val));
      
	}

}
