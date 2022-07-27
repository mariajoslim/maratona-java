package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome;//todas as subclasses que hrdam a super classe e tbm as classes do mesmo pacote tem acesso aos atributos pprotected
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Bloco ede inicilaizcao statico pessoa estico");
    }

    {
        System.out.println("Bloco de inicializacao pessoa1 não estático");

    }

    {
        System.out.println("Bloco de inicializacao pessoa não estático2");

    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(endereco.getRua() + " " + endereco.getCep());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
