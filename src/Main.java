public class Main {

    public static void loginVerification(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20 || !login.matches("[a-zA-Z0-9_]+")) {
                throw new WrongLoginException();
            }
            if (password.length() > 20 || !password.matches("[a-zA-Z0-9_]+")) {
                throw new WrongPasswordException();
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают.");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Неправильно введенный: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String login = "java_skypro_go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";
        loginVerification(login, password, confirmPassword);
    }
}