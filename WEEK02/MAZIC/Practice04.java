package chap02;

import java.util.Random;

public class Practice04 {

	static void arrCopy(int[] a, int[] b) {
		for(int i=0; i<a.length; i++) {
			a[i]=b[i];					// �迭 ���̸�ŭ �ݺ��ϸ� �� ������ ����
		}
	}
	
	static void swap(int[] arr, int i1, int i2) {
		int tmp=arr[i1];
		arr[i1]=arr[i2];
		arr[i2]=tmp;
	}
	
	static void reverse(int[] arr) {
		for(int i=0; i<arr.length/2; i++) {
			swap(arr, i, arr.length-i-1);
		}
	}
	
	public static void main(String[] args) {
		// Q4. �迭 b�� ��� ��Ҹ� �迭 a�� �����ϱ�
		// Q5/ �迭 b�� ��� ��Ҹ� �迭 a�� �������� �����ϱ�
		Random rand=new Random();
		
		int num=3+rand.nextInt(7);
		System.out.println("��� �� : "+num);
		int[] a=new int[num];
		int[] b=new int[num];			// ������ ũ���� �迭 3�� ����
		int[] c=new int[num];
		
		System.out.print("�����迭 b : ");
		for(int i=0; i<num; i++) {
			b[i]=(-100)+rand.nextInt(200);
			System.out.printf("%3d", b[i]);		// �迭 b�� ���� ������ ����
		}
		System.out.println();
		arrCopy(a, b);					// ī�� �޼ҵ� ȣ��
		System.out.print("����迭 a : ");
		for(int i=0; i<num; i++) {
			System.out.printf("%3d", a[i]);		// �迭 a ���
		}
		System.out.println();
		arrCopy(c, b);					// ���� b�� c�� ī���ϰ�
		reverse(c);						// �������� ����
		System.out.print("�����迭 c : ");
		for(int i=0; i<num; i++) {
			System.out.printf("%3d", c[i]);		// �迭 a ���
		}
	}

}
