package academy.devdojo.maratonajava.introducao;

public class Aula07ArraysMultimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        int[] array = {1, 2, 3};
        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};
        for (int[] arrBase : arrayInt2) {
            System.out.println("/n_____________");
            for (int num : arrBase) {
                System.out.println("Novo array" + num);
            }


        }
    }
}
