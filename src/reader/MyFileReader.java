package reader;

import java.io.*;
import java.util.Properties;

public class MyFileReader {

    public Properties readFileLinesList(String path) {
        //HashMap<String, String> data = new HashMap<>();

        Properties data = new Properties();

        File file = new File(path);

        String line;


        try {
            data.load(new FileReader(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        data.values().forEach(System.out::println);
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {

            while ((line=br.readLine()) != null){
                String[] splited = line.split("=");
                data.setProperty(splited[0],splited[1]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        data.values().forEach(System.out::println);

        return data;
    }
}
