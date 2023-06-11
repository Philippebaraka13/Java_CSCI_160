import java.util.Scanner;

public class Statment {
    public static void main(String[] arg) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = number.nextInt();

        if (num >= 1 && num <= 100) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        number.close();

    }
}
