/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodeburro;

import lib.*;

/**
 *
 * @author Helison
 */
public class JogoDeBurro {
    
//    Baralho baralho = new Baralho();

	/**
	 * Construtor do JogoDeBurro que incia o jogo com os dois jogadores e o baralho
	 * @param jogador1
	 * @param jogador2
	 * @param baralho
	 */
    public JogoDeBurro(Jogador jogador1, Jogador jogador2, Baralho baralho){
        baralho.embaralhar();
        
        
        jogador1 = new Jogador(baralho);
        jogador2 = new Jogador(baralho);
    }
    /**
     * Metodo que verificar o vencedor retornando seu nome
     * @param jogador1
     * @param jogador2
     * @return
     */
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
    /**
     * Metodo que verifica se as duas cartas passadas como parâmetro possuem o mesmo naipe
     * @param carta1
     * @param carta2
     * @return
     */
    public boolean mesmoNaipe(Carta carta1, Carta carta2) {
        if (carta1.getnaipe().equals(carta2.getnaipe())) {
            return true;
        }
        return false;
    }
    /**
     * Metodo que verifica se as duas cartas passadas como parâmetro possuem o mesmo numero
     * @param carta1
     * @param carta2
     * @return
     */
    public boolean mesmoNumero(Carta carta1, Carta carta2) {
        if (carta1.getNumero().equals(carta2.getNumero())) {
            return true;
        }
        return false;
    }
    
}

