package chap02;

import java.util.Random;
import java.util.Scanner;

public class Practice02 {

	static void swap(int[] arr, int i1, int i2) {
		System.out.println("a["+i1+"]��(��) a["+i2+"]�� ��ȯ�մϴ�!");		// ���� �� ���
		int tmp=arr[i1];
		arr[i1]=arr[i2];
		arr[i2]=tmp;
	}
	
	static void reverse(int[] arr) {
		for(int i=0; i<arr.length/2; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.printf("%3d ", arr[j]);
			}				// ���� �� ���
			System.out.println();
			swap(arr, i, arr.length-i-1);
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}					// ������ ���� ��� ���
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Random rand=new Random();
		
		int num=3+rand.nextInt(10);
		System.out.println("��� �� : "+num);
		int[] arr=new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i]=(-100)+rand.nextInt(200);
		}
		reverse(arr);
		System.out.println("��Ҹ� �������� �����߽��ϴ�!");
	}

}
