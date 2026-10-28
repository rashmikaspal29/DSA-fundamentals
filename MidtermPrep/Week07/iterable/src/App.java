import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        Student<Integer> s1 = new Student<>("Bob", 19);
        Student<Integer> s2 = new Student<>("A", 20);

        s1.addGrade(90);
        s1.addGrade(91);
        s1.addGrade(92);
        s1.addGrade(93);
        s1.addGrade(94);

        for (int g: s1) {
            System.out.println(g);
        }

        // Comparator<Student<Integer>> cmp = new Comparator<>() {

        //     @Override
        //     public int compare(Student<Integer> s1, Student<Integer> s2) {
        //         return s1.getAge() - s2.getAge();
        //     }

        // };

        Comparator<Student<Integer>> cmp = (o1, o2) -> 
            o1.getAge() - o2.getAge();


        if(cmp.compare(s1, s2) > 0) {
            System.out.println("s1 is > s2");
        }
    }
}
