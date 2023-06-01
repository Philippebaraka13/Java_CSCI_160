import java.util.Scanner;
import java.text.NumberFormat;

public class Investement {
    public static void main(String[] args) {

        Scanner investmentCalcul = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double investment1 = investmentCalcul.nextDouble();

        System.out.println("Enter the annuel interest rate in pourcentage: ");
        double interestRate = investmentCalcul.nextDouble() / 100;

        double value5Years = investment1 * Math.pow(1 + interestRate, 5);
        double value10Years = investment1 * Math.pow(1 + interestRate, 10);
        double value20Years = investment1 * Math.pow(1 + interestRate, 20);

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        String formattedValue5Years = currencyFormat.format(value5Years);
        String formattedValue10Years = currencyFormat.format(value10Years);
        String formattedValue20Years = currencyFormat.format(value20Years);

        System.out.println("The future value of the investment in 5 years: " + formattedValue5Years);
        System.out.println("The future value of the investment in 10 years: " + formattedValue10Years);
        System.out.println("The future value of the investment in 20 years: " + formattedValue20Years);
        

        investmentCalcul.close();

    }
}
