public class Validator {

    public static void emailHandler(String _message) throws ExceptionHandler {
        if (_message.isEmpty()) {
            throw new ExceptionHandler("email can't be empty");
        } else if (_message.contains(" ")) {
            throw new ExceptionHandler("email can't contain spaces");
        } else if (!_message.contains("@")) {
            throw new ExceptionHandler("invalid email: missing '@'");
        } else if (!_message.contains(".")) {
            throw new ExceptionHandler("invalid email: missing domain part (e.g., '.com')");
        }
    }

    public static boolean isValid(String _message) throws ExceptionHandler {
        emailHandler(_message);
        return true;
    }
}
