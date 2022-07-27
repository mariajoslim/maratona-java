package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();//toda classe e métodos criados nas interfaces são abstratos
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
    public static void retrieveDataSize(){
        System.out.println("Dentro do retrieve DataSize na interface");
    }

}
