/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractdsa.LinkedListIB;


public class DoublyLinkedList {
    private class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
        }
    }
    
    private Node head;
    private Node tail;
    private int size;
    
    public DoublyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    public void addLast(int data){
        Node n = new Node(data);
        if (isEmpty()){
            head = n;
            tail = n;
        }
        else{
            tail.next = n; // link new node after tail
            n.prev = tail; //link †ail before new node
            tail = n; // update the tail reference
        }
    }
    public boolean isEmpty(){
        return size == 0;
    }
}
