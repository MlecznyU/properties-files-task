import java.util.Scanner;

public class Main {
    private static String path;
    public static void main(String[] args) {

        System.out.println("Type patch for the file \"data.properties\" (C:\\Users\\USER(YOUR-USERNAME)\\Desktop\\data.properties)");
        Scanner input = new Scanner(System.in);
        input.nextLine();
        path=input.toString();
    }
}
