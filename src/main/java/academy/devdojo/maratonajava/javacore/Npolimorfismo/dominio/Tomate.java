package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{

    public static final double IMPOSTO_POR_CENT0 = 0.06;
    private String dataVAlidade;//mesmo produto fazendo referencoa ao objeto tomate ele nao acessa essa variável, so intergaces e imple,mentaçoes pŕopias

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        System.out.println("Calculando imposto do tomate");
        return this.valor * IMPOSTO_POR_CENT0;

    }

    public String getDataVAlidade() {
        return dataVAlidade;
    }

    public void setDataVAlidade(String dataVAlidade) {
        this.dataVAlidade = dataVAlidade;
    }
}
