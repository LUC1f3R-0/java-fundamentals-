public class Validator {

    public static void idValidator(String id) throws ExceptionHandler {
        if (id == null) {
            throw new ExceptionHandler("NIC cannot be null");
        }

        if (id.matches("^\\d{9}[vV]$")) {
        } else if (id.matches("^\\d{12}$")) {
            return;
        } else {
            throw new ExceptionHandler("Invalid NIC format");
        }
    }

    public static <T> boolean isValid(T value) {
        if (value instanceof String str) {
            return str.matches("^\\d{9}[vV]$") || str.matches("^\\d{12}$");
        }
        return false;
    }
}
