package com.algorithm.study_ch02;

import java.util.Scanner;

public class Q05_64 {
	
	static void reverse(int[] a) {
		for(int i = 0; i < a.length/2; i++) {
			int t = a[i];
			a[i] = a[a.length-i-1];
			a[a.length-i-1] = t;
		}		
	}
	
	static void rcopy(int[] a, int[] b) {
		a = b.clone();
		
		reverse(a);
		
		System.out.println("배열 a : ");
		for(int i = 0; i < a.length; i++) {				
			System.out.print(a[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 b의 길이는? : ");
		int num = sc.nextInt();
		
		int[] b = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("b["+i+"] : ");
			b[i] = sc.nextInt(); 
		}
		
		System.out.println("배열 b에 배열 a를 복사");
		int[] a = new int[num];
		
		System.out.println("배열 b : ");
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}		
		System.out.println();
		
		rcopy(a, b);		
	}
}
