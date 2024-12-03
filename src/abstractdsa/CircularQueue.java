/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractdsa;

/**
 *
 * @author kazybekkhairulla
 */
public class CircularQueue
{
   private int[] queueArray;
   private int head;
   private int tail;
   private int counter;
   
   public CircularQueue(int size)
    {
        queueArray = new int[size];
        for (int i=0; i<queueArray.length; i++)
            queueArray[i]=-999;
        tail = 0;head = 0;counter = 0;
    }
    public boolean isEmpty()
    {
        if (counter == 0)
            return true;
        else 
            return false;
    }
    public boolean isFull()
    {
        if (counter == queueArray.length)
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
            queueArray[tail] = data;
            tail = (tail+1)% queueArray.length;
            counter++;
        }
    }
    
    public void printQueue()
    {
        int i = head;
        int z = 0;
        while (z<counter)//prints out as many elements as counters
        {
            System.out.print(queueArray[i]); // variable i will go ovewr individiual indices and wrap it around
            i = (i+1) % queueArray.length;
            z++;
        }
        System.out.println("");
            
    }
    public int dequeue()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            return -999;
        }
        else
        {
            int data = queueArray[head];
            head = (head+1)%queueArray.length;
            counter--;
            return data;
        }
    }
}