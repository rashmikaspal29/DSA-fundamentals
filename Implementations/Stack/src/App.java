public class App {
    public static void main(String[] args) throws Exception {

        MyStack<Integer> s = new MyStack<>(5);

        try{
            
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        s.push(4);

        } 
        catch(StackOverFlowException ex){
            System.out.print(ex.getMessage());
        }

        for(Integer i : s){
            System.out.println(i);
        }
        
}
