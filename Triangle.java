import java.util.Scanner;

public class Triangle {
    public static void main (String[] arg){
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the lengths of the three edges of the triangle: ");
        double edge1 = number.nextInt();
        double edge2 = number.nextInt();
        double edge3 = number.nextInt();

        if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1) {
            System.out.println("The inputs are valid as sum of any two edg The perimeter ofthis triangle is " + (edge1 + edge2 + edge3));
        } else {
            System.out.println("The inputs are invalid as sum of two edges is less than or equal to the third edge.");
        }
        number.close();
    }
    
}
