package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class Practice06 {

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
		
		int idx=Arrays.binarySearch(x, ky);
		
		if(idx<0) {
			System.out.println("�� ���� ��Ұ� �����ϴ�!");
			if((idx+1)*-1>=num) {
				System.out.println("�����Ⱚ");
			}
			else {
				System.out.println(x[(idx+1)*-1]);
			}
		}
		else {
			System.out.println(ky+"��(��) x["+idx+"]�� �ֽ��ϴ�!");
		}
	}
}
