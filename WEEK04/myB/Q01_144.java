package com.ch04.algorithm;

import java.util.Scanner;

public class Q01_144 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InStack s = new InStack(64); // �ִ� 64���� Ǫ���� �� �ִ� ����
		
		while(true) {
			System.out.println("���� ������ �� :" + s.size() + " / " + s.capacity());
			System.out.println("1. Ǫ��	2. ��	3. ��ũ	4. ����	5. �ε��� ã��"
							+"  6. ���� ����ִ��� Ȯ��  7. ���� �� �� �ִ���  8. ���� �����  0. ����");
			System.out.print("���� : ");
			
			int menu = sc.nextInt(); 	// �޴� ����
			if(menu == 0) break; 		// 0�� ������ ����
			
			int x;
			switch(menu) {
			case 1: // push
				System.out.print("������ : ");
				x = sc.nextInt();
				
				try {
					s.push(x);
				} catch (InStack.OverflowInStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;
				
			case 2: // pop
				try {
					x = s.pop();
					System.out.println("���� �����ʹ� "+x+"�Դϴ�.");
				} catch (InStack.EmptyInStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;
				
			case 3 : // peek
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� "+x+"�Դϴ�.");
				} catch(InStack.EmptyInStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;
				
			case 4 : // dump
				s.dump();
				break;
			
			case 5 : // indexOf
				try {
					System.out.print("ã����� ������ �Է� : ");
					x = sc.nextInt();
					int idx = s.indexOf(x);
					if(idx == -1) {
						System.out.println("�ش� �ε����� ���������ʽ��ϴ�.");
					} else {
						System.out.println("�ش� �������� �ε��� ��ȣ�� "+idx+"�Դϴ�.");
					}					
				} catch(InStack.EmptyInStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;
				
			case 6 : // isEmpty
				boolean result = s.isEmpty();
				if(result == true) {
					System.out.println("������ ����ֽ��ϴ�.");
				} else {
					System.out.println("������ ������� �ʽ��ϴ�.");
				}
				break;
				
			case 7 : // isFull
				result = s.isFull();
				if(result == true) {
					System.out.println("������ �� á���ϴ�.");
				} else {
					System.out.println("������ �� �����ʾҽ��ϴ�.");
				}
				break;
				
			case 8 : // clear
				s.clear();
				break;
			}
		}
	}
}
