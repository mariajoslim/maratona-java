package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String... args) {
        Professor teacher = new Professor("Girafales");
        Professor teacher0 = new Professor("Madruga");
        Professor[] teachers = {teacher, teacher0};
        Escola school = new Escola("Jośe Monreiro", teachers);
        school.imprime();

    }
}
