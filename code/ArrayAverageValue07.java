import java.util.Scanner;

public class ArrayAverageValue07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        int[] studGrade = new int[numStudents];
        int total = 0;
        double average;
        int passCount = 0; // Initialize the number of students who passed
        int passTotal = 0;
        int failCount = 0; // Initialize the number of students who failed
        int failTotal = 0;

        for (int i = 0; i < studGrade.length; i++) {
            System.out.print("Enter student " + (i + 1) + "'s grade: ");
            studGrade[i] = sc.nextInt();

            total += studGrade[i];

            if (studGrade[i] > 70) {
                passCount++;
                passTotal += studGrade[i];
            } else {
                failCount++;
                failTotal += studGrade[i];
            }
        }

        average = (double) total / numStudents;
        System.out.println("Average value for all students: " + average);

        if (passCount > 0) {
            double passAverage = (double) passTotal / passCount;
            System.out.println("Average value for passing students: " + passAverage);
        } else {
            System.out.println("No students passed.");
        }

        if (failCount > 0) {
            double failAverage = (double) failTotal / failCount;
            System.out.println("Average value for failing students: " + failAverage);
        } else {
            System.out.println("No students failed.");
        }

        sc.close();
    }
}
