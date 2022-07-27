package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smatphone;

public class EqualsTest01 {
    public static void main(String[] args) {
    //    String nome1 = "Maria Jose";
     ////   String nome2 = new String("Maria Jose");
        //System.out.println(nome1.equals(nome2));
        Smatphone s1 = new Smatphone("1ABC1","Nokia");
        Smatphone s2 = new Smatphone("1ABC1","Nokia");
        System.out.println(s1.equals(s2));
    }

}
