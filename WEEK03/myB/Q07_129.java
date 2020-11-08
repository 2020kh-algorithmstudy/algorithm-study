package com.ch03.algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q07_129 {
	static class PhyscData {
		private String name;
		private int height;
		private double vision;
		
		// 생성자
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		// 문자열을 반환하는 메소드(정보 확인용)
		public String toString() {
			return name + " " + height + " " +vision;
		}
		
		// 오름차순으로 정렬하기 위한 comparator
		public static final Comparator VISION_ORDER = new VisionOrderComparator();
		
		private static class VisionOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				if(d1.vision > d2.vision) {
					return 1;
				} else if(d1.vision < d2.vision) {
					return -1;
				} else {
					return 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhyscData[] x = {
				new PhyscData("이나령", 162, 0.3),
				new PhyscData("유지훈", 168, 0.4),
				new PhyscData("김한결", 169, 0.8),
				new PhyscData("홍준기", 171, 1.5),
				new PhyscData("전서현", 173, 0.7),
				new PhyscData("이호연", 174, 1.2),
				new PhyscData("이수민", 175, 2.0),
		};
		System.out.print("시력이 얼마인 사람을 찾나요? : ");
		double vision = sc.nextDouble();
		
		int idx = Arrays.binarySearch(x, new PhyscData("",0,vision), PhyscData.VISION_ORDER);
		
		if(idx < 0) {
			System.out.println("요소가 없습니다.");
		} else {
			System.out.println("x["+idx+"]에 있습니다.");
			System.out.println("찾은 데이터 : "+x[(int) idx]);
		}
	}
}
