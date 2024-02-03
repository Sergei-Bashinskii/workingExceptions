public class WrongLoginException extends RuntimeException{
    public WrongLoginException() {
        super("Логин не соответствует параметрам.");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
