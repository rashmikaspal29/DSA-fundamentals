import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkApp {

    public static void print(List<Integer> lst){

        for(Integer i : lst){
            System.out.println(i);
        }
    }

    
    // public static void print(LinkedList<Integer> lnk){

    //     for(Integer i : lnk){
    //         System.out.println(i);
    //     }
    // }

    public static void main(String[] args) throws Exception {
    //     System.out.println("Hello, World!");
    //     List<Integer> lst = new LinkedList<>(); //u can only access the method of linkedlist, if its is overriden? byt can use evrything from list?

    //     // ll implements list 29:30!!!! interface tells you what to do...

    // //one interfacw extends another interface not implements
    // //static: not part of object but [art of class, can implemnenr without making an object]
    //     LinkedList<Integer> lst2 = new LinkedList<>();


        LinkedList<Integer> lst = new LinkedList<>(); 
        lst.add(12);
        lst.add(102);
        lst.add(109);

        ArrayList<Integer>arrs = new ArrayList<>();
        arrs.add(100);
        arrs.add(200);
        arrs.add(300);

       
        print(arrs);
        print(lst);
    }
}
