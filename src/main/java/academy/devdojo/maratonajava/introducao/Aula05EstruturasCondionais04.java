package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondionais04 {
    public static void main(String[] args) {
        double salarioAnual= 32000;
        double imposto;

       // if (salarioAnual <= 34712){
         //   imposto= salarioAnual * 0.097;
        //}else if (salarioAnual>=34713 && salarioAnual<=68507){
          //  imposto = salarioAnual * 0.3735;
        //}else {
           // imposto= salarioAnual * 0.495;

      //  }
        double v = salarioAnual * 0.3735;
        imposto = (salarioAnual<=34712)? salarioAnual*0.097 : (salarioAnual>=34713 && salarioAnual<=68507) ? salarioAnual*0.3735 : salarioAnual*0.495;
        System.out.println("O acréscimo é " +imposto);
    }
}
