
import java.util.Scanner;

class Dec2Hex {
    public static int Arg1;

    public static void main(String args[]) {
        // Check if an argument is provided
        if (args.length == 0) {
            System.out.println("Error: No input provided. Please enter an integer value.");
            return;
        }

        try {
            // Try to parse the input as an integer
            Arg1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            // Catch non-integer inputs and display an error message
            System.out.println("Error: Invalid input. Please enter a valid integer.");
            return;
        }

        // Array of hexadecimal characters
        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem, num;
        num = Arg1;
        String hexadecimal = "";

        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        // Conversion process
        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);
    }
}
