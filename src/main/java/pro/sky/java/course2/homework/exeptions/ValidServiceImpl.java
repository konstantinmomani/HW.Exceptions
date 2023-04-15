package pro.sky.java.course2.homework.exeptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidServiceImpl implements ValidService {

    public void check(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException, WrongConfirmPasswordException {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcherLogin = pattern.matcher(login);
        Matcher matcherPass = pattern.matcher(password);
        boolean logMatches = matcherLogin.matches();
        boolean passMatches = matcherPass.matches();
        if (logMatches && login.length() <= 20) {
            System.out.println("Login: " + login);
        } else throw new WrongLoginException("Login is wrong");
        if (passMatches && password.length() < 20) {
            System.out.println("Password: " + password);
        } else throw new WrongPasswordException("Password is wrong");
        if (confirmPassword.equals(password)) {
            System.out.println("Confirm password: " + confirmPassword);
        } else throw new WrongConfirmPasswordException("Confirmation differ from password");
    }
}
