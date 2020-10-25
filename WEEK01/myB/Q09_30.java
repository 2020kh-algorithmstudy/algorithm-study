package com.algorithm.study;

import java.util.Scanner;

public class Q09_30 {

	static int sumof(int a, int b) {
		int sum = 0;
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 범위 값 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 범위 값 : ");
		int b = sc.nextInt();
		
		System.out.println(sumof(a,b));
	}

}
