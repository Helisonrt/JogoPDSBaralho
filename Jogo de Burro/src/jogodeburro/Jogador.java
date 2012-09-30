/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodeburro;

import java.util.ArrayList;
import pds.Carta;
import pds.MonteDescarte;
import pds.Baralho;

/**
 *
 * @author Helison
 */
public class Jogador extends Baralho{

    private String nome;
    private int numCartasMao=0;
    private int numCartasCompradas;
    ArrayList<Carta> maoJogador = new ArrayList<>();
    Carta carta;
    

    public Jogador(Baralho baralho) {
        
        for (int i = 0; i <=3; i++) {
            carta = baralho.getPrimeiraCarta();
            maoJogador.add(carta);
        }
        numCartasCompradas = 0;
        numCartasMao = 4;
    }

    public void comprarCarta(Baralho baralho){
        numCartasCompradas++;
        numCartasMao++;
        maoJogador.add(baralho.getPrimeiraCarta());    
    }
    
    public boolean jogarCarta(Carta carta){
        numCartasMao--;
        try{
        return maoJogador.remove(carta);
        
        }
        catch(Exception e){
            System.out.println("Carta nao encontrada na mao do jogador");
        }
        return false;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumCartasMao() {
        return numCartasMao;
    }

    public void setNumCartasMao(int numCartasMao) {
        this.numCartasMao = numCartasMao;
    }

    public int getNumCartasCompradas() {
        return numCartasCompradas;
    }

    public void setNumCartasCompradas(int numCartasCompradas) {
        this.numCartasCompradas = numCartasCompradas;
    }

    
    
}
