import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            if(Validator.isValid(age)){
                System.out.printf("%s valid age", age);
            }

        } catch (ExceptionHandler e) {
            System.out.println("Error: "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}