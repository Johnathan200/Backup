package com.Keywords;

import java.util.Scanner;

public class Scannner {
	public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = scan.nextLine();
    System.out.println("Username is: " + userName);
}
	
}