package abstractdsa.DybamicArrays;

public class DynamicArray {
    // Implementation of Dynamic Array in Java is called ArrayList
    int size;
    int capacity = 10;
    Object[] array;
    public DynamicArray(){
        this.array = new Object[capacity];
    }
    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    public void add(Object data){
        if (size >= capacity){
            grow();
        }
        array[size++] = data;
    }
    public void delete(Object data){
        for (int i = 0; i<size; i++){
            if (array[i]==data){
                for (int j = 0; j<(size - i - 1); j++){
                    array[i+j] = array[i+j+1];
                }
                array[size - 1] = null;
                size--;
                // check if array reaches certain capacity
                if (size <= (int) (capacity/3)){
                    shrink();
                }
                break;
            }

        }
    }
    public void insert(int index, Object data){
        if (size >= capacity){
            grow();
        }
        for (int i = size; i>index; i--){
            array[i] = array[i-1];
        }
        array[index] = data;
        size++;
    }
    public int search(Object data){
        for (int i = 0; i<size; i++){
            if(array[i]==data){
                return i;
            }
        }
        return -1;
    }
    public void grow(){
        int newCapacity = (int) (capacity * 2);
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i<size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    public void shrink(){
        int newCapacity = (int) (capacity / 2);
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i<size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public String toString(){
        String text = "";
        for (int i = 0; i<size; i++){
            if (i == size-1){
                text += array[i];
            }
            else{
                text += array[i] + ", ";
            }
        }
        return "["+ text+"]";
    }
    public static void main(String[] args){
        DynamicArray arr = new DynamicArray();
        arr.add(1);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        System.out.println(arr.toString());
        System.out.println(arr.search(7));
        arr.delete(6);

        System.out.println(arr.toString());
    }
}
