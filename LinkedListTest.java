package com.vimal.Test;

public class LinkedListTest<T> {

	public Node<T> head;
	public Node<T> tail;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListTest<Integer> Lst= new LinkedListTest<>();
		Lst.addNode(10);
		Lst.addNode(20);
		Lst.addNode(30);
		Lst.printList();
		Lst.remove();
		Lst.printList();
		Lst.remove();
		Lst.remove();
		Lst.remove();

	}
	
	class Node <T>{
		T data;
		Node<T> next;
		
		Node(T data){
			this.data=data;
			this.next=null;
		}
	}

	public void addNode(T data){
		Node<T> N = new Node(data);
		if (tail != null)
			tail.next = N;
		if (head==null)
			head = N;
		
			tail = N;

	}
	
	public void remove(){
		if (head!=null){
			System.out.println("Deleted ->"+ head.data);
			head=head.next;
		}
		else{
			System.out.println("List empty");
		}
	}
	public void printList(){
		Node<T> t = head;
		while (t!=null){
			System.out.print(t.data + "->");
			t=t.next;
		}
		System.out.println("");
		
	}
	
	
	

}
