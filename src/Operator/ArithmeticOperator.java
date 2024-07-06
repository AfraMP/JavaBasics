package Operator;

import java.util.Scanner;

/**
 * 1. Write a function for arithmetic operators(+,-,*,/)
 */
public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a number a: ");
		int a = sc.nextInt();
		System.out.println("Enter a number b: ");
		int b =  sc.nextInt();
		sc.close();
		add(a, b);
		subtract(a, b);
		multiply(a, b);
		divide(a, b);
	}
	public static void add(int a, int b) {
		System.out.println("Sum : " + (a + b));
	}
	public static void subtract(int a, int b) {
		System.out.println("Subtract : " + (a - b));
	}
	public static void multiply(int a, int b) {
		System.out.println("Multiply : " + (a * b));
	}
	public static void divide(int a, int b) {
		System.out.println("Division : " + (a / b));
	}

}
