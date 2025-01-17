/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractdsa.BinarySearch;

/**
 *
 * @author kazybekkhairulla
 */

public class BinarySearchArray
{

    public static void main(String[] args)
    {
        //int [] array = {3,6,9,12,15,18,21,24,27,30};
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        BinSearch(array, 1);
    }
    public static void binarySearch(int[] array, int target)
    {
        
        int start = 0;
        int end = array.length-1;
        boolean isFound = false;
        while (!isFound && end >= start)
        {
            int mid = (start+end)/2;
            if (array[mid] == target)
            {
                isFound = true;
            }
            else if(target>array[mid])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
            
        }
        if (isFound)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");
        }
    }
    
    private static void BinSearch(int[] array, int target){
        int high = array.length-1;
        int low = 0;
        
        
        boolean isFound = false;
        while (!isFound && high>=low){
            int mid = low+(high-low)/2;
            if(array[mid] == target){
                isFound = true;
            }
            else if (target > array[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        if (isFound){
            System.out.println("Element is found");
        }
        else{
            System.out.println("Element is not found");
        }
    }
}