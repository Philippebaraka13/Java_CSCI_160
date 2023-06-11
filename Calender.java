import java.util.Scanner;
public class Calender {
    public static void main(String[] arg) {

        Scanner numYear = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = numYear.nextInt();

        if (year < 1582) {
            System.out.println("Error: The Gregorian calendar was not adopted until 1582.");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        numYear.close();
    }
    
}
