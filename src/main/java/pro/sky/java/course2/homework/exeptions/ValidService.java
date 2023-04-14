package pro.sky.java.course2.homework.exeptions;

public interface ValidService {
    static String check(String login, String pass, String confirmPass) {
        return login + pass + confirmPass;
    }
}
