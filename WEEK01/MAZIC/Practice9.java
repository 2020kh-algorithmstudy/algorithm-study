package chap01;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� a : ");
		int a=sc.nextInt();
		System.out.print("���� b : ");
		int b=sc.nextInt();
		int tmp=0;
		int sum=0;
		
		if(a>b) {
			tmp=a;
			a=b;
			b=tmp;
		}								// i ���� �����ϴ� for���� ���� �����ϵ��� a�� b�� ũ�⸦ ���Ͽ� b�� �� ū ���� ������ ����
		
		for(int i=a; i<=b; i++) {
			sum+=i;
		}								// ���� ������ ū ������ �ݺ��Ͽ� ����
		System.out.println("��� : "+sum);
	}

}
