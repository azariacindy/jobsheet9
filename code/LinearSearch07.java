import java.util.Scanner;

public class LinearSearch07 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int numElements = sc.nextInt();

        int[] arrayInt = new int[numElements];

        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.print("Enter the key to search for: ");
        int key = sc.nextInt();

        int result = -1; // Initialize result to -1 (not found)

        for (int i = 0; i < numElements; i++) {
            if (arrayInt[i] == key){
                result = i;
                break;
            }
        }

        if (result != -1) {
            System.out.println("The key is in the array at index position: " + result);
        } else {
            System.out.println("The key is not found in the array.");
        }

        sc.close();
    }
}
