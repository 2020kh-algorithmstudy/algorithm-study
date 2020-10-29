package chap02;

import java.util.Scanner;

public class Practice06 {

	static void swap(char[] arr, int i1, int i2) {
		char tmp=arr[i1];
		arr[i1]=arr[i2];
		arr[i2]=tmp;
	}
	
	static void reverse(char[] arr, int index) {
		for(int i=0; i<index/2; i++) {
			swap(arr, i, index-i-1);
		}
	}
	static int cardConvRev(int x, int r, char[] d) {
		// ������ x�� r������ ��ȯ�Ͽ� �迭 d�� �Ʒ��ڸ����� �־�ΰ� �ڸ����� ��ȯ
		int digits=0;				// ��ȯ ���� �ڸ���
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";	// 36���� ���� ǥ���ϱ� ���� ���ڿ�
		
		do {
			d[digits++]=dchar.charAt(x%r);		// r�� ���� �������� ����
			x/=r;
		}while(x!=0);
		reverse(d, digits);				// �ڸ���=�迭�� ����� ������ ����
		return digits;			// reverse �Լ� �״�� ���� ���� �迭 ���̷� �����ϹǷ� a[0] a[35]�� ������
	}
	public static void main(String[] args) {
		// �迭�� ���ʿ� �Ʒ��ڸ��� �ƴ϶� ���ڸ��� �־�ΰ� �����
		Scanner sc=new Scanner(System.in);
		int no;						// ��ȯ�ϴ� ����
		int cd;						// ���
		int dno;					// ��ȯ ���� �ڸ���
		int retry;					// �ٽ� �� ��?
		char[] cno=new char[32];	// ��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ���� �迭
		
		System.out.println("10������ ��� ��ȯ�մϴ�!");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ���� : ");
				no=sc.nextInt();
			}while(no<0);						// ���� �ƴ� ������ �Է� �ޱ����� �ݺ���
			do {
				System.out.print("� ������ ��ȯ�ұ��? (2~36) : ");
				cd=sc.nextInt();
			}while(cd<2 || cd>36);				// 2~36�� ���� �ޱ����� �ݺ���
			
			dno=cardConvRev(no, cd, cno);		// no�� cd������ ��ȯ
												// no�� cd�� �ݺ��ؼ� ���� �������� ����ִ� �迭�� ����
			System.out.print(cd+"�����δ� ");
			for(int i=0; i<dno; i++) {		// �迭�� ���� ���
				System.out.print(cno[i]);
			}
			System.out.println("�Դϴ�!");
			
			System.out.print("�� �� �� �ұ��? (1. �� / 0. �ƴϿ�) : ");
			retry=sc.nextInt();
		}while(retry==1);
	}

}
