public class ArrayList<E>{

    int size; 
    int capacity; 
    E[] elements;

    @SuppressWarnings("unchecked")
    public ArrayList(int size, int capacity){
        this.size = size;
        this.capacity = 0;
        elements = (E[]) (new Object[capacity]);
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public boolean isEmpty(){
        return(size == 0);
    }

    public boolean isFull(){
        return(size == capacity);
    }
    public void grow(){

        if(isEmpty)

    }
}