import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner maximum = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = maximum.nextInt();
        System.out.print("Enter Second number: ");
        int num2 = maximum.nextInt();
        System.out.print("Enter Third number: ");
        int num3 = maximum.nextInt();

        int max = Math.max(num1, Math.max(num2, num3));

        System.out.println("The maximum value is " + max);

        maximum.close();
        

    }
}
