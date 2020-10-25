package com.algorithm.study;

public class Q03_19 {

	static int min4(int a, int b, int c, int d) {
		int min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		if (d < min) {
			min = d;
		}
		return min;
	}
	public static void main(String[] args) {
		System.out.println("min4(6,4,5,1) = " + min4(6, 4, 5,1));
		System.out.println("min4(2,3,3,8) = " + min4(2, 3, 3,8));
		System.out.println("min4(3,3,4,5) = " + min4(3, 3, 4,5));
		System.out.println("min4(9,7,6,4) = " + min4(9, 7, 6,4));
		System.out.println("min4(1,6,8,2) = " + min4(1, 6, 8,2));

	}
}
