public class Weight {
    public static void main(String[] args) {
        int weight1 = 10;
        int weight2 = 50;
        int weight3 = 100;

        double convert = 2.20462;
        double result1;
        double result2;
        double result3;

        result1 = weight1 * convert;
        result2 = weight2 * convert;
        result3 = weight3 * convert;

        System.out.println(weight1 + "kg is " + result1 + " lbs");
        System.out.println(weight2 + "kg is " + result2 + " lbs");
        System.out.println(weight3 + "kg is " + result3 + " lbs");

    }
}
