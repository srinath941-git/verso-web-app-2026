import java.util.Scanner; // Import the Scanner class

public class InputExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        // Get integer input
        System.out.print("Enter an integer: ");
        int number = input.nextInt(); 
        System.out.println("You entered: " + number);

        // Get string input
        System.out.print("Enter some text: ");
        String text = input.next();
        System.out.println("Text entered: " + text);

        input.close(); // Close the scanner object
    }
}
