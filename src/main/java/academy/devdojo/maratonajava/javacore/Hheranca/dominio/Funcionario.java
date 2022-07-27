package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;


    static {
        System.out.println("Bloco ede inicilaizcao statico funcionario estico");
    }

    {
        System.out.println("Bloco de inicializacao funcionario1 não estático");

    }

    {
        System.out.println("Bloco de inicializacao funcionario2 não estático2");

    }


    public Funcionario(String nome){
        super(nome);

    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }
    public void relatorioPagamento(){
        System.out.println("Eu "+this.nome  +"recebi o salário "+this.salario);

    }

    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return this.salario;
    }
}
