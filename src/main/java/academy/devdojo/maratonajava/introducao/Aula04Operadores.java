package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int soma = num1+num2;
        int mult = num1*num2;
        int subtracao = num1-num2;
        double divi = num1/(double)num2;//casting forçando div inteiro e double
        int resto = 20%7;
        boolean isDezMaiorQueVinte = 10>20;
        boolean isComp = 10< 20;
        boolean isIgual = 10==20;
        boolean isDezIez = 10 == 10.0;
        boolean isDez = 10!=10;
        int idade = 29;
        float salario = 3500.0f;
        boolean isDentroDaLeiMAiorQue30 = idade > 30 && salario >= 4612;
        double valorTotalCC = 200;
        double valorTotalcp = 10000;
        float valorPlatstation = 5000;
        double bonus = 1800;
        int contador = 0;
        int contador2 = 0;

        contador++;
        contador--;
        ++contador;
        --contador;
        bonus += 1000;
        bonus -=1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);
        System.out.println(contador);
        System.out.println(++contador2);

        boolean isPlayStationCompravel = valorTotalCC > valorPlatstation || valorTotalcp > valorPlatstation;
        boolean isDentroDentrodaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("Maior que 30 " +isDentroDaLeiMAiorQue30);
        System.out.println("Menor que 30 " +isDentroDentrodaLeiMenorQueTrinta);
        System.out.println("Play Station 5 é comprável "+isPlayStationCompravel);





        System.out.println("A soma é: "+soma+ " .A subtração é: "+subtracao+" .A multiplicacao é:"+mult+" .A divisao é: "+divi+"resto: "+resto+" .Dez é maior que 20? " +
                "Resposta: "+isDezMaiorQueVinte+ ". 10 é menor que 20" +isComp+ " 10 é igual a 20?"+isIgual+ " 10 igual a 10.0"+isDezIez+" 10 é diferente de 10"+isDez);

    }
}
