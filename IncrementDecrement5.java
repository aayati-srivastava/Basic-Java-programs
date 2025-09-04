import java.util.Scanner;

public class IncrementDecrement5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ask the user for the initial value of x
        System.out.print("Enter the initial value of x: ");
        int x = input.nextInt();
        
        System.out.println("\n--- Post-increment (x++) ---");
        System.out.println("Original x: " + x);       // Display original value
        System.out.println("During x++: " + x++);     // Post-increment (returns original value, then increments)
        System.out.println("After x++: " + x);        // Display updated value
        
        // Reset x to the user's input
        System.out.print("\nEnter the initial value of x again: ");
        x = input.nextInt();
        
        System.out.println("\n--- Pre-increment (++x) ---");
        System.out.println("Original x: " + x);       // Display original value
        System.out.println("During ++x: " + ++x);     // Pre-increment (increments first, then returns new value)
        System.out.println("After ++x: " + x);        // Display updated value
        
        input.close(); // Close the scanner
    }
}