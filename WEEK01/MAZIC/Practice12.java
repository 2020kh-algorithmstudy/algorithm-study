package chap01;

public class Practice12 {

	public static void main(String[] args) {
		// 수업 때 해봤던 것 같은 문제
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
				System.out.printf("%3d", i*j);
			}
			System.out.println();
		}
	}
		// 곱셈표보다 틀 짜는 걸 어디서 어떻게 할지 고민해보라는 문제같음
}
