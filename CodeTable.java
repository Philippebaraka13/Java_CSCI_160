public class CodeTable {
    public static void main(String[] args) {
        int start = 32;
        int end = 126;
        int countPerLine = 5;

        for (int i = start; i <= end; i++) {
            System.out.print("Value " + i + " Char " + (char)i + "\t");

            // Print a newline every five characters
            if ((i - start + 1) % countPerLine == 0) {
                System.out.println();
            }
        }
    }
    
}
