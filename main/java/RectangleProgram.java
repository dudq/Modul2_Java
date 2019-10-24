import java.util.Scanner;
public class RectangleProgram {
    public static void rectangleProgram(){
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter With");
        width = scanner.nextFloat();

        System.out.println(" Enter Height");
        height = scanner.nextFloat();

        float area = width*height;
        System.out.println(" Area is: "+area);
    }
}
