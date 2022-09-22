package com.Testing;

import java.util.Scanner;

import javax.swing.*;

public class Testing_102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the first number");
		double F = sc.nextDouble();
		System.out.println("Input the second number");
		double S = sc.nextDouble();
		System.out.println("Input operation");
		String op = sc.next();
		double Ans;
		
		if(op =="add" || op == "Add" || op =="+") {
			 Ans = F + S ; 
			 System.out.println(Ans);
		}else  {
			 Ans = F - S;
			 System.out.println(Ans);
		}
		
		
		
	}

}
