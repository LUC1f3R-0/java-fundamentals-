public class Validator {

    public static void ageValidator(int age) throws ExceptionHandler {
        if (age < 0 || age > 150) {
            throw new ExceptionHandler("Invalid age: Must be between 0 and 150");
        }
    }

    public static <T> boolean isValid(T value) throws ExceptionHandler {
        if (value instanceof Integer) {
            ageValidator((Integer) value);
            return true;
        }

        throw new ExceptionHandler("Unsupported data type for validation.");
    }
}
