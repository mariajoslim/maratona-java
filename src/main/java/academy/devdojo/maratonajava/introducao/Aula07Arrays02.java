package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte,short,int,long,float,double 0

        //boolean false
        //String null
        String[] nomes = new String[5];
        nomes[0]= "Maria";
        nomes[1]="Jose";
        nomes[2]="Lima";
        nomes[3] = "Mário";
        nomes[4] = "Neto";
        for(int i = 0; i< nomes.length; i++){
            System.out.println("Nome completo: " + nomes[i]);
        }

    }
}
