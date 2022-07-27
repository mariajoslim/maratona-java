package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;

public class OuterClassesTest02 {
    private String nome = "Pandora tigrão";
    void print(final String param){
        class LocalClass{
            public void printLocal(){
                String lastName = "Lima";
                System.out.println(param);

                System.out.println(nome+"  "+lastName);
            }
        }

         new LocalClass().printLocal();
    }
    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        //outer.print();


    }
}
