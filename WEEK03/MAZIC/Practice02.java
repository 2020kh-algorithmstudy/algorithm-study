package chap03;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("요소수 : ");
		int num=sc.nextInt();
		int[] x=new int[num+1];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i]=sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky=sc.nextInt();
		
		int idx=seqSearchSen(x, num, ky);
		
		if(idx==-1) {
			System.out.println("그 값의 요소가 없습니다!");
		}
		else {
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다!");
		}
	}
	
	static int seqSearchSen(int[] a, int n, int key) {
		int i=0;
		int j=0;
		int k=0;
		
		a[n]=key;
		
		System.out.printf("  | ");
		for(int l=0; l<n; l++) {
			System.out.printf("%3d", l);
		}
		System.out.printf("\n--+");
		for(int l=0; l<n; l++) {
			System.out.printf("---");
		}
		System.out.println();
		for(i=0; a[i]!=key; i++) {
			System.out.printf("  |");
			for(k=0; k<=i; k++) {
				System.out.print("   ");
			}
			System.out.println("*");
			System.out.printf("%2d| ", i);
			for(j=0; j<n; j++) {
				System.out.printf("%3d", a[j]);
			}
			System.out.println();
		}
		System.out.printf("  |");
		for(k=0; k<=i; k++) {
			System.out.print("   ");
		}
		System.out.println("*");
		System.out.printf("%2d| ", i);
		for(j=0; j<n; j++) {
			System.out.printf("%3d", a[j]);
		}
		System.out.println();
		
		return i==n ? -1:i;
		// 쓰레기같은 문제
	}
}
