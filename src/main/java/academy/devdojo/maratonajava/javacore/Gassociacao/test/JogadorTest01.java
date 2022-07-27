package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador player = new Jogador("Ronaldinho Gaúcho");
        Jogador player1 = new Jogador("Huck");
        Jogador player2 = new Jogador("Victor");
        Jogador[] players = {player, player1, player2};
        for(Jogador jogador: players){
            jogador.imprime();
        }

    }
}
