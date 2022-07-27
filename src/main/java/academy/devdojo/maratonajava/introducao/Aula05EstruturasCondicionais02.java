package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args){
        int idade = 36;
        String categoria;
      //  if (idade < 15){
            //System.out.println("Categoria infantil");
            categoria = "CAtegoria infANTIL";
        //}else if(idade>=15 && idade<18){
            //System.out.println("Categoria juvenil");
            categoria = "Categoria juvenil";
        //}
       // else{
            //System.out.println("categoria adulto");
           // categoria = "categoria Adulto";
       // }
        categoria = (idade < 15) ? "CAtegoria infANTIL" : (idade>=15 && idade<18) ? "CAtegoria juvenil" : "CAtegoria Adulto";



            System.out.println(categoria);
    }
}
