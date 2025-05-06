import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SOUTH AFRICAN ID VALIDATOR");
        System.out.println("==========================");
        
        try {
            while (true) {
                System.out.print("\nEnter ID number (or 'quit' to exit): ");
                String input = scanner.nextLine().trim();
                
                if (input.equalsIgnoreCase("quit")) break;
                if (input.isEmpty()) continue;
                
                System.out.println(ValidateSald.validateWithFullDetails(input));
            }
        } finally {
            scanner.close();
            System.out.println("\nApplication closed.");
        }
    }
}
