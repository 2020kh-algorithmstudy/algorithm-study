package chap01;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		// n���� ���� ����
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int n=sc.nextInt();
		int sum=0;
		int i=0;
		for(i=1; i<=n-1; i++) {
			System.out.print(i+" + ");
			sum+=i;
		}
		sum+=i;
		System.out.println(i+" = "+sum);
	}
		// for�� �ȿ��� ��� ����� �ϸ� + ������ ������ n���� �ǹǷ� ���������ڴ� �ش� ������ ������ +1�� ���� �̿��Ͽ�
		// for���� ������ ���ͼ� ���������� ������ �����Ͽ� �ùٸ� ���� ����
}
