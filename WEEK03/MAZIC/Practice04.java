package chap03;

import java.util.Scanner;

public class Practice04 {

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
		
		int idx=binSearch(x, num, ky);
		
		if(idx==0) {
			System.out.println("그 값의 요소가 없습니다!");
		}
		else {
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다!");
		}
	}

	static int binSearch(int[] a, int n, int key) {
		int pl=0;				// 첫 인덱스
		int pr=n-1;				// 끝 인덱스
		
		System.out.printf("  |");
		for(int i=0; i<n; i++) {
			System.out.printf("%3d", i);
		}
		System.out.printf("\n--+");
		for(int i=0; i<n; i++) {
			System.out.printf("---");
		}
		System.out.println();
		do {
			int pc=(pl+pr)/2;	// 중앙 인덱스
			System.out.printf("  |");
			for(int i=0; i<pl; i++) {
				System.out.print("  ");
			}
			System.out.print(" <-");
			for(int i=pl; i<pc-1; i++) {
				System.out.print("   ");
			}								// 줄 맞추느라 한 번 적게 돌리고 + 표기 때 한번치 띄움
			System.out.print("  +");
			for(int i=pc; i<pr-1; i++) {
				System.out.print("   ");
			}								// 줄 맞추느라 한 번 적게 돌리고 -> 표기 때 한번치 띄움
			System.out.println(" ->");
			System.out.print(" "+pc+"|");
			for(int i=0; i<n; i++) {
				System.out.printf("%3d", a[i]);
			}
			System.out.println();
			if(a[pc]==key) {
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
	}			// 매우 그지같은 문제
}
