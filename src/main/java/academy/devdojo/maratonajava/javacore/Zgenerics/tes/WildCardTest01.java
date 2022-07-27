package academy.devdojo.maratonajava.javacore.Zgenerics.tes;


abstract class Animal{
    public abstract void consulta();
}
class Cachorro extends Animal{
    @Override
    public void  consulta(){
        System.out.println("Consultando o doguinho");
    }
}

class Gato extends Animal{
    @Override
    public void consulta(){
        System.out.println("Consultando Gato");
    }

}

public class WildCardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(),new Cachorro()};
        Gato[] gatos = {new Gato(),new Gato()};
        printConsulta(cachorros);
        printConsulta(gatos);
        Animal[] animais = {new Gato(), new Cachorro()};
        System.out.println(animais  );

    }
        private static void printConsulta(Animal[] animals){
            for(Animal animal:animals){
                animal.consulta();
            }
        }

    }

