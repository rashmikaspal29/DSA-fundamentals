/******************************************
 *  Author : Scott Fiery   
 *  Created On : Tue Oct 06 2026
 *  File : App.java
 *  Description: 
 *******************************************/

public class App {
    public static void main(String[] args){ 
        MyStack<Integer> s = new MyStack<>(5);
        try {
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);
            s.push(6);
        }
        catch (StackOverflowException e) {
            System.err.println(e.getMessage());
        }
        catch (Exception e) {
            System.err.println("Other exception: " + e.getMessage());
        }

        System.out.println("Popping: " + s.pop());
        // s.print();

        for (Integer e : s) {
            System.out.println(e);
        }
    }
}








