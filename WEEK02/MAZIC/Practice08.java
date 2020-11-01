package chap02;

import java.util.Scanner;

public class Practice08 {

	static int[][] mdays= {{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int retry;							// �ٽ� �� ��?
		
		System.out.println("�� �� ��� �ϼ��� ���մϴ�!");
		
		do {
			System.out.print("�� : ");
			int year=sc.nextInt();
			System.out.print("�� : ");
			int month=sc.nextInt();
			System.out.print("�� : ");
			int day=sc.nextInt();
			
			System.out.printf("�� �� %d��°�Դϴ�!\n", dayOfYear(year, month, day));
			System.out.printf("�� �� %d�� ���ҽ��ϴ�!\n", leftDayOfYear(year, month, day));
			
			System.out.print("�� �� �� �ұ��? (1. �� / 0. �ƴϿ�) : ");
			retry=sc.nextInt();
		} while(retry==1);
	}
	static int leftDayOfYear(int y, int m, int d) {
		if(isLeap(y)==1) {
			return 366-dayOfYear(y, m, d);		// �����̸� 366�Ͽ��� dayOfYear��ŭ ���ֱ�
		}
		else {
			return 365-dayOfYear(y, m, d);		// ����̸� 365��
		}
	}

	static int dayOfYear(int y, int m, int d) {
		m-=1;							// �ε���+1�� ���̹Ƿ� -1
		while(m>0) {
			d+=mdays[isLeap(y)][m--];	// �Է� ������ ��������
		}
		return d;
	}

	static int isLeap(int year) {
		return (year%4 == 0 && year%100 !=0 || year%400 == 0)? 1:0;
	}

}
