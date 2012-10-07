/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodeburro;

import lib.Baralho;
import lib.Carta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Helison
 */
public class JogoDeBurroTest {

    private Baralho baralho = new Baralho();
    private Jogador jogador1 = new Jogador(baralho);
    private Jogador jogador2 = new Jogador(baralho);

    public JogoDeBurroTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.baralho = new Baralho();

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of verificaVencedor method, of class JogoDeBurro.
     */
    @Test
    public void testVerificaVencedor() {
        System.out.println("verificaVencedor");
        jogador1.setNome("Jog1");
        jogador2.setNome("jog2");
        JogoDeBurro instance = new JogoDeBurro(jogador1, jogador2, baralho);
        jogador1.comprarCarta(baralho);
        String expResult = "jog2";
        String result = instance.verificaVencedor(jogador1, jogador2);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mesmoNaipe method, of class JogoDeBurro.
     */
    @Test
    public void testMesmoNaipe() {
        System.out.println("mesmoNaipe");
        Carta carta1 = new Carta("PAUS", "A");
        Carta carta2 = new Carta("PAUS", "A");
        JogoDeBurro instance = new JogoDeBurro(jogador1, jogador2, baralho);
        boolean expResult = true;
        boolean result = instance.mesmoNaipe(carta1, carta2);
        assertEquals(expResult, result);
    }

    /**
     * Test of mesmoNaipe method, of class JogoDeBurro.
     */
    @Test
    public void testDiferenteNaipe() {
        System.out.println("mesmoNaipe");
        Carta carta1 = new Carta("COPAS", "A");
        Carta carta2 = new Carta("PAUS", "A");
        JogoDeBurro instance = new JogoDeBurro(jogador1, jogador2, baralho);
        boolean expResult = false;
        boolean result = instance.mesmoNaipe(carta1, carta2);
        assertEquals(expResult, result);
    }

    /**
     * Test of mesmoNumero method, of class JogoDeBurro.
     */
    @Test
    public void testMesmoNumero() {
        System.out.println("mesmoNumero");
        Carta carta1 = new Carta("COPAS", "J");
        Carta carta2 = new Carta("PAUS", "J");
        JogoDeBurro instance = new JogoDeBurro(jogador1, jogador2, baralho);
        boolean expResult = true;
        boolean result = instance.mesmoNumero(carta1, carta2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mesmoNumero method, of class JogoDeBurro.
     */
    @Test
    public void testDiferenteNumero() {
        System.out.println("mesmoNumero");
        Carta carta1 = new Carta("COPAS", "J");
        Carta carta2 = new Carta("PAUS", "Q");
        JogoDeBurro instance = new JogoDeBurro(jogador1, jogador2, baralho);
        boolean expResult = false;
        boolean result = instance.mesmoNumero(carta1, carta2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
