package com.ch03.algorithm;
import java.util.Scanner;

public class Q03_117 {
	static int seqSearchIndex(int[] a, int n, int key, int[] y) {
		
		// 동일한 key 값의 개수
		int cnt = 0; 
		
		// 배열 a의 요소 중 key 값 찾기
		for(int i = 0; i < n; i++) {
			if(a[i] == key) {				
				// i는 배열  a의 인덱스
				// 배열 a의 몇 번 인덱스에 key 값이 있는지, 해당 인덱스 값을 저장하는 배열 y
				y[cnt++] = i; 
			}
		}
		return cnt; // 저장된 key 값의 개수 리턴
	}	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("파라미터 개수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num]; 
		
		// 배열 x의 몇 번 인덱스에 동일한 key 값이 있는지 저장하는 배열 y
		int[] y = new int[num]; 
		
		// 배열 x 요소 입력
		for(int i = 0; i < num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
						
		System.out.print("검색할 값 : "); // 키 값 입력 
		int ky = sc.nextInt();
		
		int cnt = seqSearchIndex(x, num, ky, y);
		
		if(cnt == 0) {
			System.out.println(ky+"값이 존재하지 않습니다.");
		} else {			
			// 같은 key 값이 몇 개인지 출력
			System.out.println(ky+"값은 총 "+cnt+"개 입니다.");
			
			// 해당 key 값들이 배열 x 몇 번 인덱스인지 y[i] 출력
			for(int i = 0; i < cnt; i++) {
				System.out.println(ky+"은(는) x["+y[i]+"]에 있습니다.");
			}
		}		
	}
}
