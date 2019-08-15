package edu.escuelaing.cnyt.app;

import java.util.ArrayList;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import edu.escuelaing.cnyt.app.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /*
    public void PruebaSuma()
    {        
        App aplicacion= new App();
        Boolean flag=false;
        double[] respuestaEsperada= new double[] {};
        aplicacion.reales.add("5");
        aplicacion.reales.add("8");
        aplicacion.imaginarios.add("-6");
        aplicacion.imaginarios.add("9");
        respuestaEsperada=aplicacion.suma();
        assertEquals(-1, respuestaEsperada[0]);
        assertEquals(17, respuestaEsperada[1]);
        
    }*/
        
    /**
     * Rigourous Test :-)
     */
    public void PruebaDivision()
    {        
        assertTrue( true );
    }

}
