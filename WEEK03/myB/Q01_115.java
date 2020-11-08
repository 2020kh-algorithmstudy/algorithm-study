package com.algorithm.ch03;
import java.util.Scanner;

public class Q01_115 {
	static int seqSearchSen(int[] a, int n, int key) {
		
		int i = 0;
		a[n] = key; // 보초 추가
		
		for(i = 0; i < key ; i++) {
			if(a[i] == key) {
				break;
			}
		}
		return i == n ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("파라미터 개수 : ");
		int num = sc.nextInt();
		
		// 출력되지는 않지만, 배열 마지막 보초 값을 넣을 공간이 필요하므로
		// 파라미터 개수_num + 1
		int[] x = new int[num+1]; 
		
		for(int i = 0; i < num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : "); // 키 값 입력 
		int ky = sc.nextInt();
		
		int idx = seqSearchSen(x, num, ky); // 배열 x에서 값이 ky인 요소 검색
		
		if(idx == -1) {
			System.out.println(ky+" 값을 가진 요소가 없습니다.");
		} else {
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
		}
	}
}
