/******************************************
 *  Author : Scott Fiery   
 *  Created On : Tue Sep 22 2026
 *  File : Dummy.java
 *  Description: Demonstrating the need for the default keyword
 *******************************************/

// default explanation
// interface - abstract methods a class must implement
// Someone wanted Oracle to add another abstract method to an existing interface, but this owuld break everyone else's code
// Oracle came back, made default statement
// allows adding a method to an interface that you don't have to implement in classes that implment the interface. Provides a default implementation in the interface

public interface Dummy {
    public void printDummy();
    // public void printSmarty(); // This breaks the implementation in Student.

    // default implementation is usually useless for everyone. 
    // People that don't use it don't care, and people that want it will override it.
    default public void printSmarty() {
        System.out.println("I'm a smarty");
    }
}








