package chap01;

import java.util.Scanner;

public class Q10_93 {

	static final int VMAX = 21;
	
	static class PhyscData {
		String name;   // 이름
		int height;    // 키
		double vision; // 시력
		
		public PhyscData(String name, int height, double vision) {
			super();
			this.name = name;
			this.height = height;
			this.vision = vision;
		}		
	}
	
	// 키의 평균값 
	static double avgHeight(PhyscData[] dat) {
		double sum = 0;
		
		for(int i = 0; i < dat.length; i++) {
			sum += dat[i].height;
		}		
		return sum / dat.length;
	}
	
	// 시력 분포를 구함
	static void distVision(PhyscData[] dat, int[] dist) {
		int i = 0;
		dist[i] = 0;
		for(i = 0; i < dat.length; i++) {
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) {
				dist[(int)(dat[i].vision*10)]++;
			}
		}
	}
	
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		
 		PhyscData[] x = {
 				new PhyscData("박영규", 162, 0.3),
 				new PhyscData("함소진", 173, 0.3),
 				new PhyscData("차미연", 175, 2.0),
 				new PhyscData("홍민아", 171, 2.0),
 				new PhyscData("양정호", 168, 1.2),
 				new PhyscData("감성우", 174, 1.2),
 				new PhyscData("배준영", 169, 0.8)
 		};
 		int[] vdist = new int[VMAX]; // 시력 분포
 		
 		System.out.println("■ 신체 검사 리스트 ■");
 		System.out.println("이름         키      시력");
 		System.out.println("---------------");
 		for(int i = 0; i < x.length; i++) {
 			System.out.printf("%-8s%3d%5.1f\n",x[i].name,x[i].height,x[i].vision);
 		}
 		System.out.printf("\n평균 키 : %5.1fcm\n",avgHeight(x));
 		
 		distVision(x, vdist);
 		
 		System.out.println("\n 시력 분포");
 		for(int i = 0; i < VMAX; i++) {
 			System.out.printf("%3.1f~ : ",i / 10.0);
 			for(int j = 0; j < vdist[i]; j++) {
 				System.out.print("*");
 			}
 			System.out.println();
 		} 
 		
	}
}
