public class MQueue<E> implements QueueInterface<E> {


    private Node<E> first;
    private Node<E> last;
    int size; 


    
    public MQueue() {
   
        first =last = null;
        size = 0;
    }

    @Override
    public void enqueue(E e) {
        Node<E> newNode = new Node<>(e);

        if (isEmpty()){
            first = last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if(isEmpty()){
            return null;
        } else {
            Node <E> temp = first;

            if(first == last){
                
            first = first.getNext();
            temp.setNext(null);

            }

            size--;

            return temp.getData();

        }
    }

    @Override
    public boolean isEmpty() {

        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
