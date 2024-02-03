public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException() {
        super("Пароль не соответствует параметрам.");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
