package chap01;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		// ���� ������ �Է¹ް� �ڸ����� ����ϴ� ���α׷�
		// ex) 135 -> 3�ڸ� / 1314 -> 4�ڸ�
		// �ܼ��� ������Ÿ���� �����Ͽ� ������ ���� ������ �ƴ� �ݺ����� ���� �˰������� ó��
		Scanner sc=new Scanner(System.in);
		
		int cnt=0;				// �ڸ����� ī���� �� ����
		int keyValue=10;		// 10, 10*10, 10*10*10 ... ���� ������ �� ����� ����
		
		System.out.print("���� ���� �Է� : ");
		int a=sc.nextInt();
		
		while(a/keyValue > 0) {
			cnt++;
			keyValue*=10;
		}
		System.out.println(12/100);
		// �Է� ���� ���ڸ� 10, 10*10, 10*10*10 ... ���� ������ �� �� ������ ���� 0���� �۾������� ī�����Ͽ� �ڸ����� ���
		// ex) a=12�� ��, while�� ���� - 12 / 10 = 1�̹Ƿ� 0���� ŭ, �ݺ��� ���� - cnt 1 ����, keyValue*10
		//				�ٽ� while�� ���� - 12 / 100 = 0�̹Ƿ� 0���� ����, �ݺ��� �̼��� - cnt+1=2�� �ڸ���
		
		System.out.println("�� ���� "+(cnt+1)+"�ڸ��Դϴ�!");
	}

}
