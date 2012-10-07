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
public class JogadorTest {

    Baralho baralho = new Baralho();
    Jogador jogador1 = new Jogador(baralho);
    Jogador jogador2 = new Jogador(baralho);

    public JogadorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of comprarCarta method, of class Jogador.
     */
    @Test
    public void testComprarCartaBaralhoVazio() {
        System.out.println("comprarCarta");
        baralho.getBaralhoCompleto().clear();
        System.out.println(baralho.getBaralhoCompleto().size());
        Jogador instance = jogador1;
        boolean expResult = false;
        boolean result = instance.comprarCarta(baralho);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of comprarCarta method, of class Jogador.
     */
    @Test
    public void testComprarCarta() {
        System.out.println("comprarCarta");
        boolean expResult = true;
        Jogador instance = jogador1;
        boolean result = instance.comprarCarta(baralho);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of jogarCarta method, of class Jogador.
     */
    @Test
    public void testJogarCarta() {
        System.out.println("jogarCarta");
        Jogador instance = jogador1;
        instance.comprarCarta(baralho);
        Carta carta = instance.getPrimeiraCarta();
        boolean expResult = true;
        boolean result = instance.jogarCarta(carta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Jogador.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Jogador instance = jogador1;
        instance.setNome("Pedro");
        String expResult = "Pedro";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Jogador.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Pedro";
        Jogador instance = jogador1;
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumCartasMao method, of class Jogador.
     */
    @Test
    public void testGetNumCartasMao() {
        System.out.println("getNumCartasMao");
        Jogador instance = jogador1;
        int expResult = 4;
        int result = instance.getNumCartasMao();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumCartasMao method, of class Jogador.
     */
    @Test
    public void testGetNumCartasMaoComprarUma() {
        System.out.println("getNumCartasMao");
        Jogador instance = jogador1;
        instance.comprarCarta(baralho);
        int expResult = 5;
        int result = instance.getNumCartasMao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumCartasMao method, of class Jogador.
     */
    @Test
    public void testSetNumCartasMao() {
        System.out.println("setNumCartasMao");
        int numCartasMao = 4;
        Jogador instance = jogador1;
        instance.setNumCartasMao(numCartasMao);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumCartasCompradas method, of class Jogador.
     */
    @Test
    public void testGetNumCartasCompradas() {
        System.out.println("getNumCartasCompradas");
        Jogador instance = jogador1;
        instance.comprarCarta(baralho);
        int expResult = 1;
        int result = instance.getNumCartasCompradas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumCartasCompradas method, of class Jogador.
     */
    @Test
    public void testSetNumCartasCompradas() {
        System.out.println("setNumCartasCompradas");
        int numCartasCompradas = 4;
        Jogador instance = jogador1;
        instance.setNumCartasCompradas(numCartasCompradas);
    }
}
