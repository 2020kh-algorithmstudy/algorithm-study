package com.algorithm.study;

import java.util.Scanner;

public class Q14_38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사각형을 출력합니다.");
		System.out.print("단 수 : ");
		int cnt = sc.nextInt();
		
		for(int i = 1; i<=cnt; i++) {
			for(int j = 1; j<=cnt; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
