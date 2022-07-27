package academy.devdojo.maratonajava.introducao;

public class Aula07ArraysMultimensionais01 {
    public static void main(String[] args) {
        int[][] dias= new int[3][3];
        dias[0][0]=31;
        dias[0][1]=28;
        dias[0][2]=31;

        dias[1][0]=30;
        dias[1][1]=31;
        dias[1][2]=30;

        dias[2][0]=31;
        dias[2][1]=30;
        dias[2][2]=31;

        for(int i = 0; i<dias.length; i++){
            for(int j = 0; j<dias.length; j++){
                System.out.println("Dias do mês " +dias[i][j]);
            }
        }

        System.out.println("__________________________________________________________________________________");
        for(int[] assBase:dias){
            for(int num: assBase){
                System.out.println("Dias da semana " +num);
            }
        }
    }
}
