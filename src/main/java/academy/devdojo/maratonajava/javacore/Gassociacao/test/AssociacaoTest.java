package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local loca = new Local("Rua das lrajeiras");
        Aluno aluni = new Aluno("MArcos Flausino", 24);
        Professor prof = new Professor("Pardal", "cientista");
        Aluno[] alunosSminario = {aluni};

        Seminario seminario = new Seminario("Projeto Genoma", alunosSminario, loca);

        Seminario[] seminarioDisponiveis = {seminario};
        prof.setSeminarios(seminarioDisponiveis);
        prof.imprime();

    }
}
