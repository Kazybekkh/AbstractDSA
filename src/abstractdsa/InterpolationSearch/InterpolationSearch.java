package abstractdsa.InterpolationSearch;

public class InterpolationSearch {
    public static void main(String[] args){
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024}; // best case
        
        int index = interpolationSearch(array, 256);

        if (index!=-1) System.out.println("Element found at index: "+index);
        else System.out.println("Element not found");
    }

    private static int interpolationSearch(int[] array, int value) {
        int high = array.length -1;
        int low = 0;

        while (value >= array[low] && value <= array[high] && low <= high){
            // formula to calculate probe
            int probe = low + (high - low) * (value - array[low])/
                    (array[high] - array[low]);
            System.out.println("probe: "+ probe);

            if (array[probe] == value) return probe;
            else if (array[probe] < value) low = probe + 1;
            else high = probe - 1;


        }
        return -1;
    }
}
