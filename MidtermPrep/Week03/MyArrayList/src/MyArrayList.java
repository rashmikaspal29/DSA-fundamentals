public class MyArrayList <E> {
    int capacity;
    int size;

    E[] elements;
    
    @SuppressWarnings("unchecked")
    public MyArrayList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.elements = (E[]) new Object[capacity];
    }

    public MyArrayList() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    private void grow() {
        capacity *= 2;
        E[] tempArray = (E[]) new Object[capacity];

        // for (int i = 0; i < size; i++) {
        //     tempArray[i] = elements[i];
        // }

        System.arraycopy(elements, 0, tempArray, 0, size);

        elements = tempArray;
    }

    public void add(E element) {
        if (isFull()) {
            grow();
        }

        elements[size++] = element;
        // size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("List is empty");
        }
        else {
            for(int i = 0; i < size; i++) {
                System.out.println(elements[i]);
            }
        }
    }
}
