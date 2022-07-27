package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest02 {
    public static void main(String[] args) throws IOException {

        File arquivoDiretorio = new File("pasta");
        boolean isDiretorioCriado = arquivoDiretorio.mkdir();
        System.out.println("Pasta criada"+isDiretorioCriado);
        //File fileArquiviDiretorio = new File("/home/maria/Documentos/maratona-java/pasta/arquivo.txt");
        File fileArquiviDiretorio = new File(arquivoDiretorio, "arquivo.txt");
        boolean isFileCreated = fileArquiviDiretorio.createNewFile();
        System.out.println("Arquivo criado?"+isFileCreated);
        File fileRenanne = new File(arquivoDiretorio, "arquivo_renomeado.txt");
        boolean isRenamed = fileArquiviDiretorio.renameTo(fileRenanne);
        System.out.println("Arquivo renomeado?"+isRenamed);

    File diretorioRenamed = new File("pasta2");
    boolean isDiretorioRenomeado = arquivoDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio Pasta 2 renomeada?"+isDiretorioRenomeado);
    }
}
