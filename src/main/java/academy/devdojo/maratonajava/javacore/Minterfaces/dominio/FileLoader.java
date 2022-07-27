package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando os arquivos");
    }

    @Override
    public void remove() {
        System.out.println("Deletando dados de um aquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissoes de bd");
    }
}
