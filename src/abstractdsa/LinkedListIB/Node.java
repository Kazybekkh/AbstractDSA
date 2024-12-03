/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractdsa.LinkedListIB;

/**
 *
 * @author kazybekkhairulla
 */
public class Node
{
    private int data;
    private Node next; //type is Node, self referencial, reference to itself
    
    public Node(int data)
    {
        this.data = data;
        next = null;
    }
    public Node (int data, Node next) //constructor overload
    {
        this.data = data;
        this.next = next;
    }
    public void setData(int data)
    {
        this.data = data;
    }
    public int getData()
    {
        return data;
    }
    
    public void setNext(Node next)
    {
        this.next = next;
        
    }
    public Node getNext()
    {
        return next;
    }
    
}