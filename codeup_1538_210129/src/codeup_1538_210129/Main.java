package codeup_1538_210129;

import java.util.Scanner;

public class Main {

	public static void f(int n) {
		System.out.print((n%2==0)?"even":"odd");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		f(n);
	}
}