import java.util.Iterator;
public class MQueue<E> implements QueueInterface<E>, Iterable<E>{

    //best way to declare linked list
    //LinkedList<Integer> q = new LinkedList<>();
    private Node<E> first;
    private Node<E> last;
    private int size;

    public void enqueue(E e){
        Node<E> newNode = new Node<>();

        if(isEmpty()){
            first = last = newNode;
        }
        else{
            last.setNext(newNode);
            last = newNode;
        }
        size++;
    }

    public E dequeue(){
        if(isEmpty()){
            throw new Exception("Cannot delete when the list is empty.");
        }
        Node<E> temp = first;
        if (first == last) {
            first = last = null;
        }
        else{
           
            first = first.getNext(); //check this too
            temp.setNext(null);
        }
         size--;  
         return temp.getData();
           
    }
        

    public boolean isEmpty(){
        return size == 0;
    }
    
    public int size(){
        return size;
    }
    public Iterator<E> iterator(){
        return new Iterator(){
            Node<E> cursor = first;
            
            public boolean hasNext(){
                return cursor != null;
            }
            public E next(){
                if(!hasNext()){
                    throws new NoSuchElementException;
                }
                Node<T> temp = cursor;
                cursor = cursor.getNext();
                return temp.getData();
            }
        }
            
}
    
