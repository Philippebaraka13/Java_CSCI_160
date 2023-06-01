import java.util.Scanner;
import java.awt.Point;

public class PointTest {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter x-coordinate for the first point:");
        int x1 = number.nextInt();

        System.out.println("Enter y-coordinate for the second point:");
        int y1 = number.nextInt();

        System.out.println("Enter x-coordinate for the second point:");
        int x2 = number.nextInt();
        System.out.println("Enter y-coordinate for the second point:");
        int y2 = number.nextInt();

        // two point object
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);

        System.out.println("Point 1: " + point1.toString());
        System.out.println("Point 2: " + point2.toString());
       
        point1.translate(5, 10);
        point2.move(15, 20);

    
        System.out.println("Point 1: " + point1.toString());
        System.out.println("Point 2: " + point2.toString());

        number.close();
    }

}

