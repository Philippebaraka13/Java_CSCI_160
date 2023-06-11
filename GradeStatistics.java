import java.io.File;
// import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class GradeStatistics {
    public static void main(String[] args) throws FileNotFoundException {

        // File file = new File("/Users/philippebaraka/Desktop/grades.txt");
        File grades = new File("grades.txt");

        int count = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int passCount = 0;

        int gradeACount = 0;
        int gradeBCount = 0;
        int gradeCCount = 0;
        int gradeDCount = 0;
        int gradeFCount = 0;

        Scanner scan = new Scanner(grades);
        while (scan.hasNextLine()) {
            // System.out.println(scan.nextLine());
            String line = scan.nextLine();
            int grade = Integer.parseInt(line.trim());
            count++;
            sum += grade;
            if (grade > max) {
                max = grade;
            }
            if (grade < min) {
                min = grade;
            }
            if (grade >= 60) {
                passCount++;
            }

            if (grade >= 90) {
                gradeACount++;
            } else if (grade >= 80) {
                gradeBCount++;
            } else if (grade >= 70) {
                gradeCCount++;
            } else if (grade >= 60) {
                gradeDCount++;
            } else {
                gradeFCount++;
            }
        }
        scan.close();
        if (count > 0) {
            double avg = (double) sum / count;
            System.out.println("Count of all the students: " + count);
            System.out.println("Average of all the grades: " + avg);
            System.out.println("Highest grade: " + max);
            System.out.println("Lowest grade: " + min);
            System.out.println("Number of students who passed: " + passCount);
            System.out.println("Number of students who got 'A' grade: " + gradeACount);
            System.out.println("Number of students who got 'B' grade: " + gradeBCount);
            System.out.println("Number of students who got 'C' grade: " + gradeCCount);
            System.out.println("Number of students who got 'D' grade: " + gradeDCount);
            System.out.println("Number of students who got 'F' grade: " + gradeFCount);
        } else {
            System.out.println("No valid grades in the file.");

        }
    }
}
