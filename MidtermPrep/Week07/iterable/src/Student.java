/******************************************
 *  Author : Scott Fiery   
 *  Created On : Tue Oct 27 2026
 *  File : Student.java
 *  Description: 
 *******************************************/

import java.util.Iterator;

public class Student <T> implements Iterable<T> {
    private String name;
    private int age;
    private T[] grades;
    private int size;
    
    @SuppressWarnings("unchecked")
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        grades = (T[]) new Object[10];
        size = 0;
    }

    public void addGrade(T grade) {
        grades[size++] = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    /********************* IT Inner Class Start *********************/

    // public class It implements Iterator<T> { // T is already defined so don't need <T> in class declarations
    //     int cursor = 0;

    //     @Override
    //     public boolean hasNext() {
    //         return cursor < size;
    //     }

    //     @Override
    //     public T next() {
    //         return grades[cursor++];
    //     }
        
    // }

    /********************* IT Inner Class End *********************/


    @Override
    public Iterator<T> iterator() {
        // return new It<>(); // for separate class
        // return new It(); //For inner class - It is no longer generic, so we don't need <T> here either

        return new Iterator<>() { // inline class
            int cursor = 0;

            @Override
            public boolean hasNext() {
                return cursor < size;
            }

            @Override
            public T next() {
                return grades[cursor++];
            }
        };


    }
}








