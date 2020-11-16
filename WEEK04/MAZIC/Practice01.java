package chap04;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		IntStack s=new IntStack(64);
		
		while(true) {
			System.out.println("현재 데이터 수 : "+s.size()+" / "+s.capacity());
			System.out.print("1.푸시 2.팝 3.피크 4.덤프 5.클리어 6.캐퍼서티 7.사이즈 8.엠티 9.풀 0.종료 : ");
			
			int menu=sc.nextInt();
			if(menu==0) {
				break;
			}
			
			int x;
			switch(menu) {
			case 1:{
				System.out.print("데이터 : ");
				x=sc.nextInt();
				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다!");
				}
				break;
			}
			case 2:{
				try {
					x=s.pop();
					System.out.println("팝 한 데이터는 "+x+" 입니다!");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다!");
				}
				break;
			}
			case 3:{
				try {
					x=s.peek();
					System.out.println("피크한 데이터는 "+x+" 입니다!");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다!");
				}
				break;
			}
			case 4:{
				s.dump();
				break;
			}
			case 5:{
				try {
					s.clear();
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다!");
				}
				break;
			}
			case 6:{
				try {
					System.out.println("스택의 전체 용량은 "+s.capacity()+" 입니다!");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다!");
				}
				break;
			}
			case 7:{
				try {
					System.out.println("스택 안의 데이터 수는 "+s.size()+" 입니다!");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다!");
				}
				break;
			}
			case 8:{
				try {
					if(!(s.isEmpty())) {
						System.out.println("스택이 비어 있지 않습니다!");
					}
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다!");
				}
				break;
			}
			case 9:{
				try {
					if(!(s.isFull())) {
						System.out.println("스택이 가득 차 있지 않습니다!");
					}
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다!");
				}
				break;
			}
			}
		}
	}

}
