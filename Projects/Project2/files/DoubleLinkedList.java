/** ****************************************
 * @Author      : Ali Azhari
 * @ate         : Created On : October 15 2026
 * @File        : DoubleLinkedList.java
 * @Description : TODO
 *******************************************/

public class DoubleLinkedList<T> implements ListInterface<T> {

  private DoubleNode<T> head;
  private int itemCount;

  public DoubleLinkedList() {   

    head = null;
    itemCount = 0;

  }

  /** *************************************** */
  @Override
  public boolean isEmpty() {
    return (itemCount == 0);

  }

  /** *************************************** */
  @Override
  public int getLength() {

   // todo: implement this method
    return itemCount;
  }

  /** *************************************** */
  @Override
  public boolean insert(int position, T item) {

    // Modify this method

    if (position > (itemCount + 1) || (position < 1))
      return false;

    DoubleNode<T> newNode = new DoubleNode<>(item);
    if (position == 1) {
      if(head != null){
      newNode.setNext(head);
      head.setPrev(newNode);
      }
      head = newNode;

    }

    DoubleNode<T> currNode = getNodeAt(position );
    DoubleNode<T> prevNode = currNode.getPrev();

    //setting next from prevNode to newnode and newNode to currNode
    newNode.setNext(currNode);
    prevNode.setNext(newNode);

    //setting prevs from currNode to newNode and from newNode to prevNode
    currNode.setPrev(newNode);
    newNode.setPrev(prevNode);

    return true;

  }

  /** *************************************** */
  @Override
  public T remove(int position) {

    // Modify this method
    if (head == null)
      return null;

      if (position > (itemCount -1) || (position < 0)) // how do i check if the number is less than 1 or 0?
        return null;

    if(itemCount == 1 ){
      head = null;
    }

    DoubleNode<T> currNode = getNodeAt(position);
    DoubleNode<T> prevNode = currNode.getPrev();
    DoubleNode<T> nextNode = currNode.getNext();

    prevNode.setNext(nextNode);
    currNode.setNext(null);

    nextNode.setPrev(prevNode);
    currNode.setPrev(null);

    return currNode.getItem();
    
      // Be careful here. This might not be complete.
      // Take in cosideration of a list that has only one node
    // DoubleNode<T> previous = getNodeAt(position - 1);
    // DoubleNode<T> temp = previous.getNext();
    // previous.setNext(temp.getNext());

    // return temp.getItem();

  }

    /** *************************************** */
  public void clear() {
    head = null;
    itemCount = 0;
  }

  /** *************************************** */
  @Override
  public T getEntry(int position)  throws IndexOutOfBoundsException {

    if (head == null)
      throw new IndexOutOfBoundsException();

    return getNodeAt(position).getItem();
  }
/** *************************************** */
@Override
  public T replace(int position, T entry) throws IndexOutOfBoundsException {

   if (head == null)
    throw new IndexOutOfBoundsException();
    
     DoubleNode<T> node = getNodeAt(position);
     T item = node.getItem();
     node.setItem(entry);
    return item;

  }

  /** *************************************** */
  public int getIndexOf(T entry) {

    if(head == null)
    return -1;

    DoubleNode<T> walker = head;

    int position = 0;
    while (walker != null) {
      if (walker.getItem().equals(entry)) {
        return position;
      }
      position++;
    }
    return -1;
  }

  /** *************************************** */
  @Override
  public Object[] toArray() {

    if (itemCount == 0)
      return null;

    Object[] array = new Object[itemCount];
    DoubleNode<T> walker = head;

    for (int i = 0; i < itemCount; i++) {
      array[i] = walker.getItem();
      walker = walker.getNext();
    }

    return array;
  }

  /** *************************************** */

  private DoubleNode<T> getNodeAt(int position) {

    // Modify this method
    if (head == null)
      return null;

    DoubleNode<T> walker = head;

    for (int i = 0; i < position; i++)
      walker = walker.getNext();

    return walker;

  }

  private String toString(){
    /
  }


}