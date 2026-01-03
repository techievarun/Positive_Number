package com.org.Ey.Basic;

import java.util.Scanner;

public class EvenNumber {

	public static String oddNumber(int num) {
		int n=num;
		if(n%2==0) {
			return "Even Number";
		}
		else {
			return " Odd Number";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    System.out.println("enter a number ");
    int val=scan.nextInt();
    System.out.println("given number is :"+oddNumber(val));
    
	}

}
