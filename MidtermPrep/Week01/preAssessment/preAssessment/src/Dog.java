/******************************************
 *  Author : Scott Fiery   
 *  Created On : Thu Sep 10 2026
 *  File : Dog.java
 *  Description: 
 *******************************************/

public class Dog extends Animal {
    private String breed;

    public void bark() {}

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

    // getter
    public String getBreed() { return breed; }

    // setter
    public void setBreed(String breed) { this.breed = breed; }
}








