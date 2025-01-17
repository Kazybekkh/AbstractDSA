/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractdsa.Sorting.IBCS;

import java.util.Random;
public class SelectionSort
{

    
    public static void main(String[] args)
    {
        Random myRandom = new Random();
        
        int [] num = {3,6,1,8,3,9};
        
        int [] num1 = new int[150000];
        for (int i = 0; i<num1.length;i++){
            num1[i]=myRandom.nextInt(150000);
        }
        //printArray(num);
        double startTime = System.currentTimeMillis();
        SelectionSort(num1);
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
    public static void SelectionSort(int [] array)
    {
        for (int j = array.length-1;j>=0; j--)
        {
            int maxIndex = 0;
            int max = array[0];
            for (int i = 1; i<=j; i++){
                
                if (array[i] >max){
                    max=array[i];
                    maxIndex = i;
                }
            }
            swap(array, maxIndex, j);
        }
    }
}