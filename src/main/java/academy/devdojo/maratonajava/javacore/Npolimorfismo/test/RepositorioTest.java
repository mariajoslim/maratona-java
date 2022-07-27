package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBD;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBD();
        repositorio.salvar();//só ir teocando de objeto como exeplificado no zódigo
        //Repositorio repositorio = new RepositorioMemoria();
        //repositorio.salvar();
        //Repositorio repositorio = new RepositorioArquivo();
       // repositorio.salvar();

    }
}
