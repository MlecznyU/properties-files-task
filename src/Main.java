import reader.MyFileReader;
import reader.Path;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Path path1 = new Path();
        String path = path1.path();
        new MyFileReader().readFileLinesList(path);
    }
}
