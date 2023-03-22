import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class DataVerification {
    public static boolean checkData(String login, String password, String confirmPassword) {
        boolean result = true;
        try {
            checkLogin(login);
            checkPassword(password, confirmPassword);
        } catch (WrongLoginException e) {
            result = false;
        }catch (WrongPasswordException e){
            result = false;
        }

        return result;
    }

    private static void checkLogin(String login) {
        if (!login.matches("\\w{1,20}")) {
            throw new WrongLoginException();
        }
    }

    private static void checkPassword(String password, String confirmPassword) {
        if (!password.matches("\\w{1,19}") || !confirmPassword.matches("\\w{1,19}") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }
}
