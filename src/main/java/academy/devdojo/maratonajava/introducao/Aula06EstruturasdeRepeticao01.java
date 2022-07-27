package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasdeRepeticao01 {
    public static void main(String[] args) {
        int count = 0;
        while(count<10){
            System.out.println(++count);
        }
        int cont = 0;
        do {
            System.out.println("contando"+ ++cont);
        }
            while (cont<20);
        for(int i =0; i<=18;i++){
            System.out.println("Trabalhando o for "+i);
        }


    }
}
