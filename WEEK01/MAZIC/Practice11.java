package chap01;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		// 양의 정수를 입력받고 자릿수를 출력하는 프로그램
		// ex) 135 -> 3자리 / 1314 -> 4자리
		// 단순히 데이터타입을 변경하여 갯수를 세는 로직이 아닌 반복문을 통한 알고리즘으로 처리
		Scanner sc=new Scanner(System.in);
		
		int cnt=0;				// 자리수를 카운팅 할 변수
		int keyValue=10;		// 10, 10*10, 10*10*10 ... 으로 나눠줄 때 사용할 변수
		
		System.out.print("양의 정수 입력 : ");
		int a=sc.nextInt();
		
		while(a/keyValue > 0) {
			cnt++;
			keyValue*=10;
		}
		System.out.println(12/100);
		// 입력 받은 숫자를 10, 10*10, 10*10*10 ... 으로 나눠서 몇 번 나눠야 몫이 0보다 작아지는지 카운팅하여 자릿수를 계산
		// ex) a=12일 때, while문 조건 - 12 / 10 = 1이므로 0보다 큼, 반복문 수행 - cnt 1 증가, keyValue*10
		//				다시 while문 조건 - 12 / 100 = 0이므로 0보다 작음, 반복문 미수행 - cnt+1=2가 자릿수
		
		System.out.println("그 수는 "+(cnt+1)+"자리입니다!");
	}

}
