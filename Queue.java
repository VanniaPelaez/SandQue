package Package1;

import java.util.Arrays;

public class Queue {
	int top;
	int tail;
	char[] Queue;
	String text;
	
	public Queue() {
		this.top = 10;
		this.tail = 0;
		this.Queue = new char[top];
	}
	
	public void insert(char data) {
		if(tail == top) {
			System.out.println("Está lleno"); 
		} else {
			this.Queue[tail] = data;
			tail++; 
		} 
	} 

	public char delete() {
		if(tail == 0) {
			System.out.println("Vacío"); 
			return '#'; 
		} else { 
			char temp = this.Queue[0];
			this.Queue[0] = ' ';
			return temp;  
		} 

	}
	
	public void print() {
		System.out.println(Arrays.toString(this.Queue));
	}

}
