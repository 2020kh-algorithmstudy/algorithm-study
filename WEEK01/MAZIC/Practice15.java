package chap01;

import java.util.Scanner;

public class Practice15 {
	// Q15
	static void triangleLB(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// Q15
	static void triangleLU(int n) {
		for(int i=0; i<n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// Q15
	static void triangleRU(int n) {
		for(int i=0; i<n; i++) {
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for(int j=n; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// Q15
	static void triangleRB(int n) {
		for(int i=0; i<n; i++) {
			for(int k=n-1; k>i; k--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// Q16
	static void spira(int n) {
		for(int i=0; i<n; i++) {
			for(int k=n-1; k>i; k--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			for(int l=0; l<i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// Q17
	static void npira(int n) {
		for(int i=0; i<n; i++) {
			for(int k=n-1; k>i; k--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print((i+1)%10);
			}
			for(int l=0; l<i; l++) {
				System.out.print((i+1)%10);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// 왼쪽 아래가 직각인 이등변 삼각형을 출력
		Scanner sc=new Scanner(System.in);
		
		System.out.println("사각형을 출력합니다");
		System.out.print("단 수 : ");
		int n=sc.nextInt();
		
		triangleLB(n);
		System.out.println();
		triangleLU(n);
		System.out.println();
		triangleRU(n);
		System.out.println();
		triangleRB(n);
		System.out.println();
		spira(n);
		System.out.println();
		npira(n);
	}

}
