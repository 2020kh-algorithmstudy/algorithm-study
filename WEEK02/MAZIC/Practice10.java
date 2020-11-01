package chap02;

import java.util.Scanner;

public class Practice10 {

	static final int VMAX=21;		// 시력 분포(0.0에서 0.1 단위로 21개)
	
	static class PhyscData{
		String name;
		int height;
		double vision;
		
		public PhyscData(String name, int height, double vision) {
			super();
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	static double aveHeight(PhyscData[] dat) {
		double sum=0;
		
		for(int i=0; i<dat.length; i++) {
			sum+=dat[i].height;
		}
		return sum/dat.length;
	}
	
	static void distVision(PhyscData[] dat, int[] dist) {
		int i=0;
		
		dist[i]=0;
		
		for(i=0; i<dat.length; i++) {
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) {
				dist[(int)(dat[i].vision*10)]++;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		PhyscData[] x= {new PhyscData("김희두", 162, 0.3), new PhyscData("김혜준", 173, 0.7), new PhyscData("조선애", 175, 2.0), new PhyscData("배문영", 171, 1.5), new PhyscData("김은영", 168, 0.4), new PhyscData("신재호", 174, 1.2), new PhyscData("우라메", 169, 0.8)};
		int[] vdist=new int[VMAX];
		
		System.out.println("신체검사 리스트");
		System.out.println("이름        키        시력");
		System.out.println("--------------------");
		for(int i=0; i<x.length; i++) {
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		}
		
		System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));
		
		distVision(x, vdist);
		
		System.out.println("\n시력 분포");
		for(int i=0; i<VMAX; i++) {
			int cnt=vdist[i];
			System.out.printf("%3.1f~ : ", i/10.0);
			
			while(cnt!=0) {					// 출력문 뒤 인원 출력을 따로 빼서 cnt에 인원을 넣고
				System.out.print("*");		// 0이 될 때까지 *를 반복 출력
				cnt--;
			}
			System.out.println();
		}
	}

}
