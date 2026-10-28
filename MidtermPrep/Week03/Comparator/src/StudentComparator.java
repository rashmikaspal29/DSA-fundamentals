import java.util.Comparator;

/******************************************
 *  Author : Scott Fiery   
 *  Created On : Tue Sep 22 2026
 *  File : StudentComparator.java
 *  Description: 
 *******************************************/

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


