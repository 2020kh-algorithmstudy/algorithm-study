package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Practice07 {

	static class PhyscData{
		private String name;
		private int height;
		private double vision;
		
		public PhyscData(String name, int height, double vision) {
			super();
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		@Override
		public String toString() {
			return "name=" + name + ", height=" + height + ", vision=" + vision;
		}
		
		public static final Comparator<PhyscData> VISION_ORDER=new VisionOrderComparator();
		
		private static class VisionOrderComparator implements Comparator<PhyscData>{
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.vision>d2.vision) ? 1:(d1.vision<d2.vision) ? -1:0;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		PhyscData[] x= {
				new PhyscData("김희두", 162, 0.3),
				new PhyscData("김혜준", 168, 0.4),
				new PhyscData("조선애", 173, 0.7),
				new PhyscData("우라메", 169, 0.8),
				new PhyscData("신재호", 174, 1.2),
				new PhyscData("김은영", 171, 1.5),
				new PhyscData("배문영", 175, 2.0)
		};
		
		System.out.print("시력이 몇인 사람을 찾고있나요? : ");
		double vision=sc.nextDouble();
		
		int idx=Arrays.binarySearch(x, new PhyscData("", 0, vision), PhyscData.VISION_ORDER);
		
		for(int i=0; i<7; i++) {
			System.out.println(x[i]);
		}
		
		if(idx<0) {
			System.out.println("요소가 없습니다!");
		}
		else {
			System.out.println("x["+idx+"]에 있습니다!");
			System.out.println("찾은 데이터 : "+x[idx]);
		}
	}
}
