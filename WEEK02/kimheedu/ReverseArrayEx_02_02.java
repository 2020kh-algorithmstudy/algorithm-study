package com.khd.chapter02;

import java.util.Scanner;

public class ReverseArrayEx_02_02 {
	
	static void swap(int[] a,int idx1, int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]= t;
	}
	static void print(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
			System.out.println();
		}
	}
	static void reverse(int[] a) {
		print(a);
		for(int i=0;i<a.length/2;i++) {
			System.out.println("a["+i+"]와 a["+(a.length-i-1)+"]를 교환합니다.");
			swap(a,i,a.length-i-1);
			print(a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.print("요솟수는 :");
		int num = sc.nextInt();
		int[] x = new int[num]; // 요솟수 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		reverse(x); // 배열 a의 요소를 역순으로 정렬

		System.out.println("역순 정렬을 마쳤습니다.");
		for (int i = 0; i < num; i++)
			System.out.println("x[" + i + "] = " + x[i]);
		
	}

}
