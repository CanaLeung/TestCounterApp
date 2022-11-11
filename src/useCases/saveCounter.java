package useCases;

import Entities.counter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class saveCounter {
    // will save the count number in a file called "count.txt"
    public static void save() {
        try {
            File countFile = new File("count.txt");
            FileWriter fw = new FileWriter(countFile);
            PrintWriter pw = new PrintWriter(fw);

            pw.println("Count: " + counter.getCount());
            pw.close();

            if (checkFileExists.checkFile(countFile) &&
                    countFile.createNewFile()) {
                System.out.println("File created: " + countFile.getName());
            } else {
                System.out.println("File overwritten.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
