package com.ch03.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_121 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("파라미터 개수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0] : "); // 배열 첫 요소 먼저 입력
		x[0] = sc.nextInt();
		
		for(int i = 1; i < num; i++) {
			do {
				System.out.print("x["+i+"] : ");
				x[i] = sc.nextInt();
			} while(x[i] < x[i-1]);
		}
		
		System.out.print("검색할 값 : ");
		int ky = sc.nextInt();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx < 0) {
			System.out.println("그 값의 요소가 없습니다.");
			System.out.println("삽입 포인트의 값 : "+idx);
		} else {
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
		}
	}
}
