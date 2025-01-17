/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractdsa.LinkedListIB;



/**
 *
 * @author kazybekkhairulla
 */
// this is a class for linked list
public class List
{
    private Node firstNode;
    private Node lastNode;
    
    public List()
    {
        firstNode = null;
        lastNode = null;
    }
    
    public boolean isEmpty()
    {
        return (firstNode == null && lastNode == null);
    }
    
    public void addToHead(int data) // for any functions you should check if the linkedlist is empty
    {
        Node temp = new Node(data); //when adding the first Node to the list, the firstNode and the lastNode should point at the same Node
        
        if (isEmpty())
        {
            
            firstNode = temp;
            lastNode = temp;
        }
        else
        {
            
            temp.setNext(firstNode);
            firstNode = temp;
        }
    }
    public void printlist() // for testing
    {
        if (isEmpty())
            System.out.println("The list is empty");
        else// how to traverse a list? use current because you don't want to change the front
        {
            Node current = firstNode;
            while (current != null)
            {
                System.out.print(current.getData()+"--->");
                current = current.getNext();
            }
            System.out.println();
        }
    }
    
    public void addToTail(int data)
    {
        Node temp = new Node(data);
        if (isEmpty())
        {
            firstNode = temp;
            lastNode = temp;
        }
        else// situation if the last mode is provided
        {
            lastNode.setNext(temp);
            lastNode = temp;
            
            //if the reference to the lastNode is not provided
            /*
            Node current = firstNode;
            
            while (current.getNext() != null)
            {
                current = current.getNext();
            }
            current.setNext(temp);
            */
        }
    }
    // deleting nodes from the back has three cases, when the linked list is empty, when the linked list has only one node, when linked list has multiple nodes
    
    public int removeFromFront()
    {
        if (isEmpty())
        {
            System.out.println("List is Empty");
            return -999;
        }
        else if (firstNode == lastNode)
        {
            int data = firstNode.getData();
            firstNode = null;
            lastNode = null;
            return data;
        }
        else
        {
            int data = firstNode.getData();
            firstNode = firstNode.getNext();
            return data;
        }
    }
    public int removeFromTail()
    {
        if (isEmpty())
        {
            System.out.println("List is Empty");
            return -9999;
        }
        else if (firstNode == lastNode)
        {
            int data = firstNode.getData();
            firstNode = null;
            lastNode = null;
            return data;
        }
        else
        {
            // if there is no reference to the lastNode
            Node current = firstNode;
            while (current.getNext().getNext()!=null)//getNext().getNext() because we don't want our current to point to our last Node cuz we wanns DELETE IT
            {
                current = current.getNext();
            }
            int Data = current.getNext().getData();
            
            current.setNext(null);
            return Data;
            /*
            alternative solution if there is a reference to the last Node
            
            Node current = firstNode;
            while(current.getNext()!=lastNode)
            {
                current = current.getNext();
            }
            
            int data = lastNode.getData();
            
            current.setNext(null);
            lastNode = current;
            return Data;
            */
            
        }
    }
}