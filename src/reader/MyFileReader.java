package reader;

import java.io.*;
import java.util.Properties;

public class MyFileReader {

    public Properties readFileLinesList(String path) {
        //HashMap<String, String> data = new HashMap<>();
        Properties data = new Properties();
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
