package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smatphone;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneTest01 {
    public static void main(String[] args) {
        Smatphone celular = new Smatphone("1ABC1", "Iphone");
        Smatphone celular0 = new Smatphone("1251", "Samsung");
        Smatphone celular1 = new Smatphone("5888", "LG");
        List<Smatphone> smartphones = new ArrayList<>(6);
        smartphones.add(celular);
        smartphones.add(celular0);
        smartphones.add(0,celular1);
        for(Smatphone smartphone:smartphones){
            System.out.println(smartphone);
        }

        Smatphone s4 = new Smatphone("22222", "Pixel");
        smartphones.add(s4);

        System.out.println(smartphones.contains(s4));
        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(smartphones.get(indexSmartphone4));

        System.out.println(indexSmartphone4);
    }
}
