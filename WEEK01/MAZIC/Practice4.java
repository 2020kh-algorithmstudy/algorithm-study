package chap01;

public class Practice4 {
	// Q4
	static int median(int a, int b, int c) {
		
		if(a>b) {
			if(a>c) {
				if(b>c) {
					return b;
				}
				else {
					return c;
				}
			}
			else {
				return a;
			}
		}
		else {
			if(a>c) {
				return a;
			}
			else if(b>c) {
				return c;
			}
			else {
				return b;
			}
		}
	}
	// �׳� a�� b�� ���غ��� b�� c�� ���غ��� ... �ݺ��ؼ� ¥�� �װ� Ʈ������
	
	// Q5
	static int med3(int a, int b, int c) {
		if((b>=a && c<=a) || (b<=a && c>=a)) {
			return a;
		}
		else if((a>b && c<b) || (a<b && c>b)) {
			return b;
		}
		return c;
	}
	// Ʈ�� ���´� �� ������ ������ �ٸ� ��Ȳ�� �����ϱ⿡ ����� ���� ���� �پ��µ� ����
	// �ش� �˻� �˰����� a�� �߾� ���� ����� �� ��ŭ b�� �߾� ���� ����� ���� �Ȱ��� �˻�
	// ��, a�� �߾Ӱ��� ��츦 �˻� �� b�� �߾Ӱ��� ��찡 ���� ���� a�� �߾� ���� ��쿡 ���� ���ǹ��̹Ƿ� �н��ߴٰ�
	// b�� �߾Ӱ��� ��츦 �˻��� ��(else if��)���� ã�Ƴ��Ƿ� ����� ���� �ߺ� �˻��ϰ� �Ǿ� ȿ���� ������(Ʈ�� ������ �ߺ� �˻��� ����)
	// ����) a=3 b=1 c2 �� ���� ��
	// but, �ش� �ڵ� �˻��ð� �� ��� ���� 5�� �ڵ尡 �� ���� ������
	// �Ƹ� ���� ���� ���� �ش� �޼ҵ忡�� �� ������ ó���� ���� �־ �׷� �Ŷ� ����
	
	public static void main(String[] args) {
		
		System.out.println("median(3,2,1) = " + median(3, 2, 1));
		System.out.println("median(3,2,2) = " + median(3, 2, 2));
		System.out.println("median(3,1,2) = " + median(3, 1, 2));
		System.out.println("median(3,2,3) = " + median(3, 2, 3));
		System.out.println("median(2,1,3) = " + median(2, 1, 3));
		System.out.println("median(3,3,2) = " + median(3, 3, 2));
		System.out.println("median(3,3,3) = " + median(3, 3, 3));
		System.out.println("median(2,2,3) = " + median(2, 2, 3));
		System.out.println("median(2,3,1) = " + median(2, 3, 1));
		System.out.println("median(2,3,2) = " + median(2, 3, 2));
		System.out.println("median(1,3,2) = " + median(1, 3, 2));
		System.out.println("median(2,3,3) = " + median(2, 3, 3));
		System.out.println("median(1,2,3) = " + median(1, 2, 3));
				
		System.out.println("med3(3,2,1) = " + med3(3, 2, 1));
		System.out.println("med3(3,2,2) = " + med3(3, 2, 2));
		System.out.println("med3(3,1,2) = " + med3(3, 1, 2));
		System.out.println("med3(3,2,3) = " + med3(3, 2, 3));
		System.out.println("med3(2,1,3) = " + med3(2, 1, 3));
		System.out.println("med3(3,3,2) = " + med3(3, 3, 2));
		System.out.println("med3(3,3,3) = " + med3(3, 3, 3));
		System.out.println("med3(2,2,3) = " + med3(2, 2, 3));
		System.out.println("med3(2,3,1) = " + med3(2, 3, 1));
		System.out.println("med3(2,3,2) = " + med3(2, 3, 2));
		System.out.println("med3(1,3,2) = " + med3(1, 3, 2));
		System.out.println("med3(2,3,3) = " + med3(2, 3, 3));
		System.out.println("med3(1,2,3) = " + med3(1, 2, 3));
	}
}
