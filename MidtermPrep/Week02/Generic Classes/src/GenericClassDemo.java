import java.util.ArrayList;

public class GenericClassDemo {
    public static void main(String[] args) throws Exception {
        Student<Integer, String> s1 = new Student<>(101, "Bob");
        System.out.println(s1);

        Student<String, String> s2 = new Student<>("ABC123", "Scott");
        System.out.println(s2);

        Fingerprint finger = new Fingerprint("werwtwuehfdlgherlh");

        Student<Fingerprint, String> s3 = new Student<>(finger, "Alex");
        System.out.println(s3);

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(arr);
    }
}
