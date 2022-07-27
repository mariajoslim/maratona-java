package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.Turma;
import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;


import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1l,"MArioNeto","sol@sol");
        Turma turma = new Turma("2 F MARATOVA JAVA VIRADO NO JIRAYA");
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();

    }
    private static void serializar(Aluno aluno){
        Path path = Paths.get("aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){

            oos.writeObject(aluno);
        }catch(Exception e)  {
            e.printStackTrace();
        }
    }

    private static void deserializar(){
        Path path = Paths.get("aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){

           Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        }catch(Exception e)  {
            e.printStackTrace();
        }
    }
}
