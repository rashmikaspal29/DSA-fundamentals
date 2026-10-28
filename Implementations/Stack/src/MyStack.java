public class MyStack<E> implements StackInference<E>, Iterable<E> {

    int size;
    int top;
    E[] elements;

    public MyStack(){
        this(10);
    }

    public MyStack(int size){
        this.size = size;
        top = -1;
        elements = (E[])new Object[size];
    }

    public void push(E e) throws StackOverFlowException{
        if(isFull()){
            throw new StackOverFlowException("Can't add. Array is full.");
        }
        if(isEmpty()){
            elements[top] = e;
        } else {
            elements[++top] = e;
        }
        size++;
    }

    public E pop() throws StackOverFlowException(){
        if(isEmpty()){
            throw new StackOverFlowException("can't pop. array is empty");
        } else{
            return elements[top--];
        }
        

    public E peek(){
        return elements[top];
        
    public int top(){
        return top;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size - 1;
    }

    public Iterator<E> iterator(){
        return new iterator<>(){
            int cursor = top;

            @Override
            public boolean hasNext(){
                cursor != -1;
            }
            public E next(){
                if(!hasNext()){
                    throw new NoSuchElementException;
                }
                return elements[cursor--];
            }
        }
    
}
