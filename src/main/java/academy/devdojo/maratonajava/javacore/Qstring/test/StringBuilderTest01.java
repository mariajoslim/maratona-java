package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome ="Maria";
        nome.concat("Lima");
        nome.substring(0,3);
        System.out.println(nome);
        //StringBuilder sb = new StringBuilder("Maria Jose");
        StringBuffer sb = new StringBuffer("Maria Jose");
        sb.append("Lima").append("Paula");
        sb.substring(0,2);
        sb.reverse();
        sb.reverse();
        sb.delete(0,5);

        System.out.println(sb);
    }
}
