public class Demo{

  public static void main(String[] args)throws Exception{

    MQueue<Integer> q = new MQueue<>();

    System.out.println("Size before: "+size);
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    System.out.print("Dequeuing: "+ q.dequeue());
    System.out.println("Size after: "+size);
    q.enqueue(50);
    System.out.println("Size end: "+size);

    for(Integer i: q){
      System.out.println(i);
    }
     
    
}

