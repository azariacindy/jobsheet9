public class NumberArray07 {
    public static void main(String[] args) {
        int[] bil = {5, 13, -7, 17}; // defines and initializes an array int = bil

        // this loop will run 4 times, variable i is initialized with 0 the loop will continue to run as long as the value of i is less than 4
        // and every time the loop runs, the value of i will increase by one i++
        for (int i = 0; i <= 4; i++) { 
            System.out.println(bil[i]); // command to print the bil array with index i. if i = 0 will print bil[0] whose output is 5
        }
    }
}
