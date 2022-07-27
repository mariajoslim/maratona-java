package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverflow {
    public static void main(String[] args) {
        recursividade();
    }
        public static void recursividade(){
            recursividade();
        }

    }

