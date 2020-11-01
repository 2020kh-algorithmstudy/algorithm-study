package com.algorithm.study_ch02;

import java.util.Scanner;

public class Q02_61 {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for(int i = 0; i < a.length/2; i++) {
			swap(a, i, a.length - i - 1);
			System.out.println();
			System.out.println("a["+i+"]과(와) a["+(a.length-i-1)+"]를 교환합니다." );
			
			for(int j=0; j < a.length; j++) {				
				System.out.print(a[j] + " ");				
			}
		}		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟 수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();			
		}
		
		System.out.println();
		for(int i = 0; i < num; i++) {
			System.out.print(x[i]+" ");
		}		
    	System.out.println();
    	reverse(x);
    	
    	System.out.println();
		System.out.println("요소 역순 정렬 완료");
	}

}
