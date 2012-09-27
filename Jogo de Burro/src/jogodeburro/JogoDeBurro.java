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
    
    Baralho baralho = new Baralho();
    Jogador jogador1;
    Jogador jogador2;

    public JogoDeBurro(){
        baralho.embaralhar();
        jogador1 = new Jogador(baralho);
        jogador2 = new Jogador(baralho);
    }
    
    public void iniciarJogo(){
        
    }
}

