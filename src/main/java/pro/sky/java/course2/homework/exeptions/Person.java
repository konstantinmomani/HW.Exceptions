package pro.sky.java.course2.homework.exeptions;

public class Person {
    ValidServiceImpl validService = new ValidServiceImpl();
    private String login;
    private String password;
    private String confirmPassword;

    public Person(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public void getPerson() {
//        2 варианта вывода
        try {
            validService.check(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            throw new RuntimeException(e);
        } catch (WrongPasswordException e) {
            System.err.println(e.getMessage());
        } catch (WrongConfirmPasswordException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }
}

