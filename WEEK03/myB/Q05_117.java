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
		
		System.out.print("�Ķ���� ���� : ");
		int num = sc.nextInt();
		int[] x = new int[num]; // �Ķ���� ������ num�� �迭
		
		for(int i = 0; i < num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("�˻��� �� : "); // Ű ���� �Է�
		int ky = sc.nextInt();
		
		int idx = binSearch(x, num, ky); // �迭 x���� Ű ���� ky�� ��� �˻�
		
		if(idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		} else {
			System.out.println(ky+"��(��) x["+idx+"]�� �ֽ��ϴ�.");
		}
	}
}
