package abstractdsa.BinarySearch;

import java.util.Arrays;

public class BinarySearchAlgorithm {

    public static void main(String[] args){
        int array[] = new int[100];
        int target = 42;
        // populate array
        for (int i = 0; i<array.length; i++){array[i] = i;}

        // cheap way = use built-in binary search method
        //int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);
        if (index==-1)
            System.out.println(target + " not found");
        else
            System.out.println("Element found at: "+ index);


    }
    private static int binarySearch(int[] array, int target){
         int low = 0;
         int high = array.length-1;

         while(low <= high){
             int middle = low + (high - low) / 2;
             int value = array[middle];

             // optional
             System.out.println("middle: "+ middle);

             if (value < target) low = middle + 1;
             else if (value > target) high = middle -1;
             else return middle; // target found

         }
        return -1; // target not found
    }
}
