/******************************************
 *  Author : Scott Fiery   
 *  Created On : Thu Sep 24 2026
 *  File : App.java
 *  Description: 
 *******************************************/

public class App {
    public static void main(String[] args) throws Exception {
        MyArrayList<Integer> arrs = new MyArrayList<>(5);

        arrs.add(10);
        arrs.add(20);
        arrs.add(30);
        arrs.add(40);
        arrs.add(50);
        System.out.println("Current capacity is "+ arrs.getCapacity());

        arrs.add(60);
        System.out.println("New capacity is now " + arrs.getCapacity());

        System.out.println("This list is: ");
        arrs.print();
    }
}








