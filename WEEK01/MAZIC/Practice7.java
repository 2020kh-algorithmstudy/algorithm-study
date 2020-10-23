package chap01;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		// n까지 누적 덧셈
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n=sc.nextInt();
		int sum=0;
		int i=0;
		for(i=1; i<=n-1; i++) {
			System.out.print(i+" + ");
			sum+=i;
		}
		sum+=i;
		System.out.println(i+" = "+sum);
	}
		// for문 안에서 모든 출력을 하면 + 연산자 갯수도 n개가 되므로 후위연산자는 해당 구문을 지나고 +1이 됨을 이용하여
		// for문이 끝나고 나와서 마지막으로 연산을 수행하여 올바른 값을 도출
}
