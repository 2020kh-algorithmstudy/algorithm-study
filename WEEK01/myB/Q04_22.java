package com.algorithm.study;

public class Q04_22 {
	static int med3(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			} else if(a <= c) {
				return a;
			} else {
				return c;
			}
		} else if(a > c) {
			return a;
		} else if(a < c) {
			return c;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		System.out.println("med3(6,4,5) = "+ med3(6,4,5));
		System.out.println("med3(2,3,3) = "+ med3(2,3,3));
		System.out.println("med3(3,3,4) = "+ med3(3,3,4));
		System.out.println("med3(9,7,6) = "+ med3(9,7,6));
		System.out.println("med3(1,6,8) = "+ med3(1,6,8));


	}

}
