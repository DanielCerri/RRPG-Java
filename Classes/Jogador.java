package Classes;

import java.util.Random;

public class Jogador {

    Random r =  new Random();
    private Double poder;
    private String personagem;
    private Double vida;
    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public Double getPoder() {
        return poder;
    }

    public void setPoder(Double poder) {
        this.poder = poder;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }


    public void setFirstAtributos()
    {
        this.vida= 100.0;
        this.poder= r.nextDouble(10);
    }


    public void setPoderBatalha(Jogador player1, Jogador player2)
    {
        player1.setPoder(r.nextDouble(10));
        player2.setPoder(r.nextDouble(10));
    }

}
