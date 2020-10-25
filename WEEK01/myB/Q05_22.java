package com.algorithm.study;

public class Q05_22 {

	static int med3(int a, int b, int c) {
		if((b >= a) && (c <= a) || (b <= a) && (c >= a)) {
		// (= a < b)  (= a > c)   (= a > b)   (= a > c) 
			return a;
		} else if ((a > b) && (c < b) || (a < b) && (c > b)) {
			// 이곳의 else if 조건은 if의 조건이 참일 때 성립되는 조건이다.
			// 따라서, 결과적으로 같은 조건을 2번 표기하는 것은 비효율적이라고 할 수 있다.  
			return b;
		}
		return c;
	}
	
	public static void main(String[] args) {
		System.out.println("med3(6,4,5) = "+ med3(6,4,5));
		System.out.println("med3(2,3,3) = "+ med3(2,3,3));
		System.out.println("med3(3,3,4) = "+ med3(3,3,4));
		System.out.println("med3(9,7,6) = "+ med3(9,7,6));
		System.out.println("med3(1,6,8) = "+ med3(1,6,8));
	}
}
