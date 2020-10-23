package chap01;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		// 가우스 덧셈 1~10까지 합은 (1+10)*5 / n까지 합 구하는 프로그램
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 n 입력 : ");
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=n; i++) {
			sum+=(1+n);
		}
		System.out.println("결과 : "+sum/2);
	}
		// 가우시안 덧셈은 n이 10이라면
		//	1 2 3 4 5 6 7 8 9 10
		//+10 9 8 7 6 5 4 3 2 1
		//----------------------
		// 11 11 11 11 11 ... 11이 n개 == (1+n)이 n개
		// 역순으로 한 번 더 더했으므로 /2 하여 (1+n)*n/2 라는 공식 성립
		// for문에서 (1+n)*n까지 연산하고 출력 때 /2하여 출력했음
}