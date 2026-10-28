
/** ****************************************
 *  @Author      : Ali Azhari   
 *  @Created On  : October 15 2026
 *  @File        : Simulator.java
 *  @Description  : TODO
 ****************************************** */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Simulator {

    public static void main(String[] args) throws FileNotFoundException {
      

        // todo
        // don't forget to implement Comparator

        @SuppressWarnings("unused")
        DoubleLinkedList<Integer> linkedList = new DoubleLinkedList<>();

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(new File("commands.csv"));

        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();
            String[] words = line.split(",");

            switch (words[0]) {
                case "create":
             
                System.out.println("create");
                break;
                case "insert":
                   // todo
                   // Call insert
                   
                case ("remove"):
                    // todo
                   // call remove
                    break;
                case ("get"):
                    // todo
               // call getEntry
                
                break;
                case ("print"):
                    // todo
                    // print in a natural order if argument is 0
                    // print after sorting if argument is 1
                    break;
                
                default:
                
                    System.out.println("Unknown Command");
            }
        }
    }
}
