package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;

public class InnerClassesTest01 {

    private String name = "CDZ";
    class Inner{
        public void printOutClasAttributre(){
            System.out.println(name);
            System.out.println(this);
        }
    }
    public static void main(String[] args) {
        InnerClassesTest01 outerClass = new InnerClassesTest01();
        Inner inner = outerClass.new Inner();
        Inner inner2 = new InnerClassesTest01().new Inner();

        inner.printOutClasAttributre();
        inner2.printOutClasAttributre();

    }
}
