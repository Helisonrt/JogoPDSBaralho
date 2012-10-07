package jogodeburro;

import java.util.ArrayList;
import pds.Carta;
import pds.MonteDescarte;
import pds.Baralho;

/**
 * Classe que representa um jogador com suas principais funcionalidades
 * 
 * @author Helison
 */
public class Jogador extends Baralho {

	private String nome;
	private int numCartasMao = 0;
	private int numCartasCompradas;
	ArrayList<Carta> maoJogador = new ArrayList<>();
	Carta carta;

	/**
	 * Construtor que inicia o jogador com suas 4 cartas na mão
	 */
	public Jogador(Baralho baralho) {

		for (int i = 0; i <= 3; i++) {
			carta = baralho.getPrimeiraCarta();
			maoJogador.add(carta);
		}
		this.setNumCartasCompradas(0);
		this.setNumCartasMao(4);
	}

	/**
	 * @param baralho
	 *            Metodo que compra uma carta do baralho e passa para a mão do
	 *            jogador.
	 * @return
	 */

	public boolean comprarCarta(Baralho baralho) {
		if (baralho.getBaralhoCompleto().size() > 0) {
			this.setNumCartasCompradas(getNumCartasCompradas() + 1);
			this.setNumCartasMao(getNumCartasMao() + 1);
			maoJogador.add(baralho.getPrimeiraCarta());
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @param carta
	 *            Metodo que remove uma carta da mão do jogador
	 * @return
	 */

	public boolean jogarCarta(Carta carta) {
		this.setNumCartasMao(getNumCartasMao() - 1);
		for (int i = 0; i < maoJogador.size(); i++) {
			if ((maoJogador.get(i).getNumero().equals(carta.getNumero()))
					&& (maoJogador.get(i).getnaipe().equals(carta.getnaipe()))) {
				maoJogador.remove(i);
				return true;
			}

		}
		return false;
	}

	/**
	 * Metodo que retorna o nome do jogaor
	 * 
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            Metodo que define o nome do jogador
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Metodo que retorna o numero de cartas na mao do jogador
	 * 
	 * @return
	 */
	public int getNumCartasMao() {
		return numCartasMao;
	}

	/**
	 * @param numCartasMao
	 *            Metodo que define o numero de cartas que o jogador tem na mão.
	 */
	public void setNumCartasMao(int numCartasMao) {
		this.numCartasMao = numCartasMao;
	}

	/**
	 * Metodo que retorna o numero de cartas compradas do jogador
	 * 
	 * @return
	 */
	public int getNumCartasCompradas() {
		return numCartasCompradas;
	}

	/**
	 * @param numCartasCompradas
	 *            Metodo que define o numero de cartas compradas do jogador
	 */
	public void setNumCartasCompradas(int numCartasCompradas) {
		this.numCartasCompradas = numCartasCompradas;
	}
}
