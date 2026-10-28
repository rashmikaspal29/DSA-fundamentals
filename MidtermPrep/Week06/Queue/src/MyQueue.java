import java.util.Iterator;

public class MyQueue <E> implements QueueInterface<E>, Iterable<E>  {

    private Node<E> first, last;
    int size;

    public MyQueue() {
        first = last = null;
        size = 0;
    }

    @Override
    public E dequeue() {
        if(isEmpty()) {
            return null;
        }
        
        Node<E> temp = first;
        first = first.getNext();
        temp.setNext(null);
        size--;
        return temp.getData();
    }

    @Override
    public void enqueue(E e) {
        Node<E> newNode = new Node<>(e);
        if(isEmpty()) {
            first = last = newNode;
        }
        else {
            last.setNext(newNode);
            last = newNode;
        }
        size++;
    }

    @Override
    public boolean isEmpty() {
        // return first == null;
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        // Need to do this as an inner class so it has access to the first and the last
        // can be an anonymous class
        return new Iterator<>() {
            Node<E> current = first;

            @Override
            public boolean hasNext(){
                return current != null;
            }

            @Override
            public E next() {
                Node<E> temp = current;
                current = current.getNext();
                return temp.getData();
            }
        };
    }

}
