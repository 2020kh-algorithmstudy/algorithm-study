package com.algorithm.study;

import java.util.Scanner;

public class Q07_30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1���� n���� �� ���ϱ� / n�� ����? : ");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
			System.out.print(i+" + ");
		}
		System.out.println(sum);
	}

}
