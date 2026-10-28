import java.util.ArrayList;

public class Generics {

    public static <T> void print(T x) {
        System.out.println(x);
    }
    
    public static void main(String[] args) throws Exception {
        print(10);
        print(20.55);
        print('C');
    }

    // ArrayList<int> arrs = new ArrayList<>(); //doesn't work, because Generics don't support a primitive data type
    ArrayList<Integer> arrs = new ArrayList<>(); //doesn't work, because Generics don't support a primitive data type
}
