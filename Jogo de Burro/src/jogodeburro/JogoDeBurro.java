/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodeburro;

import pds.*;

/**
 *
 * @author Helison
 */
public class JogoDeBurro {
    
//    Baralho baralho = new Baralho();

    public JogoDeBurro(Jogador jogador1, Jogador jogador2, Baralho baralho){
        baralho.embaralhar();
        
        
        jogador1 = new Jogador(baralho);
        jogador2 = new Jogador(baralho);
    }
    
    public String verificaVencedor(Jogador jogador1, Jogador jogador2){
        if (jogador1.getNumCartasCompradas()==jogador2.getNumCartasCompradas()){
            return"EMPATE";
        }
        else if(jogador1.getNumCartasCompradas()>jogador2.getNumCartasCompradas()){
            return jogador2.getNome();
        }
        else if(jogador1.getNumCartasCompradas()<jogador2.getNumCartasCompradas()){
            return jogador1.getNome();
        }
        else{
            return"DEU PAU VEIH!!!!";
        }
        
    }
        public boolean mesmoNaipe(Carta carta1, Carta carta2) {
        if (carta1.getnaipe().equals(carta2.getnaipe())) {
            return true;
        }
        return false;
    }

    public boolean mesmoNumero(Carta carta1, Carta carta2) {
        if (carta1.getNumero().equals(carta2.getNumero())) {
            return true;
        }
        return false;
    }

    public void iniciarJogo(){
        
    }
    
}

