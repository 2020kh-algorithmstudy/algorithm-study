package com.khd.chapter02;

import java.util.Scanner;

public class SumOf_02_03 {

	static int sumOf(int[] a) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		} return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요솟수는 :");
		int num = sc.nextInt();
		
		int[] a= new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.print("a["+i+"]:");
			a[i] = sc.nextInt();
		} System.out.println("전 요소의 합계는"+sumOf(a)+"입니다.");
	} 
}
