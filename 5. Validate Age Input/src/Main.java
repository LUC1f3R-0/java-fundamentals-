import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Age: ");
            String input = sc.nextLine();

            try {
                int age = Integer.parseInt(input);
                if (Validator.isValid(age)) {
                    System.out.printf("%d is a valid age\n", age);
                }
            } catch (NumberFormatException e) {
                throw new ExceptionHandler("Invalid input: Please enter a numeric value.");
            }
        } catch (ExceptionHandler e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
