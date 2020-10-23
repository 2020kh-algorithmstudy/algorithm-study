package chap01;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다!");
		System.out.print("n의 값 : ");
		int n=sc.nextInt();
		
		int sum=0;
		int i=1;
		
		while(i<=n) {
			sum+=i;
			i++;
		}
		
		System.out.println("i의 값은 "+i);				// Q6
		// -> i++은 후위연산자이므로 현재 값으로 먼저 수행 후 +1시켜준다
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다!");
	}

}
