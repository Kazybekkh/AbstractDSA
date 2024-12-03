/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractdsa;

/**
 *
 * @author kazybekkhairulla
 */
public class StaticStack
{
    private int sp; //Stack Pointer
    private int [] stackarray;
    
    public StaticStack(int size)
    {
        // when we build a constractor we need to give the pointer default value as well as the length for stackArray.
        // size controls the length of the stack that user provides
        sp = 0;
        stackarray = new int[size];
        for (int i=0; i<stackarray.length; i++)
        {
            stackarray[i]=-999;
        }
    }
    public boolean isEmpty()
    {
        if(sp==0)
            return true;
        else
            return false;
    }
    
    public boolean isFull()
    {
        if(sp==stackarray.length)
            return true;
        else
            return false;
    }
    public void printstack()
    {
        for (int i=0; i<sp; i++)
        {
            System.out.print(stackarray[i]+" ");
        }
        System.out.println();
    }
    
    public void push(int data)
    {
        if (isFull()==true)// if (isFull()) same thing
            System.out.println("Sorry the stack is full");
        else
        {
            // stackarray[sp++] = data;
            // or
            stackarray[sp]=data;
            sp++; //the pointer increments by one
        }
        
    }
    public int pop()
    {
        if (isEmpty())
        {
            System.out.println("Empty");
            return -999;
        }
        else
        {
            // return stackarray[--sp]
            // or
            sp--;
            return stackarray[sp];
        }
    }
}