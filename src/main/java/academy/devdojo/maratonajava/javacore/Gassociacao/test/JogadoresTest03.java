package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadoresTest03 {
    public static void main(String[] args) {
        Jogador soccer = new Jogador("Hulk");
        Jogador soccer0 = new Jogador("ronaldinho gaucho");
        Time time0 = new Time("BArcelona");
        Time time = new Time("Atlético Mineiro");
        Jogador[] jogadores = {soccer};
        Jogador[] jogadores1 = {soccer0};
        soccer.setTime(time);
        soccer0.setTime(time);

        time.setJogadores(jogadores);
        time.setJogadores(jogadores1);
        System.out.println("--------Jogadores------");
        soccer.imprime();
        soccer0.imprime();
        System.out.println("--------Time------");
        time.imprime();
        time0.imprime();

    }
}
