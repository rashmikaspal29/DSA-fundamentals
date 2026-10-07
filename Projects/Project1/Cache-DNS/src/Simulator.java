import java.io.File;
import java.util.Scanner;

public class Simulator {

    public void simulate(ArrayCache cache, File filename){
        try(Scanner input = new Scanner(filename)){
        while(input.hasNextLine()){
            String line = input.nextLine();
            String[] values = line.split(" ");
            String url = values[0];
            //but it stays to get the url so don't we have to return instrad?

            cache.get(url);

        }
        //return "yes";
        //so what this means read the file

        // if the file returns null, 
        // which means file doesn't have anything then put name and value there

        //if the file doesn't return null,
        //the file has sth in it
        // so when you read it you can return a whole line, and you just have ti get the name
    }
        
    }
    public void printStats(){

    }
    public static void main(String[] args) throws Exception {
        
     }
}
