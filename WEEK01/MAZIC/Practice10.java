package chap01;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=0, b=0;
		
		System.out.print("a�� �� : ");
		a=sc.nextInt();
		
		do {
			System.out.print("b�� �� : ");
			b=sc.nextInt();
			
			if(a>=b) {						// a���� ū ���� �Է¹޴´ٸ� ���� �ȵ�
				System.out.println("a���� ū ���� �Է��ϼ���!");
			}
		} while(a>=b);						// a���� ū ���� �Է¹޴´ٸ� �ݺ� �ȵ�
		
		System.out.println("b - a = "+(b-a)+" �Դϴ�!");
	}

}
