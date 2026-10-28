/******************************************
 *  Author : Scott Fiery   
 *  Created On : Thu Sep 10 2026
 *  File : Animal.java
 *  Description: Animal class for pre-assessment for CSC-242
 *******************************************/

public class Animal {
    private String name;
    private int age;

    public void eat() {}
    public void sleep() {}
    public void makeSound() {
        System.out.println("Some generic animal sound.");
    }

    // getters
    public String getName() { return name; }
    public int getAge() { return age; }

    // setters 
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
}
