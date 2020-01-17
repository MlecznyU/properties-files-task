package reader;

import java.util.Scanner;

public class Path {
    public String path() {
                System.out.println("Type patch for the file \"data.properties\" (C:\\Users\\USER(YOUR-USERNAME)\\Desktop\\data.properties)");
                Scanner input = new Scanner(System.in);
                return input.nextLine();

    }
}
