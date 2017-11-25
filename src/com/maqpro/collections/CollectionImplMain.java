package com.maqpro.collections;

import java.util.Stack;

public class CollectionImplMain {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(8);
		stack.push(101);
		stack.push(1);
		stack.push(-43);
		System.out.println("stack search: " + stack.search(-43));
		System.out.println("stack search: " + stack.search(101));
		System.out.println("stack pop: " + stack.pop());
		System.out.println("stack pop: " + stack.pop());
		System.out.println("stack peek: " +stack.peek());
		System.out.println("stack peek: " +stack.peek());
		System.out.println("stack peek: " +stack.peek());
		System.out.println("stack pop: " + stack.pop());
		System.out.println("stack pop: " + stack.pop());
		
		//System.out.println("stack peek: " +stack.peek()); //
		
	}
}
