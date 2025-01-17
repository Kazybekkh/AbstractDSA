package abstractdsa.DynamicArrays;

public class DynamicArrayTest {
    int size;
    Object[] array;
    int capacity;
    public DynamicArrayTest(){
        this.capacity = 10;
    }
    public DynamicArrayTest(int capacity){
        this.capacity = capacity;
    }
    public void add(Object data){
        if (size>=capacity){
            grow();
        }
        array[size++] = data;
    }
    public void remove(Object data){
        for (int i = 0; i< array.length; i++){
            if (array[i] == data){
                for (int j = 0; j< array.length-i-1; j++){
                    array[i+j] = array[i+j+1];
                }
                
            }
            array[size -1] = null;
            size--;
            if (size <= (int) (capacity/3)){
                shrink();
            }
            break;
        }
    }

    private void shrink() {
    }

    private void grow() {
    }
}
