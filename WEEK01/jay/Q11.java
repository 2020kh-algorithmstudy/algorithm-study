package chap01.jay;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int a = sc.nextInt();
		
		int n = 1;
		while(a>=10) {
			a = a/10;
			n++;
		}
		
		System.out.println("그 수는 "+n+"자리수입니다.");
	}

}
