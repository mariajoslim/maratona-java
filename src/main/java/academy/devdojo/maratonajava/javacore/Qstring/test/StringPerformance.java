package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformance {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto pra String"+(fim-inicio)+ "ms");

         inicio = System.currentTimeMillis();
        concatStringBuilder(30_0000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto pra String"+(fim-inicio)+ "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(30_0000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto pra String"+(fim-inicio)+ "ms");


    }
    public static void concatString(int tamanho){
            String texto = "";
            for(int i=0; i<tamanho;i++){
                texto +=i;
            }
    }

    public static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for(int i=0; i<tamanho;i++){
            sb.append(i);
        }
    }


    public static void concatStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for(int i=0; i<tamanho;i++){
            sb.append(i);
        }
    }
}
