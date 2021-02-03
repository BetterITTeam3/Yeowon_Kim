package bj2355_210203;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long max = 0, min = 0, tot = 0;
		long a = sc.nextLong();
		long b = sc.nextLong();
		if(a>b) {
			max = a;
			min = b;
		}else {
			max = b;
			min = a;
		}
		tot = (max-min+1)*(min+max)/2;
		
		System.out.print(tot);
	}
}