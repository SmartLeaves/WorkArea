package com.vimal.Test;

//package whatever; // don't place package name!
// Apl
import java.io.*;

class MyLinkedList<T>
{
 
 private Node<T> head = null;
 private Node<T> tail = null;
 
 //Adds to tail
 public void addNode(T data) {
     //Implement me
     Node<T> N = new Node<T>(data);

     if (tail!=null){
         tail.next=N;
     }
     if (head==null)
         head = N;
     
     tail = N; 
     
 }
 
 // Removes from head
 public void removeNode() {
     //Implement me
     
	 if (head!=null){
		 System.out.println("Deleted -> " + head.data);
		 head=head.next;
	 }
	 else{
		 System.out.println("List is empty");
	 }
     
     
 }
 
 public void printLinkedList(){
     
     Node<T> N = head;
     while (N!=null){
         System.out.println(N.data);
         N=N.next;
     }
     
 }
 
 //TODO: Later ....
 
 
 public class Node<T> {
     //Implement me
     
     Node(T data){
         this.data= data;
         this.next=null;
         
     }
     T data;
     Node<T> next;    // Template ??
     
 }
 
 
 //10 
 public static void main (String[] args) throws java.lang.Exception
 {
     System.out.println("Hello Java!");
     
     // Add code to add nodes, delete nodes and print the node
     
     MyLinkedList<String> list = new MyLinkedList<>();
     
     // Create a list list 10->20->30->40->50
     list.addNode("10");
     list.addNode("20");
     list.addNode("30");
     list.addNode("40");
     list.addNode("50");
     // Print
     list.printLinkedList();
     // Delete few entries
     list.removeNode();    
     list.removeNode();
     list.removeNode();
     
     // Add 60, 70, 80
      list.addNode("60");
      list.addNode("70");
      list.addNode("80");
     
     // Print 
      list.printLinkedList();
     
 }
}
