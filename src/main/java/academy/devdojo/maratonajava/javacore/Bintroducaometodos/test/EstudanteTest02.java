package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;


public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudy = new Estudante();
        Estudante estudy01 = new Estudante();
        estudy.nome = "Marin";
        estudy.idade =  15;
        estudy.sexo =  'F';

        estudy01.nome = "Shaina";
        estudy01.idade =  13;
        estudy01.sexo =  'F';
        estudy.imprime();
        estudy01.imprime();

    }
}



