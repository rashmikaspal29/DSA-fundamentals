/******************************************
 *  Author : Scott Fiery   
 *  Created On : Thu Sep 10 2026
 *  File : App.java
 *  Description: Pre-assessment for CSC-242
 *******************************************/

public class App {
    public static void main(String[] args) throws Exception {
        Animal genericAnimal = new Animal();
        genericAnimal.setName("Generic");
        genericAnimal.makeSound();
        // Output: Some generic animal sound.
        Dog dog = new Dog();
        dog.setName("Buddy");
        dog.makeSound();
        // Output: Woof!
        Bird bird = new Bird();
        bird.setName("Tweety");
        bird.makeSound(); // Output: Chirp! 
    }
}
