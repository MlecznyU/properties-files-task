import reader.MyFileReader;
import reader.Path;

public class Main {

    public static void main(String[] args) {
        Path path1 = new Path();
        String path = path1.path();
        new MyFileReader().readFileLinesList(path);
    }
}
