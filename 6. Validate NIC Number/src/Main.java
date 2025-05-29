import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Id number: ");
            String id = sc.nextLine();

            if (Validator.isValid(id)) {
                Validator.idValidator(id);
            } else {
                throw new ExceptionHandler("Invalid NIC format entered.");
            }

        } catch (ExceptionHandler e) {
            System.err.println(e.getMessage());
        }
    }
}
