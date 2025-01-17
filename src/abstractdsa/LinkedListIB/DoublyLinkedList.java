/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractdsa.LinkedListIB;


public class DoublyLinkedList {

    // implement doubly linked list with following methods addToFront(), addToBack()
    //removeFromFront(), removeFromBack()
    //isEmpty(), countNodes()
    //printFromFirstToLast(), printFromLastToFirst()
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
    public int size;
    
    public DoublyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public void addToFront(int data) {
        Node n = new Node(data);
        if (isEmpty()) {
            head = n;
            tail = n;
        } else {
            n.next = head;
            head.prev = n;
            head = n;
        }
        size++;
    }

    // Add to the back of the list
    public void addToBack(int data) {
        Node n = new Node(data);
        if (isEmpty()) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
        size++;
    }

    // Remove from the front of the list
    public int removeFromFront() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty!");
        }
        int data = head.data;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return data;
    }

    // Remove from the back of the list
    public int removeFromBack() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty!");
        }
        int data = tail.data;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return data;
    }

    // Check if the list is empty

    // Count the number of nodes

    // Print from the first node to the last
    public void printFromFirstToLast() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Print from the last node to the first
    public void printFromLastToFirst() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}
