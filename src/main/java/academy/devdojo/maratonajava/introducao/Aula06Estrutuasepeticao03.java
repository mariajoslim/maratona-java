package academy.devdojo.maratonajava.introducao;

public class Aula06Estrutuasepeticao03 {
    public static void main(String[] args) {
        int valorMAx = 50;
        for(int i = 0; i <=valorMAx; i++){
            if(i > 25){
                break;
            }
            System.out.println("Número fora da condicao " +i);
        }
    }
}
