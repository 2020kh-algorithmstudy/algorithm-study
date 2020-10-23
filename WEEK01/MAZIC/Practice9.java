package chap01;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 a : ");
		int a=sc.nextInt();
		System.out.print("정수 b : ");
		int b=sc.nextInt();
		int tmp=0;
		int sum=0;
		
		if(a>b) {
			tmp=a;
			a=b;
			b=tmp;
		}								// i 값이 증가하는 for문을 쓰기 용이하도록 a와 b의 크기를 비교하여 b에 더 큰 값이 들어가도록 세팅
		
		for(int i=a; i<=b; i++) {
			sum+=i;
		}								// 작은 값부터 큰 값까지 반복하여 덧셈
		System.out.println("결과 : "+sum);
	}

}
