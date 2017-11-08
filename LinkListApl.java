package com.vimal.Test;

import java.util.HashSet;
import java.util.Set;
/*
 *  Java program to use a templatized version of LinkedList and do following operation
 *  1. Add to tail
 *  2. Remove from head;
 *  3. Remove duplicates
 */
public class LinkListApl<T> {
    
	Node<T> head, tail;
    class Node<T> {
        
        Node (T data){
            this.data = data;
            this.next = null;
        }
        
        T data;
        Node <T> next;
        
    }
    
    public void addElemenetAtTail(T data){
        
        Node<T> N = new Node<T>(data);
        
        if (tail!=null){
             tail.next = N;
        }
        if (head==null)
            head = N;
        
        tail =N;
    } 
    
        //  10->20->30->20->40
        
        //10->10
    
    public void removeDuplicate(){
    	Set<T> dpSet  = new HashSet<>();
    	
    	Node<T> current = head;
    	dpSet.add(current.data);
    	
    	
        while (current.next!=null){
        	
        	if (dpSet.contains(current.next.data)){
                //remove
                    current.next=current.next.next;
                }
            else{
            	dpSet.add(current.next.data);
            	current=current.next;
            }
            
        }
        
    }
    
    public void deleteFromHead(){
    	
    	if (head!=null){
    		head=head.next;
    		
    	}
    	else{
    		System.out.println("List is empty");
    	}
    }
    
    public void printLists(){
    	
    	Node<T> N = head;
    	while(N!=null){
    		System.out.println(N.data);
    		N=N.next;
    	}
    }
    
    public static void main(String args[]){
        
    	LinkListApl<Integer> lst = new LinkListApl<>();
        lst.addElemenetAtTail(10);
        lst.addElemenetAtTail(10);
        lst.addElemenetAtTail(10);
        lst.deleteFromHead();
        
        lst.printLists();
        lst.addElemenetAtTail(20);
        lst.addElemenetAtTail(30);
        lst.addElemenetAtTail(20); //duplicate
        lst.addElemenetAtTail(40);
        lst.addElemenetAtTail(50);
        //lst.printLists();
        lst.removeDuplicate();
        lst.addElemenetAtTail(50);
        lst.addElemenetAtTail(50);
        lst.removeDuplicate();
        lst.deleteFromHead();
      
        lst.printLists();
        
    }
    

}
