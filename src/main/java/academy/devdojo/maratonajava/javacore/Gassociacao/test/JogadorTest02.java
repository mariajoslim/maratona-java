package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador joga = new Jogador("Tostão");
        Jogador joga2 = new Jogador("Maradona");
        Time time = new Time("Seleção Alemã");
        joga.setTime(time);
        joga.imprime();
        joga2.imprime();
    }
}
