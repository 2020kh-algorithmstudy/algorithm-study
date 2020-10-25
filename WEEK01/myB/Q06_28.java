package com.algorithm.study;

import java.util.Scanner;

public class Q06_28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1부터 n까지 합 구하기 / n의 값은? : ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		while(i <= n) {
			sum += i;
			i++;
			System.out.println("i의 값 : "+i);
		}
		System.out.println(sum);

	}

}
