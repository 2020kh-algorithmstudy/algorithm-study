package chap02;

import java.util.Random;

public class Practice04 {

	static void arrCopy(int[] a, int[] b) {
		for(int i=0; i<a.length; i++) {
			a[i]=b[i];					// 배열 길이만큼 반복하며 각 데이터 복사
		}
	}
	
	static void swap(int[] arr, int i1, int i2) {
		int tmp=arr[i1];
		arr[i1]=arr[i2];
		arr[i2]=tmp;
	}
	
	static void reverse(int[] arr) {
		for(int i=0; i<arr.length/2; i++) {
			swap(arr, i, arr.length-i-1);
		}
	}
	
	public static void main(String[] args) {
		// Q4. 배열 b의 모든 요소를 배열 a에 복사하기
		// Q5/ 배열 b의 모든 요소를 배열 a에 역순으로 복사하기
		Random rand=new Random();
		
		int num=3+rand.nextInt(7);
		System.out.println("요소 수 : "+num);
		int[] a=new int[num];
		int[] b=new int[num];			// 동일한 크기의 배열 3개 생성
		int[] c=new int[num];
		
		System.out.print("원본배열 b : ");
		for(int i=0; i<num; i++) {
			b[i]=(-100)+rand.nextInt(200);
			System.out.printf("%3d", b[i]);		// 배열 b에 랜덤 데이터 삽입
		}
		System.out.println();
		arrCopy(a, b);					// 카피 메소드 호출
		System.out.print("정상배열 a : ");
		for(int i=0; i<num; i++) {
			System.out.printf("%3d", a[i]);		// 배열 a 출력
		}
		System.out.println();
		arrCopy(c, b);					// 먼저 b를 c에 카피하고
		reverse(c);						// 역순으로 스왑
		System.out.print("역순배열 c : ");
		for(int i=0; i<num; i++) {
			System.out.printf("%3d", c[i]);		// 배열 a 출력
		}
	}

}
