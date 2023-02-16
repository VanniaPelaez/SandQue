package Package1;

import java.util.Arrays;

public class Stack {
	int MAX;
	char[] Stack;
	int top;
	String text;
	
	public Stack() {
		this.MAX = 10;
		this.top = 0;
		this.Stack = new char[MAX];
	}
	
	public Stack(String text) {
		String x = "";
		for(int i=0; i<text.length(); i++) {
			if(text.charAt(i) != ' ') {
				x = x + text.toLowerCase().charAt(i);
			}
		}
			
		this.MAX = x.length();
		this.top = 0;
		this.text = x;
		this.Stack = new char[MAX];
	}
	
	public char pop() { 
		if(top == 0) {
			System.out.println("Stack is empty"); 
			return '#'; 
		} else { 
			top--; 
			char temp = this.Stack[top];
			this.Stack[top] = ' ';
			return temp; 
		} 
	}
	
	public void push(char data) { 
		if(top == MAX) {
			System.out.println("Stack is full");
		} else { 
			Stack[top] = data;
			top++;
		} 
	} 

	public void print() {
		System.out.println(Arrays.toString(Stack));
	}
	
	public void invertir() {
		int j = 0;
		for(int i=this.text.length()-1; i>=0; i--) {
			this.Stack[j] = this.text.charAt(i);
			j++;
		}
	}
	
	public palindromo() {
		this.invertir();
		int j = 0;
		for(int i=0; i<this.text.length(); i++) {
			if(Stack[i] == this.text.charAt(i)) {
				j++;
			}
		}
		
		if(j==this.text.length()) {
			return true;
		} else {
			return false;
		}
	}

}