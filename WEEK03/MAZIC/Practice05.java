package chap03;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("요소수 : ");
		int num=sc.nextInt();
		int[] x=new int[num];
		
		System.out.println("오름차순으로 입력하세요!");
		
		System.out.print("x[0] : ");
		x[0]=sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x["+i+"] : ");
				x[i]=sc.nextInt();
			}while(x[i]<x[i-1]);			// 바로 앞의 요소보다 작으면 다시 입력
		}									// 반복하여 오름차순으로 입력받기
		
		System.out.print("검색할 값 : ");
		int ky=sc.nextInt();
		
		int idx=binSearchX(x, num, ky);
		
		if(idx==0) {
			System.out.println("그 값의 요소가 없습니다!");
		}
		else {
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다!");
		}
	}

	static int binSearchX(int[] a, int n, int key) {
		int pl=0;				// 첫 인덱스
		int pr=n-1;				// 끝 인덱스
		
		do {
			int pc=(pl+pr)/2;	// 중앙 인덱스
			if(a[pc]==key) {					// 첫 일치 값 찾았을 때
				for(int i=pc; i>0; i--) {		// 그 인덱스부터 내려가면서
					if(a[i]==key) {				// 일치하는 인덱스를 반복해서 저장
						pc=i;
					}
				}
				return pc;
			}
			else if(a[pc]<key) {
				pl=pc+1;		// 검색 값이 더 크면  뒤에 반
			}
			else {
				pr=pc-1;		// 검색 값이 더 작으면 앞에 반
			}
		}while(pl<=pr);
		return -1;
	}
}
