/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodeburro;

import java.util.ArrayList;

/**
 *
 * @author Helison
 */
public class Baralho extends pds.Baralho{
    ArrayList<pds.Carta> baralhoCompleto = new ArrayList<>();
    
    public ArrayList get3Cartas(){
        baralhoCompleto.add(this.getPrimeiraCarta());
        baralhoCompleto.add(this.getPrimeiraCarta());
        baralhoCompleto.add(this.getPrimeiraCarta());
        return baralhoCompleto;
    }
}
