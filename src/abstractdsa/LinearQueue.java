/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractdsa;

/**
 *
 * @author kazybekkhairulla
 */
public class LinearQueue
{
    private int [] queueArray;
    private int head;
    private int tail;
    
    public LinearQueue(int size)
    {
        queueArray = new int[size];
        for (int i=0; i<queueArray.length; i++)
            queueArray[i]=-999;
        tail = 0;
        head = 0;
    }
    public boolean isEmpty()
    {
        if (head == tail)
            return true;
        else 
            return false;
    }
    public boolean isFull()
    {
        if (tail == queueArray.length)
            return true;
        else
            return false;
    }
    public void enqueue(int data)
    {
        if (isFull())
            System.out.println("Sorry it's full");
        else
        {
            queueArray[tail]= data;
            tail++;
            // or queueArray[tail++] = data;
        }
    }
    
    public void printQueue()
    {
        for (int i = head; i<tail; i++)
        {
            System.out.print(queueArray[i]+" ");
        }
        System.out.println();
    }
    public int dequeue()
    {
        if (!isEmpty())
        {
            int myData = queueArray[head];
            head++;
            // int myData = queueArray[head++];
            return myData;
        }
        else
        {
            System.out.println("Queue is empty");
            return -999;
        }
    }
}