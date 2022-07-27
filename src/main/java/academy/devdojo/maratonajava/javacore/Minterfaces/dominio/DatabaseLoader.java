package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    // private->default->protected->public
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dads");
    }

    @Override
    public void remove() {
        System.out.println("Removendo daods do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checagem de permissoes");
    }
    public static void retrieveDataSize(){
        System.out.println("Dentro do retrieve DataSize na interface");
    }


}
