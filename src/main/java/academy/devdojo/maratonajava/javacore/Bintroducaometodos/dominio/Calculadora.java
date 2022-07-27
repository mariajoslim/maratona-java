package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somarDoisNumeros(){

        System.out.println(10+8);
    }
    public void subtraiDoisNumeros(){
        System.out.println(20-12);
    }
    public void multiplica(int num, int num1){
        System.out.println(num*num1);
    }
    public double divisao(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        else{
        return num1/num2;
    }}
    public double divisao2(double num1, double num2){
        if (num2 == 0){
            return 0;

        }
        else{
            return num1/num2;
        }}
    public void divisao3(double num1, double num2){
        if (num2 == 0){
            System.out.println("Não existe divisão por 0");
        }
        else{
            System.out.println(num1/num2);
        }}
    public void altera(int num,int num3){
        num = 99;
        num3 = 88;
        System.out.println("Aklteração devlor de números");
        System.out.println("Número " +num);
        System.out.println("Numero 3 "+num3);

    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for(int aux:numeros){
            soma+=aux;
        }
        System.out.println(soma);
    }
    public void somaVArArgs(int... numeros){
        int soma = 0;
        for(int aux:numeros){
            soma+=aux;
        }
        System.out.println(soma);
    }
}

