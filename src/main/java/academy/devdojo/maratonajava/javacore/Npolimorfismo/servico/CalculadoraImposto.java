package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;


public class CalculadoraImposto {


    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio imposto");
        double imposto = produto.calculaImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Valor: "+produto.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
        if(produto instanceof Tomate){
        String dataValidade = ((Tomate)produto).getDataVAlidade();
        System.out.println(dataValidade);
    }}}

//dominio modelo, servico regras de negocio controller, view test
