package chap03;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("요소수 : ");
		int num=sc.nextInt();
		int[] x=new int[num+1];
		int[] indexArray=new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i]=sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky=sc.nextInt();
		
		int idx=searchIdx(x, num, ky, indexArray);
		
		if(idx==0) {
			System.out.println("그 값의 요소가 없습니다!");
		}
		else {
			System.out.println(idx+"개 일치");
		}
	}
	
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int cnt=0;
		for(int i=0; i<n; i++) {
			if(a[i]==key) {
				idx[cnt]=i;				// 일치하는 인덱스 저장
				cnt++;
			}
		}
		for(int i=0; i<cnt; i++) {
			System.out.println(idx[i]);
		}
		return cnt;						// 카운트 반환
	}
}
