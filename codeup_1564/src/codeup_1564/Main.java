package codeup_1564;

import java.util.Scanner;

public class Main {

	public static int gcd(int a, int b) {
		if(a%b==0) {
			return b;
		}
		if(b>a) {
			return gcd(b,a);
		}
		return gcd(b, a%b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print(gcd(a, b));
	}

}
