package com.algorithm.study;

public class Q01_19 {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		if(d > max) {
			max = d;
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("max4(4,2,6,1) = "+ max4(4,2,6,1));
		System.out.println("max4(6,3,9,4) = "+ max4(6,3,9,4));
		System.out.println("max4(1,4,8,2) = "+ max4(1,4,8,2));
		System.out.println("max4(7,2,6,1) = "+ max4(7,2,6,1));
		System.out.println("max4(8,4,6,5) = "+ max4(8,4,6,5));
		System.out.println("max4(3,7,1,4) = "+ max4(3,7,1,4));
	}

}
