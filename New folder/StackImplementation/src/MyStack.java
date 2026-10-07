public class MyStack<T>{

    private int capacity;
    T[] elements;
    int top;

 
    public MyStack(){
        
        this(10);
    }

    @SuppressWarnings("unchecked")
    public MyStack(int capacity){
        this.capacity = capacity;
        elements = (T[]) new Object[capacity];
        top = -1;
    }

    // why top starts from -1 not 0? 57:46

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity-1; // why capacity -1?
    }

    public void push(T e){

        if (isFull())
            return;

        elements[++top] = e; // ++ prefiv

    }

    public T pop(){

        if(isEmpty())
            return null;

        return elements[top--]; // return elements[top]; /n top--
    }

    public void print(){

        for(int i = 0; i<top+1; i++){
            System.out.println(elements[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
