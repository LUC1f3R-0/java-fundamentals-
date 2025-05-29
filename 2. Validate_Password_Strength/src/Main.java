import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter password: ");
            String password = sc.nextLine().trim();

            if (isValid(password)) {
                System.out.printf("%s is a valid password\n", password);
            }

        } catch (Exception e) {
            System.out.println("Invalid password: " + e.getMessage());
        }
    }

    public static boolean isValid(String _password) throws Exception {
        if (_password == null || _password.length() <= 8) {
            throw new Exception("Password must be more than 8 characters");
        }

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;

        for (char c : _password.toCharArray()) {
            if (Character.isLowerCase(c)) hasLower = true;
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isDigit(c)) hasDigit = true;
        }

        if (!hasLower) throw new Exception("Password must contain at least one lowercase letter");
        if (!hasUpper) throw new Exception("Password must contain at least one uppercase letter");
        if (!hasDigit) throw new Exception("Password must contain at least one numeric digit");

        return true;
    }
}
