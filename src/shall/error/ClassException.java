package shall.error;

public class ClassException extends RuntimeException {

    public ClassException() {
        super("Invalid");
    }

    public ClassException(String message) {
        super(message);
    }
}