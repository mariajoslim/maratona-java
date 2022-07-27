package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    public static String abreConexao() {
        try {
            System.out.println("abrindo arquivo");
            System.out.println("escrevendo dados arquivo");
            return "conexao aberta";
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            System.out.println("fechando recursos liberado no SO");

        }
        return null;
    }

    public static void abreConexao2() {
        try {
            System.out.println("abrindo arquivo");
            System.out.println("escrevendo dados arquivo");

        } finally {
            System.out.println("fechando recursos liberado no SO");

        }

    }
}
