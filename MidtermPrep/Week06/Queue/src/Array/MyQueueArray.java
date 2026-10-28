package Array;
import java.util.Iterator;

public class MyQueueArray <E> implements QueueInterfaceArray<E>, Iterable<E>  {

    int size;
    int capacity;
    int first, last;
    E[] queue;

    public MyQueueArray() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    public MyQueueArray(int capacity) {
        size = 0;
        this.capacity = capacity;
        first = last = -1;

        queue = (E[]) new Object[capacity];
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            return null;
        }

        E temp = queue[first];
        if (size == 1) {
            first = last = -1;
        }
        else {
            first = (first + 1) % capacity;
        }
        size--;
        return temp;
    }

    @Override
    public void enqueue(E e) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }
        else { 
            last = last + 1 % capacity;
            queue[last] = e;

            if(isEmpty()) {
                first = 1;
            }
            size++;
        }
        
        
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        // return size == capacity;
        return (last + 1) % capacity == first;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return null;
    }


}
