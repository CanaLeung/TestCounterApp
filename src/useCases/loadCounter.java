package useCases;

import Entities.counter;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class loadCounter {
    public static void loadCount(){
        File saveFile = new File("count.txt") ;

        try{
            if (checkFileExists.checkFile(saveFile)){
                Scanner scan = new Scanner(saveFile);
                String line = scan.nextLine();
                String[] separated = line.split(": ", 2);
                int newCount = Integer.parseInt(separated[1]);
                counter.setCount(newCount);
                System.out.println("File loaded. Count: " + newCount);
            }
            else{
                System.out.println("File does not exist.");
            }
        }
        catch (IOException e){
            System.out.println("An error occurred.");
        }
    }
}
