package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = " Amsterda' dd 'de' MMMM 'de' yyyy ";
        SimpleDateFormat sdf  =new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
        try{
            System.out.println(sdf.parse("Campo Belo 01 de março de 2022"));
        }catch(ParseException e){
            e.printStackTrace();

        }
    }
}
