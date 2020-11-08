package chap03;

import java.util.Scanner;

public class Practice05 {

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
		
		int idx=binSearchX(x, num, ky);
		
		if(idx==0) {
			System.out.println("�� ���� ��Ұ� �����ϴ�!");
		}
		else {
			System.out.println(ky+"��(��) x["+idx+"]�� �ֽ��ϴ�!");
		}
	}

	static int binSearchX(int[] a, int n, int key) {
		int pl=0;				// ù �ε���
		int pr=n-1;				// �� �ε���
		
		do {
			int pc=(pl+pr)/2;	// �߾� �ε���
			if(a[pc]==key) {					// ù ��ġ �� ã���� ��
				for(int i=pc; i>0; i--) {		// �� �ε������� �������鼭
					if(a[i]==key) {				// ��ġ�ϴ� �ε����� �ݺ��ؼ� ����
						pc=i;
					}
				}
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
	}
}
