package com.algorithm.ch03;

import java.util.Scanner;

public class Q02_115 {

	// �迭 a�� �� �κ� n���� ��ҿ��� key�� ���� ��Ҹ� ���� �˻�_���ʹ�
	static int seqSearchSen(int[] a, int n, int key) {
		
		// for�� 4�� �ʿ��ϹǷ� ���� 4�� �ʿ�
		int i = 0; // �迭 a�� �ε��� �뵵
		int j = 0; // �迭 a�� �� ��� �뵵
		int k = 0; // *�� ���� ���� �뵵  
		int l = 0; // ó�� ǥ ���� ���� �뵵
		
		// �迭�� �������� ���� �߰�
		a[n] = key;

		// ǥ ���� ���� 
		System.out.printf("  | ");				
		for (l = 0; l < n; l++) {
			System.out.printf("%3d", l);
		} // �迭 �ε��� ���
		
		System.out.println(); // �ٰ���
		
		// �� �߱�
		System.out.print("--+");
		for (l = 0; l < n; l++) {
			System.out.printf("----");
		}
		
		System.out.println();
		
		// a[i] ���� key ���� �ƴ� �� ���� 
		for (i = 0; a[i] != key; i++) { 
			System.out.printf("  |");
			for (k = 0; k <= i; k++) {
				System.out.print("   "); // 3ĭ ����
			}
			System.out.println("*"); // * ���
			
			// ���� �ε��� ��ȣ ���
			System.out.printf("%2d| ", i);
			
			// �Է� ���� ��ü �迭 ��� ���
			for (j = 0; j < n; j++) {
				System.out.printf("%3d", a[j]);
			} 
			System.out.println();
		}
		
		// a[i] ���� key ���� �� ����
		System.out.printf("  |");
		for (k = 0; k <= i; k++) {
			System.out.print("   ");
		}
		System.out.println("*");
		System.out.printf("%2d| ", i);
		for (j = 0; j < n; j++) {
			System.out.printf("%3d", a[j]);
		}
		System.out.println();

		return i == n ? -1 : i; // key �� ã������ �ش� ���� i, �� ã������ -1 return
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�Ķ���� ���� : ");
		int num = sc.nextInt();

		int[] x = new int[num + 1]; // �Ķ���� �� num + 1

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		System.out.print("�˻��� �� : "); // Ű �� �Է�
		int ky = sc.nextInt();

		int idx = seqSearchSen(x, num, ky); // �迭 x���� ���� ky�� ��� �˻�

		if (idx == -1) {
			System.out.println(ky + " ���� ���� ��Ұ� �����ϴ�.");
		} else {
			System.out.println(ky + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
		}
	}
}