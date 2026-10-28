import java.util.Iterator;

/******************************************
 *  Author : Scott Fiery   
 *  Created On : Tue Oct 06 2026
 *  File : MyStack.java
 *  Description: 
 *******************************************/

public class MyStack<E> implements StackInterface<E>, Iterable<E> {
    int size;
    int top;
    E[] elements;

    public MyStack() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    public MyStack(int size) {
        this.size = size;
        elements = (E[]) new Object[size];
        top = -1;
    }

     @Override
    public void push(E o) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException("Can't push. Stack is full.");
        }
        
        // top++;
        // elements[top] = o;
        elements[++top] = o;
    }

    @Override
    public E peek() {
        if (isEmpty()) return null;

        return elements[top];
    }

    @Override
    public E pop() {
        if (isEmpty()) return null;

        return elements[top--];
    }

    @Override
    public int top() {
        return top;
    }

        @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == size - 1;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            // int current = -1;
            int current = top;

            @Override
            public boolean hasNext() {
                // return current != top;
                return current != -1;
            }

            @Override
            public E next() {
                // return elements[++current];
                return elements[current--];
            }

        };
    }

    // @Override
    // public Iterator<E> iterator() {
    //     return new It();
    // }

    // // can't do lambda here, because lambda only works when you have one method
    // class It implements Iterator<E> {
    //     int current = -1;

    //     @Override
    //     public boolean hasNext() {
    //         return current != top;
    //     }

    //     @Override
    //     public E next() {
    //         return elements[++current];
    //     }

    // }
    
    
    // Should NEVER print in the data structures
    // public void print() {
    //     if (isEmpty()) {
    //         System.out.println("Stack is empty.");
    //     }
    //     else {
    //         // for (int i = 0; i < top; i++) {
    //         //     System.out.println(elements[i]);
    //         // }
    //         System.out.println("Stack is:");
    //         for (int i = top; i >= 0; i--) {
    //             System.out.println(elements[i]);
    //         }
    //     }
    // }

}








