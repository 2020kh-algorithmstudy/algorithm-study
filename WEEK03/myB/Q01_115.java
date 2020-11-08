package com.algorithm.ch03;
import java.util.Scanner;

public class Q01_115 {
	static int seqSearchSen(int[] a, int n, int key) {
		
		int i = 0;
		a[n] = key; // ���� �߰�
		
		for(i = 0; i < key ; i++) {
			if(a[i] == key) {
				break;
			}
		}
		return i == n ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Ķ���� ���� : ");
		int num = sc.nextInt();
		
		// ��µ����� ������, �迭 ������ ���� ���� ���� ������ �ʿ��ϹǷ�
		// �Ķ���� ����_num + 1
		int[] x = new int[num+1]; 
		
		for(int i = 0; i < num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("�˻��� �� : "); // Ű �� �Է� 
		int ky = sc.nextInt();
		
		int idx = seqSearchSen(x, num, ky); // �迭 x���� ���� ky�� ��� �˻�
		
		if(idx == -1) {
			System.out.println(ky+" ���� ���� ��Ұ� �����ϴ�.");
		} else {
			System.out.println(ky+"��(��) x["+idx+"]�� �ֽ��ϴ�.");
		}
	}
}
