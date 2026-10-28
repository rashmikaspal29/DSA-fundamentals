
/******************************************
 *  Author : Rashmi Kaspal
 *  Created On : 10/08/2026
 *  File : Kaspal_Project1
 *  Description: This program simulates a browser’s DNS cache by storing URLs and their corresponding IP addresses
 *  and managing entries using the Least Recently Used (LRU) policy.
 *******************************************/

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.ArithmeticException;
import java.util.Scanner;

public class Simulator {

    public static void simulate(ArrayCache cache, String filename) throws FileNotFoundException{

        File file = new File(filename);

        if(!file.exists()){
            throw new FileNotFoundException("Error: File cannot be executed.");

        }
        try(Scanner input = new Scanner(file)){ 
        while(input.hasNextLine()){
            String line = input.nextLine();
            String[] values = line.split(":");
            String url = values[0];
            String ip = values[1]; 

            if(cache.get(url) == null){
                cache.put(url, ip);
            }
            System.out.println(cache.toString());
            
        }
        input.close(); 
    }
        
    }

    
    public static void printStats(ArrayCache cache) throws ArithmeticException{
 
        double numCacheRequests1 = cache.getHits() + cache.getMisses();
        double numCacheRequests2 = cache.getMisses() + cache.getHits();
       
        double hitRate = (cache.getHits()) / numCacheRequests1 * 100;
    
        double missRate = cache.getMisses() / numCacheRequests2 * 100;

        if(numCacheRequests1 == 0)
            throw new ArithmeticException("Error: Can't divide by zero. Try again.");
        
        if (numCacheRequests2 == 0)
            throw new ArithmeticException("Error: Can't divide by zero1. Try again.");

        System.out.printf("Hit Rate: %.2f%%\n", hitRate);
        System.out.printf("Miss Rate: %.2f%%", missRate);

       
    }
    public static void main(String[] args) throws Exception {
        
        Scanner input1 = new Scanner(System.in);

        System.out.println("Please enter query file name: ");
        String queryFile = input1.nextLine();

        System.out.println("Please enter a positive cache size: ");
        int sizeOfCache = input1.nextInt();

        while((sizeOfCache < 0) && (input1.hasNextInt())){
            System.out.println("Please enter a positive cache size: ");
            sizeOfCache = input1.nextInt();  
            input1.nextLine();
        }

        ArrayCache cache1 = new ArrayCache(sizeOfCache);
        try{
            simulate(cache1, queryFile);
        } catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }

        try{
            printStats(cache1);
        } catch (ArithmeticException dx){
            System.out.println(dx.getMessage());
        }
        
    input1.close();
     }
}
