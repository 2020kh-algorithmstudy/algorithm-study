package chap01;

public class Practice13 {

	public static void main(String[] args) {
		// 12번 문제를 덧셈표로
		int i=0;
		int j=0;
		System.out.print("  |");
		for(int k=1; k<10; k++) {
			System.out.printf("%3d", k);
		}
		System.out.println();
		System.out.println("--+---------------------------");
		for(i=1; i<10; i++) {
			System.out.print(i+" |");
			for(j=1; j<10; j++) {
				System.out.printf("%3d", i+j);
			}
			System.out.println();
		}
	}
		// 이 문제는 출제 의도를 모르겠음
}
