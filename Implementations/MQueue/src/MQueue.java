public class MQueue<E> implements QueueInterface<E>{

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
        else{
            Node<E> temp = first;
            first = first.getNext(); //check this too
            temp.setNext(null);
            return temp.getData();
            size--;    //confused when to decrease the size and if i should return first? i think i should
        }
    }
        

    public boolean isEmpty(){
        return size == 0;
}
    public int size(){
        return size;
