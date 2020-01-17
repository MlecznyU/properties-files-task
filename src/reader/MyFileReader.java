package reader;

import com.sun.jdi.Value;

import java.io.*;
import java.util.HashMap;

public class MyFileReader {

    public HashMap<String, String> readFileLinesList(String path) {
        HashMap<String, String> data = new HashMap<>();
        String line;
        File file = new File(path);
        try(BufferedReader br = new BufferedReader(new FileReader(file));) {
            while ((line=br.readLine()) != null){
                String[] splited = line.split("=");
                data.put(splited[0],splited[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        data.values().forEach(System.out::println);
        return data;
    }
}
