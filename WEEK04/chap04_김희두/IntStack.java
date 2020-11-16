package com.khd.chap04;

public class IntStack {
	
	private int max;
	private int ptr;
	private int[] stk;
	
	@SuppressWarnings("serial")
	public class EmptyIntStackException extends RuntimeException {
				public EmptyIntStackException() { }
	}
	
	public class OverflowInstackException extends RuntimeException {
		public void OverflowIntStackException() { }
	}
	
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
		} catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int indexOf(int max) {
		for (int i = ptr-1; i>=0; i--) {
			if(stk[i] == max) {
				return i;
			}
		} return -1;
			
	}
	
	public void clear() {
		ptr=0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return ptr;
	}
	
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	public boolean isFull() {
		return ptr >= max;
	}
	
	public void dump() {
		if(ptr <= 0) {
			System.out.println("스택이 비어있습니다.");
		} 	else {
				for(int i=0; i<ptr; i++) {
					System.out.print(stk[i]+" ");
				} 	System.out.println();
			}
	}
	
	public int push(int x) throws OverflowInstackException {
			if(ptr >= max) {
				throw new OverflowInstackException();
				
			} return stk[ptr++] = x;
	}
	
	public int pop() throws EmptyIntStackException {
		if(ptr <= 0) {
			throw new EmptyIntStackException(); 
		} return stk[ptr--];
	}
	
	public int peek() throws EmptyIntStackException {
		if(ptr <= 0) {
			throw new EmptyIntStackException();
		} return stk[ptr-1];
	}
}
	
	
