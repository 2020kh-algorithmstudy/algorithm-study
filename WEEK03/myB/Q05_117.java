package chap01;
import java.util.Scanner;

public class Q05_117 {

	static int binSearch(int[] a, int n, int key) {
		int pl = 0;
		int pr = n-1;
		
		do {
			int pc = (pl+pr)/2;
			if(a[pc] == key) {
				while(a[pc] == a[pc-1]) {
					pc--;
				}
				return pc;
			} else if(a[pc] < key) {
				pl = pc + 1;
			} else {
				pr = pc - 1;
			}
		}while(pl <= pr);
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("파라미터 개수 : ");
		int num = sc.nextInt();
		int[] x = new int[num]; // 파라미터 개수가 num인 배열
		
		for(int i = 0; i < num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : "); // 키 값을 입력
		int ky = sc.nextInt();
		
		int idx = binSearch(x, num, ky); // 배열 x에서 키 값이 ky인 요소 검색
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
		}
	}
}
