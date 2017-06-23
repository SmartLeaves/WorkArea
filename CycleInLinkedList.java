package com.vimal.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 

*/
public class CycleInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack mySt = new Stack();
		
		
	}

	
	
class Node {
    int data;
    Node next;
}
	

	boolean hasCycle(Node head) {
	     Set <Node> chkSet = new HashSet<>();
	    
	    while (head!=null){
	        if(chkSet.contains(head))
	            return true;
	        else
	            chkSet.add(head);
	        head = head.next;
	    }
	    return false;

	}
	
	
	
	
}
