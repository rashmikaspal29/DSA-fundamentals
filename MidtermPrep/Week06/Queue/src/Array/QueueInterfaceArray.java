package Array;
/******************************************
 *  Author : Scott Fiery   
 *  Created On : Tue Oct 13 2026
 *  File : QueueInterface.java
 *  Description: 
 *******************************************/

interface QueueInterfaceArray <E> {
    public void enqueue(E e) throws Exception;
    public E dequeue();
    public boolean isEmpty();
    public boolean isFull();
    public int size();
}








