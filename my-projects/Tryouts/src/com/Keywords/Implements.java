package com.Keywords;

import java.util.Scanner;

public class Implements{

	public static void main(String[] args) {
		Johnathan J = new Johnathan();
		J.run();
		J.walk();
	}
	
}
interface movement{
		public void run();
		public void walk();
}

 class Johnathan implements movement {
	 Scanner scan = new Scanner(System.in);
	public void  run() {
		System.out.println("Does Johnathan Run fast ?");
		String Torf =scan.nextLine();
		System.out.println( Torf + " He Runs Fast");
	}

	
	public void walk() {
	System.out.println("Does Johnathan walk much ?");
	String Torf2 = scan.nextLine();
	System.out.println(Torf2 + " Johnathan walks much/less .");
		
	}
	 
}
