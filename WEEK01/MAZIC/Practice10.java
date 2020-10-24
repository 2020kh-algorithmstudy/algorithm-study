package chap01;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=0, b=0;
		
		System.out.print("a의 값 : ");
		a=sc.nextInt();
		
		do {
			System.out.print("b의 값 : ");
			b=sc.nextInt();
			
			if(a>=b) {						// a보다 큰 값을 입력받는다면 실행 안됨
				System.out.println("a보다 큰 값을 입력하세요!");
			}
		} while(a>=b);						// a보다 큰 값을 입력받는다면 반복 안됨
		
		System.out.println("b - a = "+(b-a)+" 입니다!");
	}

}
