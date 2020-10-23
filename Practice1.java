package chap01;

public class Practice1 {

	static int max4(int a, int b, int c, int d) {
		int max=a;
		
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		if(d>max) {
			max=d;
		}
		return max;
	}										// Q1 네 값의 최대값 구하기
	static int min3(int a, int b, int c) {
		int min=a;
		
		if(b<min) {
			min=b;
		}
		if(c<min) {
			min=c;
		}
		return min;
	}										// Q2 세 값의 최소값 구하기
	static int min4(int a, int b, int c, int d) {
		int min=a;
		
		if(b<min) {
			min=b;
		}
		if(c<min) {
			min=c;
		}
		if(d<min) {
			min=d;
		}
		return min;
	}										// Q3 네 값의 최소값 구하기
	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max4(4, 3, 2, 1));
		System.out.println("max3(3,2,2) = " + max4(3, 2, 2, 4));
		System.out.println("max3(3,1,2) = " + max4(3, 1, 2, 4));
		System.out.println("max3(3,2,3) = " + max4(3, 4, 2, 3));
		System.out.println("max3(2,1,3) = " + min3(2, 1, 3));
		System.out.println("max3(3,3,2) = " + min3(1, 1, 2));
		System.out.println("max3(3,3,3) = " + min3(3, 1, 3));
		System.out.println("max3(2,2,3) = " + min3(2, 2, 1));
		System.out.println("max3(2,3,1) = " + min4(2, 3, 4, 1));
		System.out.println("max3(2,3,2) = " + min4(1, 2, 3, 2));
		System.out.println("max3(1,3,2) = " + min4(1, 3, 2, 4));
		System.out.println("max3(2,3,3) = " + min4(2, 3, 1, 3));
	}

}
