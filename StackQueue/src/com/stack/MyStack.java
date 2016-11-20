package com.stack;

import java.util.EmptyStackException;

public class MyStack<T> {
	private StackNode<T> top;
	
	public void push(T data){
		StackNode<T> node = new StackNode<T>(data);
		node.next = top;
		top = node;
	}
	
	public T pop(){
		if(top == null)
			throw new EmptyStackException();
		else{
			T item = top.data;
			top = top.next;
			return item;
		}
	}
	
	public T peek(){
		if(top == null)
			throw new EmptyStackException();
		else
			return top.data;	
	}
	
	public boolean isEmpty(){
		return top == null;
	}
}

class StackNode<T> {
	T data;
	StackNode<T> next;
	
	public StackNode(T data){
		this.data = data;
	}
}