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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kazybekkhairulla
 */
public class BubbleSort
{

    
    public static void main(String[] args)
    {
        int [] num = {3,6,1,8,3,9};
        Random myRandom = new Random();
        String[] names = {"James","Harry","Hermione","Drako","Tom","Alex"};
        //printArray(num);
        //bubbleSort(num);
        //printArray(num);
        //printArray(names);
        //bubbleSort(names);
        //printArray(names);
        int [] num1 = new int[150000];
        for (int i = 0; i<num1.length;i++){
            num1[i]=myRandom.nextInt(150000);
        }
        double startTime = System.currentTimeMillis();
        bubbleSort(num1);
        double endTime = System.currentTimeMillis();
        double duration = (endTime - startTime)/1000;
        System.out.println("It took"+duration+"seconds");
        
    }
    public static void printArray(int [] array)
    {
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i]);
     
        }
        System.out.println();
    }
    public static void printArray(String [] array){
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i]+" ");
     
        }
        System.out.println();
    }
    public static void swap(int [] array, int x, int y){
        int temp=array[x];
        array[x]=array[y];
        array[y]=temp;
    }
    public static void swap(String [] array, int x, int y){
        String temp=array[x];
        array[x]=array[y];
        array[y]=temp;
    }
    public static void bubbleSort(int [] array){
        for (int j = array.length-1;j>0;j--){
            for (int i = 0; i<j; i++){
                if (array[i]>array[i+1]){
                    swap(array,i,i+1);
                }
            }
        }
    }
    
    public static void bubbleSort(String[] array){
        for (int j = array.length-1; j>0;j--){
            for (int i =0; i<j;i++){
                if (array[i].compareTo(array[i+1])>0){
                    swap(array,i,i+1);
                }
                
            }
        }
    }
    
}
