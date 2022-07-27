package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;
class Animal{
    public void walk(){
        System.out.println("Animal caminhando");
    }
}
public class AnonimoClasseTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal()
        {
            @Override
            public void walk(){
            System.out.println("Walkink in the Shadow");
        }

        };
        animal.walk();
    }
}