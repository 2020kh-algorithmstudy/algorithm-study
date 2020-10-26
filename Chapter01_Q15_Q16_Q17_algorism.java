package com.khd.algorism;

import java.util.Scanner;

public class algorism {

	static void triangleLB(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void triangleLU(int n) {
		for(int i=1;i<n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.println("*");
			}
		}
	}
	
	static void triangleRU(int n) {
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=i-1;k++) {
				System.out.println(" ");
			}
			for(int j=1;j<=n-i+1;j++) {
				System.out.println("*");
			}  
		}
	}
	
	static void spira(int n) {
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");
			} 
			for(int j=1;j<=((i-1)*2)+1;j++) {
				System.out.print("*");
			} System.out.println();
		}
	}
	
	static void npira(int n) {
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(i-1)*2+1;j++) {
				System.out.print(i);
			} System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("삼각형 모양으로 나타냅니다.");
		
		do {
			System.out.println("단수는 :");
			n = sc.nextInt();
		} while(n<=0); {
			
			System.out.println("왼쪽 아래가 직각인 삼각형");
			npira(n);
		}
	}
}
