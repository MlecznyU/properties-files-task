package reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class MyFileReader {

    public List<String> readFileLinesList(String path){

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("File not found, type patch again");
        }
        return null;
    }

}
