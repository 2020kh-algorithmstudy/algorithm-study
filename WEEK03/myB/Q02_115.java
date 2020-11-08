package com.algorithm.ch03;

import java.util.Scanner;

// 해답이 더 복잡해서 올리신 코드를 하나씩 설명하는 방식으로 공부했어요...!
// 코드 감사드려요!
public class Q02_115 {

	// 배열 a의 앞 부분 n개의 요소에서 key와 같은 요소를 선형 검색_보초법
	static int seqSearchSen(int[] a, int n, int key) {
		
		// for문 4개 필요하므로 변수 4개 필요
		int i = 0; // 배열 a의 인덱스 용도
		int j = 0; // 배열 a의 값 출력 용도
		int k = 0; // *의 공간 설정 용도  
		int l = 0; // 처음 표 형식 설계 용도
		
		// 배열의 마지막에 보초 추가
		a[n] = key;

		// 표 형식 설계 
		System.out.print("  | ");				
		for (l = 0; l < n; l++) {
			System.out.printf("%3d", l);
		} // 배열 인덱스 출력
		
		System.out.println(); // 줄개행
		
		// 선 긋기
		System.out.print("--+");
		for (l = 0; l < n; l++) {
			System.out.printf("----");
		}
		
		System.out.println();
		
		// a[i] 값이 key 값이 아닐 때 실행 
		for (i = 0; a[i] != key; i++) { 
			System.out.printf("  |");
			for (k = 0; k <= i; k++) {
				System.out.print("   "); // 3칸 띄우고
			}
			System.out.println("*"); // * 출력
			
			// 현재 인덱스 번호 출력
			System.out.printf("%2d| ", i);
			
			// 입력 받은 전체 배열 요소 출력
			for (j = 0; j < n; j++) {
				System.out.printf("%3d", a[j]);
			} 
			System.out.println();
		}
		
		// a[i] 값이 key 값일 때 실행
		System.out.print("  |");
		for (k = 0; k <= i; k++) {
			System.out.print("   ");
		}
		System.out.println("*");
		System.out.printf("%2d| ", i);
		for (j = 0; j < n; j++) {
			System.out.printf("%3d", a[j]);
		}
		System.out.println();

		return i == n ? -1 : i; // key 값 찾았으면 해당 값인 i, 못 찾았으면 -1 return
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("파라미터 개수 : ");
		int num = sc.nextInt();

		int[] x = new int[num + 1]; // 파라미터 수 num + 1

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		System.out.print("검색할 값 : "); // 키 값 입력
		int ky = sc.nextInt();

		int idx = seqSearchSen(x, num, ky); // 배열 x에서 값이 ky인 요소 검색

		if (idx == -1) {
			System.out.println(ky + " 값을 가진 요소가 없습니다.");
		} else {
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
		}
	}
}
