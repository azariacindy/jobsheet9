import java.util.Scanner;

public class ArrayValue07 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] finalGrade = new int[10];

        // Populate the elements of the Final value array using looping
        for (int i = 0; i < finalGrade.length; i++) { 
            System.out.print("Enter the value " + i + " : ");
            finalGrade[i] = sc.nextInt();
        }

        // Display all the contents of the final value array element using a loop
        for (int i = 0; i < finalGrade.length; i++) { // looping through the 'finalGrade' array elements from index 0-9 [10], each iteration i will increment by 'i++' and will access all 'finalGrade' array elements
            if (finalGrade[i] > 70) { // The 'if' is used to check each element of the array. If the value in 'finalGrade[i]' is greater than 70 (indicating that the student has passed), then 'if' is executed
                System.out.println("Student " + i + " has pass! "); // if 'if' is true (the value of the finalGrade[i] element is greater than 70), the program will print a message stating that the "i" student has passed.
            } else {
                System.out.println("Student " + i + "has not passed.");
            }
        }

        sc.close();
    }
}
