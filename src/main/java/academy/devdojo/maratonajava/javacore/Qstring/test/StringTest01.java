package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Mario";
        String nome1 = "Mario";
        nome = nome.concat("Neto");//1 varivel de referencia, 2objeto do tipo string, 3 string no pool de string
        System.out.println(nome);
        System.out.println(nome == nome1);
        String nome3 = new String("Mario");
        System.out.println(nome1 == nome3.intern());
    }
}
