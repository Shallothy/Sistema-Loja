package shall.error;

public class InvalidNumberException extends ClassException {
    public InvalidNumberException() {
        super("Invalid format: Please enter a valid numeric value.");
    }

    public InvalidNumberException(String message) {
        super(message);
    }
}
