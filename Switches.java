import java.util.Scanner;

public class Switches { 
    public static void main ( String[] arg) {
       
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int a = number.nextInt();
        int x;
        x = 0;

        switch( a) {
            case 1: 
            if (a == 1){
                x += 5;
                System.out.println(" Value X: " + x);
            }
            break;
            case 2: 
            if (a == 2){
                x += 10;
                System.out.println(" Value X: " + x);
            }
            break;
            case 3:
            if(a == 3){
                x += 16;
                System.out.println(" Value X: " + x);
            }
            break;
            case 4: 
            default:
             {
                x += 34;
            }
            System.out.println(" Value X: " + x);
        }
        number.close();
    }
    
}
