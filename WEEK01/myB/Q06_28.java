package com.algorithm.study;

import java.util.Scanner;

public class Q06_28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1���� n���� �� ���ϱ� / n�� ����? : ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		while(i <= n) {
			sum += i;
			i++;
			System.out.println("i�� �� : "+i);
		}
		System.out.println(sum);

	}

}
