package chap03;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("��Ҽ� : ");
		int num=sc.nextInt();
		int[] x=new int[num];
		
		System.out.println("������������ �Է��ϼ���!");
		
		System.out.print("x[0] : ");
		x[0]=sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x["+i+"] : ");
				x[i]=sc.nextInt();
			}while(x[i]<x[i-1]);			// �ٷ� ���� ��Һ��� ������ �ٽ� �Է�
		}									// �ݺ��Ͽ� ������������ �Է¹ޱ�
		
		System.out.print("�˻��� �� : ");
		int ky=sc.nextInt();
		
		int idx=binSearch(x, num, ky);
		
		if(idx==0) {
			System.out.println("�� ���� ��Ұ� �����ϴ�!");
		}
		else {
			System.out.println(ky+"��(��) x["+idx+"]�� �ֽ��ϴ�!");
		}
	}

	static int binSearch(int[] a, int n, int key) {
		int pl=0;				// ù �ε���
		int pr=n-1;				// �� �ε���
		
		System.out.printf("  |");
		for(int i=0; i<n; i++) {
			System.out.printf("%3d", i);
		}
		System.out.printf("\n--+");
		for(int i=0; i<n; i++) {
			System.out.printf("---");
		}
		System.out.println();
		do {
			int pc=(pl+pr)/2;	// �߾� �ε���
			System.out.printf("  |");
			for(int i=0; i<pl; i++) {
				System.out.print("  ");
			}
			System.out.print(" <-");
			for(int i=pl; i<pc-1; i++) {
				System.out.print("   ");
			}								// �� ���ߴ��� �� �� ���� ������ + ǥ�� �� �ѹ�ġ ���
			System.out.print("  +");
			for(int i=pc; i<pr-1; i++) {
				System.out.print("   ");
			}								// �� ���ߴ��� �� �� ���� ������ -> ǥ�� �� �ѹ�ġ ���
			System.out.println(" ->");
			System.out.print(" "+pc+"|");
			for(int i=0; i<n; i++) {
				System.out.printf("%3d", a[i]);
			}
			System.out.println();
			if(a[pc]==key) {
				return pc;
			}
			else if(a[pc]<key) {
				pl=pc+1;		// �˻� ���� �� ũ��  �ڿ� ��
			}
			else {
				pr=pc-1;		// �˻� ���� �� ������ �տ� ��
			}
		}while(pl<=pr);
		return -1;
	}			// �ſ� �������� ����
}
