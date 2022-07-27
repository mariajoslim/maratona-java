package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro { // final no nome da cklasse nunca poderá ser extendida esta classe. a classe to string não pode ser extendida, pra naó modifucar o comportento da emsma
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;//final do java significa constante o valor nao muda
   // public  final double VELOCIDADE_LIMITE;//final do java significa constante o valor nao muda
    public final Comprador COMPRADOR = new Comprador();
   public final void imprime(){ // final no método significa que o mesmo nao podera ser sobrescrito
       System.out.println(this.nome);
   }
    //public Carro(){
           // VELOCIDADE_LIMITE = 250;
      //  }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

}

