package com.algorithm.ch03;
import java.util.Scanner;

public class Q03_117 {
	static int seqSearchIndex(int[] a, int n, int key, int[] idx) {
		
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] == key) {
				idx[cnt++] = i;
			}
		}
		return cnt;
	}	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("파라미터 개수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		int[] y = new int[num]; 
		
		for(int i = 0; i < num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
						
		System.out.print("검색할 값 : "); // 키 값 입력 
		int ky = sc.nextInt();
		
		int cnt = seqSearchIndex(x, num, ky, y);
		
		if(cnt == 0) {
			System.out.println("그 요소는 존재하지 않습니다.");
		} else {			
			System.out.println("그 값은 "+cnt+"개 입니다.");			
		}		
	}
}
