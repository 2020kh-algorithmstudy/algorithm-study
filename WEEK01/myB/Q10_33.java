package com.algorithm.study;

import java.util.Scanner;

public class Q10_33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("a �� : ");
		a = sc.nextInt();	
		do {
			System.out.print("b �� : ");
			b = sc.nextInt();
			System.out.println("a���� ū ���� �Է�!!");
			if(b > a) {
				System.out.println("b - a��"+(b-a)+"�Դϴ�.");
			} 
		}while(b <= a);
	}
}
