public class Dec2Hex {

    // Method for converting decimal to hexadecimal
    public String convertToHex(int num) {
        if (num == 0) return "0";

        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        String hexadecimal = "";

        // Conversion process
        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }
        return hexadecimal;
    }

    public static void main(String args[]) {
        // Check if an argument is provided
        if (args.length == 0) {
            System.out.println("Error: No input provided. Please enter an integer value.");
            return;
        }

        try {
            // Try to parse the input as an integer
            int num = Integer.parseInt(args[0]);
            Dec2Hex dec2Hex = new Dec2Hex();
            String hexadecimal = dec2Hex.convertToHex(num);
            System.out.println("Hexadecimal representation is: " + hexadecimal);
        } catch (NumberFormatException e) {
            // Catch non-integer inputs and display an error message
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        }
    }
}

