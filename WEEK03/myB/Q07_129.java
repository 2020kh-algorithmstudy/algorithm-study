package com.ch03.algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q07_129 {
	static class PhyscData {
		private String name;
		private int height;
		private double vision;
		
		// ������
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		// ���ڿ��� ��ȯ�ϴ� �޼ҵ�(���� Ȯ�ο�)
		public String toString() {
			return name + " " + height + " " +vision;
		}
		
		// ������������ �����ϱ� ���� comparator
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
				new PhyscData("�̳���", 162, 0.3),
				new PhyscData("������", 168, 0.4),
				new PhyscData("���Ѱ�", 169, 0.8),
				new PhyscData("ȫ�ر�", 171, 1.5),
				new PhyscData("������", 173, 0.7),
				new PhyscData("��ȣ��", 174, 1.2),
				new PhyscData("�̼���", 175, 2.0),
		};
		System.out.print("�÷��� ���� ����� ã����? : ");
		double vision = sc.nextDouble();
		
		int idx = Arrays.binarySearch(x, new PhyscData("",0,vision), PhyscData.VISION_ORDER);
		
		if(idx < 0) {
			System.out.println("��Ұ� �����ϴ�.");
		} else {
			System.out.println("x["+idx+"]�� �ֽ��ϴ�.");
			System.out.println("ã�� ������ : "+x[(int) idx]);
		}
	}
}
