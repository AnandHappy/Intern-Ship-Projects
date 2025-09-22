package com.task1;

import java.util.Scanner;

public class CalculatorDemo {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome To Calculator...");
			System.out.println("Enter 1 for Addition");
			System.out.println("Enter 2 for Subtraction");
			System.out.println("Enter 3 for Multiplication");
			System.out.println("Enter 4 for Division");
			System.out.println("Enter 5 for Exit");
			System.out.println("Enter Your option..");

			int option = sc.nextInt();

			System.out.println("Enter Your First Number");
			double first_num = sc.nextDouble();
			System.out.println("Enter Your Second Number");
			double second_num = sc.nextDouble();
			double result = 0;

			switch (option) {
			case 1: {
				result = addition(first_num, second_num);
				break;
			}
			case 2: {
				result = subtraction(first_num, second_num);
				break;
			}
			case 3: {
				result = multiplication(first_num, second_num);
				break;
			}
			case 4: {
				result = division(first_num, second_num);
				break;
			}
			case 5: {
				System.out.println("Exiting from Calculator");
				break;
			}
			default: {
				System.out.println("Something Went Wrong Please Check Once..");
				break;
			}

			}
			System.out.println("Result is::" + " " + result);
			System.out.println();
			System.out.println();
			System.out.println();

		}
	}

	static double addition(double a, double b) {
		return a + b;

	}

	static double subtraction(double a, double b) {
		return a - b;

	}

	static double multiplication(double a, double b) {
		return a * b;
	}

	static double division(double a, double b) {
		if (b == 0) {
			System.out.println("Error: Division by zero is not allowed.");
			return 0;
		}
		return a / b;
	}

}
