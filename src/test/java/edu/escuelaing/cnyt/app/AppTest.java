package edu.escuelaing.cnyt.app;

import java.util.ArrayList;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import edu.escuelaing.cnyt.app.*;
import java.text.DecimalFormat;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    
    public DecimalFormat round = new DecimalFormat("#.00");

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testSuma() {        
        App.inicializar();
        App.cantidad = 2;
        App.reales.add("5");
        App.reales.add("8");
        App.imaginarios.add("-6");
        App.imaginarios.add("9");
        ArrayList<Double> resp = App.suma();
        assertEquals("13,00", round.format(resp.get(0)));
        assertEquals("3,00", round.format(resp.get(1)));

    }

    public void testResta() {        
        App.inicializar();
        App.cantidad = 2;
        App.reales.add("5");
        App.reales.add("8");
        App.imaginarios.add("-6");
        App.imaginarios.add("9");
        ArrayList<Double> resp1 = App.resta();
        assertEquals("-3,00", round.format(resp1.get(0)));
        assertEquals("-15,00", round.format(resp1.get(1)));

    }

    public void testMultiplicacion() {        
        App.inicializar();
        App.cantidad = 2;
        Complejo resp = App.multiplicacion(new Complejo(48, -89), new Complejo(14, 8));
        assertEquals("1384,00", round.format(resp.getReal()));
        assertEquals("-862,00", round.format(resp.getImag()));

    }

    public void testDivision() {        
        App.inicializar();
        App.cantidad = 2;
        Complejo resp = App.division(new Complejo(-78.36,25.14), new Complejo(36.25,-56.36));
        assertEquals("-,95", round.format(resp.getReal()));
        assertEquals("-,78", round.format(resp.getImag()));
    }
    
    public void testModulo() {        
        App.inicializar();
        App.cantidad = 1;
        App.reales.add("89");
        App.imaginarios.add("-25");
        Double resp = App.modulo();
        assertEquals("92,44", round.format(resp));        
    }
    
    public void testConjugado(){
        App.inicializar();
        App.cantidad = 1;
        App.reales.add("123");
        App.imaginarios.add("-255");
        Complejo resp = App.conjugado();        
        assertEquals("123,00", round.format(resp.getReal()));
        assertEquals("255,00", round.format(resp.getImag()));
    }
    
    public void testConversion(){
        App.inicializar();
        App.cantidad = 1;
        App.reales.add("785.23");
        App.imaginarios.add("74.15");
        Complejo resp = App.conjugado();        
        assertEquals("785,23", round.format(resp.getReal()));
        assertEquals("-74,15", round.format(resp.getImag()));
    }
    
    public void testFase(){
        App.inicializar();
        App.cantidad = 1;
        App.reales.add("189");
        App.imaginarios.add("-789.5");
        Double resp = App.fase();        
        assertEquals("1,34", round.format(resp));        
    }
}
