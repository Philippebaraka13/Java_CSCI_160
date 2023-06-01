import java.text.NumberFormat;
public class Test {
    public static void main(String[] args) {
        int a = 6;
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        String output = nf.format(a);
        System.out.println("number: " + output);
        double d = Math.PI;
        System.out.println("d = " + d );
    }

}
