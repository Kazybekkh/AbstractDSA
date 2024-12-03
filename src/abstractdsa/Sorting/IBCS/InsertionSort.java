/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractdsa.Sorting.IBCS;

/**
 *
 * @author kazybekkhairulla
 */

import java.util.Random;


public class InsertionSort
{

    
    public static void main(String[] args)
    {
        Random myRandom = new Random();
        
        int [] num = {3,6,1,8,3,9};
        
        int [] num1 = new int[25000];
        for (int i = 0; i<num1.length;i++){
            num1[i]=myRandom.nextInt(25000);
        }
        //printArray(num);
        double startTime = System.currentTimeMillis();
        insertSort(num1);
        double endTime = System.currentTimeMillis();
        double duration = (endTime - startTime)/1000;
        System.out.println("It took"+duration+"seconds");
        //printArray(num);
    }
    public static void printArray(int [] array)
    {
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\n");
    }
    public static void swap(int [] array, int x, int y){
        int temp=array[x];
        array[x]=array[y];
        array[y]=temp;
    }
    public static void insertSort(int[] myArray)
    {
  	for (int i = 1; i < myArray.length; i++)
  	{ 
  	    int temp = myArray[i];
     	    int current = i;
            while ( (current > 0) && (myArray[current - 1] > temp) )
            { 
                myArray[current] = myArray[current - 1];
                current = current - 1;
            }
            myArray[current] = temp;
        }
     	 
    }
}

