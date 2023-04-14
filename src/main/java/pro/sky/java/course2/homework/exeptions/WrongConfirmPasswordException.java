package pro.sky.java.course2.homework.exeptions;

public class WrongConfirmPasswordException extends Exception{
    public WrongConfirmPasswordException() {
    }

    public WrongConfirmPasswordException(String message) {
        super(message);
    }

    public WrongConfirmPasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongConfirmPasswordException(Throwable cause) {
        super(cause);
    }

    public WrongConfirmPasswordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
