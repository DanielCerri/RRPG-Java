package Classes;

import java.util.concurrent.TimeUnit;

public class Partida {
    Desenho des = new Desenho();
    Jogador j = new Jogador();

    public void batalha(Jogador player1,Jogador player2)
    {

        while(player1.getVida()>0 && player2.getVida()>0 ){
            //Player 1
            player1.setVida(player1.getVida()- player2.getPoder());
            //Player 2
            player2.setVida(player2.getVida()- player1.getPoder());

            des.getDesenhosPersonagens(player1.getPersonagem(),player1.getVida(),player1.getPoder());
            des.getDesenhosPersonagens(player2.getPersonagem(),player2.getVida(),player2.getPoder());
            pausa();
            j.setPoderBatalha(player1,player2);
        }

        System.out.println("RESULTADO:  ");
        System.out.println("VIDA PLAYER 1:  " + player1.getVida());
        System.out.println("VIDA PLAYER 2:  " + player2.getVida());

        if (player1.getVida() >  player2.getVida())
        {
            System.out.println("PLAYER 1 VENCEU !");
        }else {
            System.out.println("PLAYER 2 VENCEU !");
        }


    }

    public void pausa(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
