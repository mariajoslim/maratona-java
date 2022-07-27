package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa{//nao pode ser instancoada a classe, mas pode ser extendida e as classes filhas serem instanciadas. nos método abstrado ele nso possui corpo
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }
    public abstract void calculaBonus();//metodos abstratos não tem corpo e isso obriga as classes filhas a implementrem metodos para bpra sobrescrever o da classe mae.

    @Override
    public void imprime() {
        System.out.println("Imprimindo");
    }
}
