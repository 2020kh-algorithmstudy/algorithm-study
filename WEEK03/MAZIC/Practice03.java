package chap03;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("��Ҽ� : ");
		int num=sc.nextInt();
		int[] x=new int[num+1];
		int[] indexArray=new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i]=sc.nextInt();
		}
		
		System.out.print("�˻��� �� : ");
		int ky=sc.nextInt();
		
		int idx=searchIdx(x, num, ky, indexArray);
		
		if(idx==0) {
			System.out.println("�� ���� ��Ұ� �����ϴ�!");
		}
		else {
			System.out.println(idx+"�� ��ġ");
		}
	}
	
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int cnt=0;
		for(int i=0; i<n; i++) {
			if(a[i]==key) {
				idx[cnt]=i;				// ��ġ�ϴ� �ε��� ����
				cnt++;
			}
		}
		for(int i=0; i<cnt; i++) {
			System.out.println(idx[i]);
		}
		return cnt;						// ī��Ʈ ��ȯ
	}
}
