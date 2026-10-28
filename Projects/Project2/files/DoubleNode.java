/** ****************************************
 * @Author      :   Ali Azhari
 * @Date        :   Created On :  October 15 2026
 * @File        :   Node.java
 * @Description :   TODO
 *******************************************/
public class DoubleNode<T> {

    private T item;
    private DoubleNode<T> next;
    private DoubleNode<T> prev;

    /**
     * Default Constructor
     */
    public DoubleNode() {

    }

    /**
     * Overload Constructor with one parameter (item)
     * @param item
     */
    public DoubleNode(T item) {
        this(item, null, null);
    }

    /**
     * Overload Constructor with two parameters (item and next node)
     * @param item
     * @param next
     * @param prev
     */
    public DoubleNode(T item, DoubleNode<T> next, DoubleNode<T> prev) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }

    // Getters and Setters
    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public DoubleNode<T> getNext() {   
        return next;  
    }

    public void setNext(DoubleNode<T> next) {
        this.next = next;
    }

    public DoubleNode<T> getPrev(){
        return prev;
    }

    public void setPrev(DoubleNode<T> prev){
        this.prev = prev;
    }

    public String toString(){
        return "\nData: "+getItem();

    }

}