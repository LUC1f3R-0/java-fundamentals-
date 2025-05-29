import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter your name: ");
            String username = sc.nextLine();

            if (isValid(username)) {
                System.out.printf("%s is valid",username);
            } else {
                System.out.printf("%s is not valid", username);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static boolean isValid(String username) {
        return username.length() >= 5 && !username.contains(" ") && Character.isLetter(username.charAt(0));
    }
}