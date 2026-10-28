/******************************************
 *  Author : Scott Fiery   
 *  Created On : Tue Oct 13 2026
 *  File : QueueInterface.java
 *  Description: 
 *******************************************/

interface QueueInterface <E> {
    public void enqueue(E e);
    public E dequeue();
    public boolean isEmpty();
}








