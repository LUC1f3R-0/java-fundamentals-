import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Email: ");
            String email = sc.nextLine().trim();

            if (Validator.isValid(email)) {
                System.out.printf("%s This is a valid Email", email);
            }

        } catch (ExceptionHandler e) {
            System.out.println("Invalid Email: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }
}
