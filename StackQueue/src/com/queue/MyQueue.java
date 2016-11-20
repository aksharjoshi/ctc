package com.queue;

import java.util.NoSuchElementException;

public class MyQueue<T> {
	QueueNode<T> first;
	QueueNode<T> last;
	
	public void add(T item){
		QueueNode<T> t =new QueueNode<T>(item);
		if(last != null){
			last.next = t;
		}
		last = t;
		
		if(first == null){
			first = last;
		}
	}
	
	public T remove(){
		if(first == null)
			throw new NoSuchElementException();
		T item = first.data;
		first = first.next;
		
		if(first == null)
			last = null;
		
		return item;
	}
	
	public T peek(){
		if(first == null)
			throw new NoSuchElementException();
		else 
			return first.data;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
}

class QueueNode<T> {
	T data;
	QueueNode<T> next;
	
	public QueueNode(T data){
		this.data = data;
	}
}
