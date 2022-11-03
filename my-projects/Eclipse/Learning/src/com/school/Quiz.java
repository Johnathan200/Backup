package com.school;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		answers a = new answers();
		Questions Q = new Questions();
		Q.Q1();
		System.out.println();
		Q.Q2();
		System.out.println();
		Q.Q3();
		System.out.println();
		Q.Q4();
		System.out.println();
		Q.Q5();
		System.out.println();
		a.ans();
	}

}
class Questions {
	String a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
	void Q1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Q1.How do u end an answer if u Partially know it?");
		System.out.println("1.Probably");
		System.out.println("2.Might Be?");
		System.out.println("3.I guess");
		System.out.println("4.None of the above");
		
		int ch = sc.nextInt();
		if (ch == 3) {
			 a1 = "Right";
		}else  {
			 a1 = "Wrong";
		}
				
		
	}
	void Q2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Q2.Who is the first president of india");
		System.out.println("1. Narendra Modi");
		System.out.println("2.Dr.Rajendra prasad");
		System.out.println("3.Ramanth kovind");
		System.out.println("4.None of the above");
		
		int ch = sc.nextInt();
		if (ch == 2) {
			 a2 = "Right";
		}else  {
			 a2 = "Wrong";
		}
				
		
		
	}
	void Q3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Q3.Which day is celebrated as International Women’s Day?");
		System.out.println("1. 1 January");
		System.out.println("2. 23 February");
		System.out.println("3. 8 March");
		System.out.println("4. 10 April");
		
		int ch = sc.nextInt();
		if (ch == 3) {
			a3 = "Right";
		}else  {
			a3 = "Wrong";
		}
	}
	void Q4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Q3.Which day is celebrated as World water Day?");
		System.out.println("1. 22 March");
		System.out.println("2. 10 december");
		System.out.println("3. 13 November");
		System.out.println("4. 27 January");
		
		int ch = sc.nextInt();
		if (ch == 1) {
			a4 = "Right";
		}else  {
			a4 = "Wrong";
		}
	}
	void Q5() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Q5.	Which day is celebrated as internatonal pride day?");
			System.out.println("1. 19 March");
			System.out.println("2. 14 march");
			System.out.println("3. 20 March");
			System.out.println("4. 21 March");
			
			int ch = sc.nextInt();
			if (ch == 2) {
				a5 = "Right";
			}else  {
				a5 = "Wrong";
			}
		}
	
	void Q6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Q5.	Which day is celebrated as internatonal pride day?");
		System.out.println("1. 19 March");
		System.out.println("2. 15 march");
		System.out.println("3. 20 March");
		System.out.println("4. 21 March");
		
		int ch = sc.nextInt();
		if (ch == 3) {
			a5 = "Right";
		}else  {
			a5 = "Wrong";
		}
	}

	
	
	
	
	}
class answers{
	void ans() {
		Questions Q = new Questions();
		
		System.out.println(Q.a1);
	}
}