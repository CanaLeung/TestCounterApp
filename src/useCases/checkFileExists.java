package useCases;

import java.io.File;

public class checkFileExists {
    public static boolean checkFile(File filename){
        return filename.exists() && !filename.isDirectory();
    }
}
