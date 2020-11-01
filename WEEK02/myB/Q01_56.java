package com.algorithm.study_ch02;

import java.util.Random;
import java.util.Scanner;

public class Q01_56 {

	static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int a = rand.nextInt(11);
		System.out.println("키의 최댓값을 구한다.");
		System.out.print("사람 수 : ");
		int[] num = new int[a];
		
		int[] height = new int[a];
		
		System.out.println("키 값은 아래와 같습니다.");
		for(int i = 0; i < num.length; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height["+i+"] : "+height[i]);
		}

		System.out.println("최댓값은 "+maxOf(height)+"입니다.");
	}
}
