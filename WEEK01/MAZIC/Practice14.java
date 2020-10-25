package chap01;

import java.util.Scanner;

public class Practice14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("사각형을 출력합니다");
		System.out.print("단 수 : ");
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
		// 이런 문제 응용 문제로 피라미드 출력 역 피라미드 출력 이런 거 했던 것 같음
}
