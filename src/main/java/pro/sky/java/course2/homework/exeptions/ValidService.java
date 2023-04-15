package pro.sky.java.course2.homework.exeptions;

public interface ValidService {
    void check(String login, String pass, String confirmPass)
            throws WrongLoginException, WrongPasswordException, WrongConfirmPasswordException;
}
