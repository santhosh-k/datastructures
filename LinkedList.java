package com.company;

public class LinkedList {
    Node first;
    public  LinkedList(int data){
        first = new Node();
        first.data = data;
    }
    public void insert(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }
    public void display(){
        Node current = first;
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
