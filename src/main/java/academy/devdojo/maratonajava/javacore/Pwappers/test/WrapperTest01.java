package academy.devdojo.maratonajava.javacore.Pwappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP =1;
        int intP = 1;
        long longP = 10l;
        float floatP = 10F;
        double doubleP = 100;
        char charP = 'W';
        boolean booleanP = false;

        Byte bytew = 1;
        Short shortw =1;
        Integer intw = 1;//boxing
        Long longw = 10l;
        Float floatw = 10F;
        Double doublew = 100D;
        Character charw = 'W';
        Boolean booleanw = false;
        int i = intw;//unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("true");
        System.out.println(verdadeiro);
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('b'));
        System.out.println(Character.toUpperCase('b'));
        System.out.println(Character.toLowerCase('A'));

    }
    }

