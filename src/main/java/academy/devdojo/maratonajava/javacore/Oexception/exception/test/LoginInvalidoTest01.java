package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTest01 {
    public static void main(String[] args) {
        try{
        logar();
    }catch(LoginInvalidoException e){
            e.printStackTrace();
        }}
        private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Saori";
        String senhaDB="Athena";
            System.out.println("Usuario");
            String usernameDigitado= teclado.nextLine();
            System.out.println("senha");
            String senhadigitada = teclado.nextLine();
            if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhadigitada)){
                throw new LoginInvalidoException("Usuário ou senha invalidos");


        }
            System.out.println("Usuario logado com sucesso");
    }
}
