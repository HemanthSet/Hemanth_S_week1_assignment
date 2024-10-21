package com.xenosis.assignment;

import java.util.Scanner;

public class Simple_Calculator {
	public static void main(String[] args) {

		try (Scanner s = new Scanner(System.in)) {
			System.out.print("Enter the First Number: ");
			int a = s.nextInt();
			System.out.println();
			System.out.print("Enter the Second Number: ");
			int b = s.nextInt();
			System.out.println();
			System.out.print("Choose the Operator: ");
			char o = s.next().charAt(0);
			System.out.println();

			int result = 0;

			switch (o) {
			case '+':
				result = a + b;
				break;

			case '-':
				result = a - b;
				break;

			case '*':
				result = a * b;
				break;

			case '/':
				result = a / b;
				break;

			case '%':
				result = a % b;
				break;

			default:
				System.out.println("Invalid Input..");

			}

			System.out.println("Result is: " + result);
		}

	}
}
