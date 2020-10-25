package com.algorithm.study;

import java.util.Scanner;

public class Q10_33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("a 값 : ");
		a = sc.nextInt();	
		do {
			System.out.print("b 값 : ");
			b = sc.nextInt();
			System.out.println("a보다 큰 값을 입력!!");
			if(b > a) {
				System.out.println("b - a는"+(b-a)+"입니다.");
			} 
		}while(b <= a);
	}
}
