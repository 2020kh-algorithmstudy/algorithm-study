package com.algorithm.study_ch02;

import java.util.Scanner;

public class Q03_61 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("�迭�� ���̸� �Է� : ");
		int num = sc.nextInt();

		int[] sumArray = new int[num];
	
		sumOf(sumArray);
	}

	static int sumOf(int[] sumArray) {

		int sum = 0;
		
		for(int i = 0; i < sumArray.length; i++) {
			System.out.print("sumArray["+i+"]: ");
			sumArray[i] = sc.nextInt();
		}
		
		System.out.println("�迭���� ��� ����� ����?");
		for (int i = 0; i < sumArray.length; i++) {
			sum += sumArray[i];
		}
		
		System.out.print("��� : "+sum);
		
		return sum;
	}
}