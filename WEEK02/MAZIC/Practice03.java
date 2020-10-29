package chap02;

import java.util.Random;

public class Practice03 {

	static int sumOf(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Random rand=new Random();
		
		int num=3+rand.nextInt(10);
		System.out.println("요소 수 : "+num);
		int[] arr=new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i]=(-100)+rand.nextInt(200);
		}
		for(int i=0; i<num; i++) {
			System.out.printf("%3d", arr[i]);
		}
		System.out.print(" 의 총 합은 : "+sumOf(arr)+" 입니다!");
	}

}
