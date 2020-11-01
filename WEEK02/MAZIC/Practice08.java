package chap02;

import java.util.Scanner;

public class Practice08 {

	static int[][] mdays= {{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int retry;							// 다시 한 번?
		
		System.out.println("그 해 경과 일수를 구합니다!");
		
		do {
			System.out.print("년 : ");
			int year=sc.nextInt();
			System.out.print("월 : ");
			int month=sc.nextInt();
			System.out.print("일 : ");
			int day=sc.nextInt();
			
			System.out.printf("그 해 %d일째입니다!\n", dayOfYear(year, month, day));
			System.out.printf("그 해 %d일 남았습니다!\n", leftDayOfYear(year, month, day));
			
			System.out.print("한 번 더 할까요? (1. 예 / 0. 아니오) : ");
			retry=sc.nextInt();
		} while(retry==1);
	}
	static int leftDayOfYear(int y, int m, int d) {
		if(isLeap(y)==1) {
			return 366-dayOfYear(y, m, d);		// 윤년이면 366일에서 dayOfYear만큼 빼주기
		}
		else {
			return 365-dayOfYear(y, m, d);		// 평년이면 365일
		}
	}

	static int dayOfYear(int y, int m, int d) {
		m-=1;							// 인덱스+1이 월이므로 -1
		while(m>0) {
			d+=mdays[isLeap(y)][m--];	// 입력 월부터 역순으로
		}
		return d;
	}

	static int isLeap(int year) {
		return (year%4 == 0 && year%100 !=0 || year%400 == 0)? 1:0;
	}

}
