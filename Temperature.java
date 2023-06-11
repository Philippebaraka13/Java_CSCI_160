import java.util.Scanner;

public class Temperature {
    public static void main(String[] arg) {

        Scanner tempNumeber = new Scanner(System.in);
        System.out.println("Enter the temperature as a whole number: ");
        int temp1 = tempNumeber.nextInt();
        

        if (temp1 >= 90 && temp1 <= 110) {
            System.out.println("It is probably summer.");
        } else if (temp1 >= 70 && temp1 < 90) {
            System.out.println("It is probably spring.");
        } else if (temp1 >= 50 && temp1 < 70) {
            System.out.println("It is probably fall.");
        } else if ( temp1 < 50 && temp1 >= -4) {
            System.out.println("It is probably winter.");
        } else if (temp1 > 110 || temp1 <= -5) {
            System.out.println("Outside the valid range.");
        }
        tempNumeber.close();

    }
    
}
