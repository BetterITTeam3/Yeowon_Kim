package codeup_1555_210201;

import java.util.Scanner;

public class Main {
	
	public static long f(int n) {
		long tot = 0;
		for(int i=1; i<=n; i++) {
			tot+=i;
		}
		return tot;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(f(n));

	}

}
