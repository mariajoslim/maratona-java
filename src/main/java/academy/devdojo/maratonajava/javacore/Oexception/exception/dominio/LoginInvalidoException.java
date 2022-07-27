package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        super("Login Invaldo");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
