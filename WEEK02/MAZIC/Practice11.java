package chap02;

import java.time.LocalDate;
import java.util.Scanner;

public class Practice11 {
	
	static class YMD{
		int y;					// ��
		int m;					// ��(1~12)
		int d;					// ��(1~31)
		
		public YMD(int y, int m, int d) {
			super();
			this.y = y;
			this.m = m;
			this.d = d;
		}
		
		public void after(int n) {
			LocalDate targetDate=LocalDate.of(this.y, this.m, this.d);
			targetDate=targetDate.plusDays(n);
			System.out.println(targetDate);
		}
		
		public void before(int n) {
			LocalDate targetDate=LocalDate.of(this.y, this.m, this.d);
			targetDate=targetDate.minusDays(n);
			System.out.println(targetDate);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�� : ");
		int year=sc.nextInt();
		System.out.print("�� : ");
		int month=sc.nextInt();
		System.out.print("�� : ");
		int day=sc.nextInt();
		
		YMD ymd=new YMD(year, month, day);
		
		System.out.print("n�� : ");
		int nDay=sc.nextInt();
		
		ymd.after(nDay);
		ymd.before(nDay);
		
	}

}
