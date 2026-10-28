public class App {
    public static void main(String[] args) throws Exception {
        MyQueue<Integer> q = new MyQueue<>();

        System.out.println("The size of the queue is %d".formatted(q.size()));

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);

        System.out.println("The size of the queue is %d".formatted(q.size()));
        System.out.println("Dequeing ".formatted(q.dequeue()));
        System.out.println("The size of the queue is %d".formatted(q.size()));

        for (Integer i : q) {
            System.out.println(i);
        }
    }
}
