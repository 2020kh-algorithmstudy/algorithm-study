package com.algorithm.ch03;
import java.util.Scanner;

public class Q03_117 {
	static int seqSearchIndex(int[] a, int n, int key, int[] idx) {
		
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] == key) {
				idx[cnt++] = i;
			}
		}
		return cnt;
	}	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Ķ���� ���� : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		int[] y = new int[num]; 
		
		for(int i = 0; i < num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
						
		System.out.print("�˻��� �� : "); // Ű �� �Է� 
		int ky = sc.nextInt();
		
		int cnt = seqSearchIndex(x, num, ky, y);
		
		if(cnt == 0) {
			System.out.println("�� ��Ҵ� �������� �ʽ��ϴ�.");
		} else {			
			System.out.println("�� ���� "+cnt+"�� �Դϴ�.");			
		}		
	}
}
