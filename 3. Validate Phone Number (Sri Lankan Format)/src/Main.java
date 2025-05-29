import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter number: ");
            String number = sc.nextLine();

            if (PhoneValidator.isValid(number)) {
                System.out.println("✅ Phone number is valid.");
            } else {
                System.out.println("❌ Phone number is invalid.");
            }

        } catch (Exception e) {
            System.out.println("ErrorA: " + e.getMessage());
        }

    }
}
