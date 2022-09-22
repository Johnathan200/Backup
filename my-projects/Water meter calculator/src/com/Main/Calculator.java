package com.Main;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the amount of water consumed: ");
		float waterc = sc.nextFloat();
		
		if (waterc <= 10.0) {
			System.out.println("50");
		}else if(waterc > 10.0 && waterc <= 25.0) {
		System.out.println( ((waterc - 10.0) * 10.0) + 50 );
			
		}else if(waterc > 25.0) {
			System.out.println(((waterc - 25.0) * 25.0) + 50  );
		}

	}
}
