package com.algorithm.study;

import java.util.Scanner;

public class Q08_30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ n까지의 합 구하기 / n 입력 : ");
		int n = sc.nextInt();
		
		int sum = 0;
	
		if(n % 2 == 0) {
			sum = (1+n)*(n/2);
		}
		else if(n % 2 == 1){
			sum = (1+n)*(n/2) + ((n+1)/2);
		}
		else {
			sum = 0;
		}
		System.out.println(sum);
	}
		
}


