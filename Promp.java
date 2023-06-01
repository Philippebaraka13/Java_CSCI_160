import java.util.Scanner;

public class Promp {

    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);
        System.out.println("Enter a single character: ");

        char character = object.next().charAt(0);

        boolean isLetter = Character.isLetter(character);
        System.out.println("Is the character a letter? " + isLetter);

        object.close();

    }
}
