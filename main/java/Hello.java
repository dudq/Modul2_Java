import java.util.Scanner;

public class Hello {
    public static void hello(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello: "+name);
    }
}
