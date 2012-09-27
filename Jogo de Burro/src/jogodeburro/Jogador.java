/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodeburro;
import pds.Carta;

/**
 *
 * @author Helison
 */
public class Jogador {
    
    private String nome;
    private int numCartasMao;
    private int numCartasCompradas;
    MaoJogador mao = new MaoJogador();
    Carta carta;
   
    public Jogador(Baralho baralho){
        for (int i =0; i<3;i++){
        carta = baralho.getPrimeiraCarta();
        mao.moverParaMonteDeDescarte(carta);
        }
        numCartasCompradas =0;
        numCartasMao=3;
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
    
       public boolean mesmoNaipe(Carta carta) {
        if (mao.estaNoMonteDescarte(carta.getnaipe(),carta.getNumero())){
            return true;
        }
           return false;
    }

    public boolean mesmoNumero(Carta carta) {
        if (mao.estaNoMonteDescarte(carta.getnaipe(),carta.getNumero())){
        return true;
    }return false;
    }
 
}
