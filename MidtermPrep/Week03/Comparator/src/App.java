import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        // public class StudentComparator implements Comparator<Student> {
        //     @Override
        //     public int compare(Student o1, Student o2) {
        //         return o1.getName().compareTo(o2.getName());
        //     }
        // }

        Student s1 = new Student ("Bob", 19, 90);
        Student s2 = new Student ("Johnny", 21, 80);

        if (s1.compareTo(s2) > 0) {
            System.out.println(s1.getName() + " is greater than " + s2.getName());
        }
        else if (s1.compareTo(s2) < 0) {
            System.out.println(s2.getName() + " is greater than " + s1.getName());
        }
        else {
           System.out.println(s1.getName() + " is equal to " + s2.getName()); 
        }

        // Comparator - comparing by name
        // but we don't want anyone else to use the comparator, so make it an inner class! Then we make it a one-time thing!
        // StudentComparator comp = new StudentComparator();

        Comparator<Student> comp = (o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        };

        if (comp.compare(s1, s2) > 0) {
            System.out.println(s1.getName() + " is greater than " + s2.getName());
        }
        else if (comp.compare(s1, s2) < 0) {
            System.out.println(s2.getName() + " is greater than " + s1.getName());
        }
        else {
           System.out.println(s1.getName() + " is equal to " + s2.getName()); 
        }
    }
}
