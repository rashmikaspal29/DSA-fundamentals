import java.util.ArrayList;

public class Demo{

    
    public <T> void print(T x){
        System.out.println(x);
    }
 
    public static void main(String[] args) throws Exception {
        // Demo d = new Demo();
        // Integer x = 10;
        // d.print(x);
        // d.print(1.6);

        FingerPrint f = new FingerPrint(101);
        Student<FingerPrint>s1 = new Student<>("Bob", f); //Generics must be objects so you can't js send <int> 
        Student<Double>s2 = new Student<>("BobaTea", 10.01);
        // do not weitr <T> instead of ijteger 36

        //40, not need for student that import thingy bewcause we have that in same folder!
        ArrayList<Integer>arrs = new ArrayList<>();



    }
}
