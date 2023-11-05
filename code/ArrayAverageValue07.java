import java.util.Scanner;

public class ArrayAverageValue07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] studGrade = new int[10];
        int total = 0;
        double average;

        for (int i = 0; i < studGrade.length; i++) {
            System.out.print("Enter student's grade " + (i + 1) + " : ");
            studGrade[i] = sc.nextInt();
        }

        for (int i = 0; i < studGrade.length; i++) {
            total += studGrade[i];
        }

        average = (double) total / studGrade.length;
        System.out.println("Average value: " + average);

        sc.close();
    }
}
