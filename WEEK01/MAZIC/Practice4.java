package chap01;

public class Practice4 {
	// Q4
	static int median(int a, int b, int c) {
		
		if(a>b) {
			if(a>c) {
				if(b>c) {
					return b;
				}
				else {
					return c;
				}
			}
			else {
				return a;
			}
		}
		else {
			if(a>c) {
				return a;
			}
			else if(b>c) {
				return c;
			}
			else {
				return b;
			}
		}
	}
	// 그냥 a랑 b랑 비교해보고 b랑 c랑 비교해보고 ... 반복해서 짜면 그게 트리형태
	
	// Q5
	static int med3(int a, int b, int c) {
		if((b>=a && c<=a) || (b<=a && c>=a)) {
			return a;
		}
		else if((a>b && c<b) || (a<b && c>b)) {
			return b;
		}
		return c;
	}
	// 트리 형태는 단 끝으로 갈수록 다른 상황을 배제하기에 경우의 수가 점차 줄어드는데 반해
	// 해당 검색 알고리즘은 a가 중앙 값인 경우의 수 만큼 b가 중앙 값인 경우의 수를 똑같이 검색
	// 즉, a가 중앙값인 경우를 검색 중 b가 중앙값인 경우가 나올 때도 a가 중앙 값인 경우에 대한 조건문이므로 패스했다가
	// b가 중앙값인 경우를 검색할 때(else if문)에서 찾아내므로 경우의 수를 중복 검색하게 되어 효율이 떨어짐(트리 구조는 중복 검색이 없음)
	// 예시) a=3 b=1 c2 일 때를 비교
	// but, 해당 코드 검색시간 비교 결과 문제 5의 코드가 더 빨리 나왔음
	// 아마 들어가는 값에 따라 해당 메소드에서 더 빠르게 처리될 수도 있어서 그런 거라 추정
	
	public static void main(String[] args) {
		
		System.out.println("median(3,2,1) = " + median(3, 2, 1));
		System.out.println("median(3,2,2) = " + median(3, 2, 2));
		System.out.println("median(3,1,2) = " + median(3, 1, 2));
		System.out.println("median(3,2,3) = " + median(3, 2, 3));
		System.out.println("median(2,1,3) = " + median(2, 1, 3));
		System.out.println("median(3,3,2) = " + median(3, 3, 2));
		System.out.println("median(3,3,3) = " + median(3, 3, 3));
		System.out.println("median(2,2,3) = " + median(2, 2, 3));
		System.out.println("median(2,3,1) = " + median(2, 3, 1));
		System.out.println("median(2,3,2) = " + median(2, 3, 2));
		System.out.println("median(1,3,2) = " + median(1, 3, 2));
		System.out.println("median(2,3,3) = " + median(2, 3, 3));
		System.out.println("median(1,2,3) = " + median(1, 2, 3));
				
		System.out.println("med3(3,2,1) = " + med3(3, 2, 1));
		System.out.println("med3(3,2,2) = " + med3(3, 2, 2));
		System.out.println("med3(3,1,2) = " + med3(3, 1, 2));
		System.out.println("med3(3,2,3) = " + med3(3, 2, 3));
		System.out.println("med3(2,1,3) = " + med3(2, 1, 3));
		System.out.println("med3(3,3,2) = " + med3(3, 3, 2));
		System.out.println("med3(3,3,3) = " + med3(3, 3, 3));
		System.out.println("med3(2,2,3) = " + med3(2, 2, 3));
		System.out.println("med3(2,3,1) = " + med3(2, 3, 1));
		System.out.println("med3(2,3,2) = " + med3(2, 3, 2));
		System.out.println("med3(1,3,2) = " + med3(1, 3, 2));
		System.out.println("med3(2,3,3) = " + med3(2, 3, 3));
		System.out.println("med3(1,2,3) = " + med3(1, 2, 3));
	}
}
