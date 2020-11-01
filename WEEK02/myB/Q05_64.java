package com.algorithm.study_ch02;

import java.util.Scanner;

public class Q05_64 {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for(int i = 0; i < a.length/2; i++) {
			swap(a, i, a.length - i - 1);
		}		
	}
	
	static void rcopy(int[] a, int[] b) {
		a = b.clone();
		
		reverse(a);
		
		System.out.println("�迭 a : ");
		for(int i = 0; i < a.length; i++) {				
			System.out.print(a[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭 b�� ���̴�? : ");
		int num = sc.nextInt();
		
		int[] b = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("b["+i+"] : ");
			b[i] = sc.nextInt(); 
		}
		
		System.out.println("�迭 b�� �迭 a�� ����");
		int[] a = new int[num];
		
		System.out.println("�迭 b : ");
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}		
		System.out.println();
		
		rcopy(a, b);		
	}
}
