package com.xenosis.assignment;

import java.util.Scanner;

public class User_Input {
	public static void main(String[] args) {

		try (Scanner s = new Scanner(System.in)) {
			System.out.print("Enter the Number: ");

			int num = s.nextInt();

			if (num % 2 == 0) {
				System.out.println("This is a Even Number.45");
			}

			else {
				System.out.println("This is a Odd Number.");
			}
		}

	}
}
