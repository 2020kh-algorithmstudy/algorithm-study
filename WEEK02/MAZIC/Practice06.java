package chap02;

import java.util.Scanner;

public class Practice06 {

	static void swap(char[] arr, int i1, int i2) {
		char tmp=arr[i1];
		arr[i1]=arr[i2];
		arr[i2]=tmp;
	}
	
	static void reverse(char[] arr, int index) {
		for(int i=0; i<index/2; i++) {
			swap(arr, i, index-i-1);
		}
	}
	static int cardConvRev(int x, int r, char[] d) {
		// 정수값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환
		int digits=0;				// 변환 후의 자릿수
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";	// 36까지 값을 표현하기 위한 문자열
		
		do {
			d[digits++]=dchar.charAt(x%r);		// r로 나눈 나머지를 저장
			x/=r;
		}while(x!=0);
		reverse(d, digits);				// 자릿수=배열에 저장된 데이터 길이
		return digits;			// reverse 함수 그대로 갖다 쓰면 배열 길이로 스왑하므로 a[0] a[35]를 스왑함
	}
	public static void main(String[] args) {
		// 배열의 앞쪽에 아랫자리가 아니라 윗자리를 넣어두게 만들기
		Scanner sc=new Scanner(System.in);
		int no;						// 변환하는 정수
		int cd;						// 기수
		int dno;					// 변환 후의 자릿수
		int retry;					// 다시 한 번?
		char[] cno=new char[32];	// 변환 후 각 자리의 숫자를 넣어두는 문자 배열
		
		System.out.println("10진수를 기수 변환합니다!");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수 : ");
				no=sc.nextInt();
			}while(no<0);						// 음이 아닌 정수만 입력 받기위한 반복문
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36) : ");
				cd=sc.nextInt();
			}while(cd<2 || cd>36);				// 2~36의 값만 받기위한 반복문
			
			dno=cardConvRev(no, cd, cno);		// no를 cd진수로 변환
												// no를 cd로 반복해서 나눈 나머지가 들어있는 배열을 리턴
			System.out.print(cd+"진수로는 ");
			for(int i=0; i<dno; i++) {		// 배열을 순차 출력
				System.out.print(cno[i]);
			}
			System.out.println("입니다!");
			
			System.out.print("한 번 더 할까요? (1. 예 / 0. 아니오) : ");
			retry=sc.nextInt();
		}while(retry==1);
	}

}
