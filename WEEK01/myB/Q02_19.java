package com.algorithm.study;

public class Q02_19 {

	static int min3(int a, int b, int c) {
		int min = a;
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		return min;
	}
	public static void main(String[] args) {
		System.out.println("min3(6,4,5) = "+ min3(6,4,5));
		System.out.println("min3(2,3,3) = "+ min3(2,3,3));
		System.out.println("min3(3,3,4) = "+ min3(3,3,4));
		System.out.println("min3(9,7,6) = "+ min3(9,7,6));
		System.out.println("min3(1,6,8) = "+ min3(1,6,8));

	}

}
