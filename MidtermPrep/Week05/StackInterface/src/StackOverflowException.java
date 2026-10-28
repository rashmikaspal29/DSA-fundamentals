/******************************************
 *  Author : Scott Fiery   
 *  Created On : Tue Oct 06 2026
 *  File : StackOverflowException.java
 *  Description: 
 *******************************************/

public class StackOverflowException extends Exception {
    public StackOverflowException() {
        super("Stack Overflow");
    }

    public StackOverflowException(String msg) {
        super(msg);
    }
}








