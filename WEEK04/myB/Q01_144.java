package com.ch04.algorithm;

import java.util.Scanner;

public class Q01_144 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InStack s = new InStack(64); // 최대 64개를 푸시할 수 있는 스택
		
		while(true) {
			System.out.println("현재 데이터 수 :" + s.size() + " / " + s.capacity());
			System.out.println("1. 푸시	2. 팝	3. 피크	4. 덤프	5. 인덱스 찾기"
							+"  6. 스택 비어있는지 확인  7. 스택 꽉 차 있는지  8. 스택 지우기  0. 종료");
			System.out.print("선택 : ");
			
			int menu = sc.nextInt(); 	// 메뉴 고르기
			if(menu == 0) break; 		// 0번 누르면 종료
			
			int x;
			switch(menu) {
			case 1: // push
				System.out.print("데이터 : ");
				x = sc.nextInt();
				
				try {
					s.push(x);
				} catch (InStack.OverflowInStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
				
			case 2: // pop
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 "+x+"입니다.");
				} catch (InStack.EmptyInStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
				
			case 3 : // peek
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 "+x+"입니다.");
				} catch(InStack.EmptyInStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
				
			case 4 : // dump
				s.dump();
				break;
			
			case 5 : // indexOf
				try {
					System.out.print("찾고싶은 데이터 입력 : ");
					x = sc.nextInt();
					int idx = s.indexOf(x);
					if(idx == -1) {
						System.out.println("해당 인덱스는 존재하지않습니다.");
					} else {
						System.out.println("해당 데이터의 인덱스 번호는 "+idx+"입니다.");
					}					
				} catch(InStack.EmptyInStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
				
			case 6 : // isEmpty
				boolean result = s.isEmpty();
				if(result == true) {
					System.out.println("스택이 비어있습니다.");
				} else {
					System.out.println("스택이 비어있지 않습니다.");
				}
				break;
				
			case 7 : // isFull
				result = s.isFull();
				if(result == true) {
					System.out.println("스택이 꽉 찼습니다.");
				} else {
					System.out.println("스택이 꽉 차지않았습니다.");
				}
				break;
				
			case 8 : // clear
				s.clear();
				break;
			}
		}
	}
}
