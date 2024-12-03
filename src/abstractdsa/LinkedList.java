/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractdsa;

/**
 *
 * @author kazybekkhairulla
 */
public class LinkedList {
    
    private Node head;
    private Node current;
    private Node previous;
    private int count;
    
    public LinkedList(){
        this.head = null;
    }
    public void addFirst(Object data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }
        
        
        else{
            newNode.setNext(head);
            head = newNode;
        }
    }
    public void addLast(Object data){
        Node newNode = new Node(data);
        current = head;
        while (current != null){
            previous = current;
            current = current.getNext();
        }
        previous.setNext(newNode);
    }
    public void printAll(){
        current = head;
        while (current!=null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}

class Node{
    
    private Object value;
    private Node next;
    
    Node(Object obj, Node next){
        this.value = obj;
        this.next = next;
    }
    Node(Object obj){
        this.value = obj;
        this.next = null;
    }
    public Object getValue() {return value;}
    public void setValue(Object value) {this.value = value;}
    public Node getNext() {return next;}
    public void setNext(Node next) {this.next = next;}
     
}