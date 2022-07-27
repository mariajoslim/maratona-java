package academy.devdojo.maratonajava.introducao;

public class Aula05EsruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Vou doar 500 pra mim mesma";
        String mensagemNdoar = "Não poderei doar";
        //ternario (condicao)?(if)verdadeiro:(else)falso
        String resultado = (salario>5000)? mensagemDoar :mensagemNdoar;
        System.out.println(resultado);

    }
}
