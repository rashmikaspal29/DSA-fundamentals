public interface QueueInterface<E> {

    public void enqueue(E e); // pushing the elements in
    public E dequeue();   // removig ot poping
    public boolean isEmpty();
    public int size();
    
}
