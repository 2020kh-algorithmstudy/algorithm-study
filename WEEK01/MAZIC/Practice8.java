package chap01;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		// ���콺 ���� 1~10���� ���� (1+10)*5 / n���� �� ���ϴ� ���α׷�
		Scanner sc=new Scanner(System.in);
		System.out.print("���� n �Է� : ");
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=n; i++) {
			sum+=(1+n);
		}
		System.out.println("��� : "+sum/2);
	}
		// ����þ� ������ n�� 10�̶��
		//	1 2 3 4 5 6 7 8 9 10
		//+10 9 8 7 6 5 4 3 2 1
		//----------------------
		// 11 11 11 11 11 ... 11�� n�� == (1+n)�� n��
		// �������� �� �� �� �������Ƿ� /2 �Ͽ� (1+n)*n/2 ��� ���� ����
		// for������ (1+n)*n���� �����ϰ� ��� �� /2�Ͽ� �������
}