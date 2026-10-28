/******************************************
 *  Author : Scott Fiery   
 *  Created On : Thu Sep 10 2026
 *  File : Bird.java
 *  Description: 
 *******************************************/

public class Bird extends Animal {
    private double wingSpan;

    public void fly() {}

    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
}








