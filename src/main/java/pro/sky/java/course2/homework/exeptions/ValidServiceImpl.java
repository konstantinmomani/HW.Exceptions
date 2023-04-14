package pro.sky.java.course2.homework.exeptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidServiceImpl {
    public static void check(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcherLogin = pattern.matcher(login);
        Matcher matcherPass = pattern.matcher(password);
        Matcher matcherConfirmPass = pattern.matcher(confirmPassword);
        boolean logMatches = matcherLogin.matches();
        boolean passMatches = matcherPass.matches();
        boolean confirmPassMatches = matcherConfirmPass.matches();
        if (logMatches && login.length() <= 20) {
            System.out.println(login);
        } else throw new WrongLoginException("Login is wrong");
        if (passMatches && password.length() < 20) {
            System.out.println(password);
        } else throw new WrongPasswordException("Password is wrong");
        if (confirmPassMatches && confirmPassword.equals(password)) {
//            Думаю, 1-е условие нужно убрать
            System.out.println(confirmPassword);
        } else throw new WrongPasswordException("Confirm differ from password");
    }


}
