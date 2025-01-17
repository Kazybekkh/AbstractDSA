package abstractdsa.Sorting;

public class SelectionSort {
    public static void main(String[] args){
        int array[] = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        selectionSort_v1(array);

        for (int i: array){
            System.out.print(i);
        }

    }

    private static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++){
            int min  = i;
            for (int j = i + 1; j < n; j++){
                if (array[min] > array[j]){
                    min=j;
                }
                // to sert desc = change sign in the if statement array[min] > array[j]
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    // you can do selection sort other way using maxiumum of elements, and keep sending those elements to the right
    private static void selectionSort_v2(int array[]){
        for (int i = array.length-1; i>=0; i--){
            int max = 0;
            for (int j = 1; j<=i; j++){
                if (array[max]<array[j]) max = j;
            }
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
        }
    }
    private static void selectionSort_v1(int array[]){
        int n = array.length;
        for (int i = 0; i < n ; i++){ // potential redundancy here, change n to n-1
            int min = i;
            for (int j = i+1; j < n; j++){
                if (array[min]>array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

}
