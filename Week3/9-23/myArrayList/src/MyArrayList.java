public class MyArrayList <E> {

    int capacity;
    int size;
    E[] elements;

    @SuppressWarnings("unchecked")
    public MyArrayList(){ // u wnat anyone to use this method
        capacity = 10;
        size = 0; 
        elements = (E[]) (new Object[capacity]); // you need size initial size for building an array 33!
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
