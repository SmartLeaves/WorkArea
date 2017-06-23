package com.vimal.Test;

public class linkedListSamples {
	
	class Node {
	     int data;
	     Node next;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	Node InsertNth(Node head, int data, int position) {
		   // This is a "method-only" submission. 
		    // You only need to complete this method. 
		  
		     Node node = head;
		    if (position == 0){
		        node = new Node();
		        node.data = data;
		        node.next = head;
		        return node;
		    }
		    else {
		        
		        while(--position > 0){
		            node = node.next;
		        }
		        
		        Node i = node.next;
		        node.next = new Node();
		        node.next.data = data;
		        node.next.next = i;
		        return head;
		    }  
		    
		    
		    
		}

}
