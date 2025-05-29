public class PhoneValidator {

    public static void validate(String phoneNumber) throws InvalidPhoneException {
        if (phoneNumber == null || !phoneNumber.matches("^07\\d{8}$")) {
            throw new InvalidPhoneException("Invalid phone number. It must be 10 digits and start with '07'.");
        }
    }

    public static boolean isValid(String phoneNumber) {
        try {
            validate(phoneNumber);
            return true;
        } catch (InvalidPhoneException e) {
            return false;
        }
    }
}
