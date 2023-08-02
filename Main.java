import Classes.Desenho;
import Classes.Jogador;
import Classes.Partida;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        Jogador player1 = new Jogador();
        Jogador player2 = new Jogador();
        Partida partida = new Partida();

        Desenho des = new Desenho();
        des.setDesenhosPersonagens();

        System.out.println("bem vindo ao RRPG!");
        System.out.println("\n Jogador 1 - Escolha seu personagem: ");
        player1.setPersonagem(String.valueOf( des.mostrarDesenhos()));

        System.out.println(" \n Jogador 2 - Escolha seu personagem: ");
        player2.setPersonagem(String.valueOf( des.mostrarDesenhos()));


        System.out.println("Gerando atributos.....");
        player1.setFirstAtributos();
        player2.setFirstAtributos();

        partida.pausa();
        partida.batalha(player1,player2);




    }
}