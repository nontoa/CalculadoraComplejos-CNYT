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

    
    
    public void testSuma()
    {                        
        DecimalFormat round= new DecimalFormat("#.00");    
        App aplicacion= new App();                     
        aplicacion.cantidad=2;        
        aplicacion.reales.add("5");        
        aplicacion.reales.add("8");
        aplicacion.imaginarios.add("-6");
        aplicacion.imaginarios.add("9");
        ArrayList<Double> resp = aplicacion.suma();                         
        assertEquals("13,00",round.format(resp.get(0)));
        assertEquals("3,00",round.format(resp.get(1)));        
        
    }
    
    
    public void testResta()
    {                        
        DecimalFormat round= new DecimalFormat("#.00");    
        App aplicacion1= new App();                     
        aplicacion1.cantidad=2;        
        aplicacion1.reales.add("5");        
        aplicacion1.reales.add("8");
        aplicacion1.imaginarios.add("-6");
        //Aplicando el método resta
        aplicacion1.imaginarios.add("9");
        ArrayList<Double> resp1 = aplicacion1.resta();                         
        assertEquals("-3,00",round.format(resp1.get(0)));
        assertEquals("-15,00",round.format(resp1.get(1)));        
        
    }
    
    public void testMultiplicacion()
    {                        
        //Multiplicacion con los complejos
        DecimalFormat round= new DecimalFormat("#.00");    
        App aplicacion1= new App();                     
        aplicacion1.cantidad=2;        
        aplicacion1.reales.add("5");        
        aplicacion1.reales.add("8");
        aplicacion1.imaginarios.add("-6");
        aplicacion1.imaginarios.add("9");
        ArrayList<Double> resp1 = aplicacion1.resta();                         
        assertEquals("-3,00",round.format(resp1.get(0)));
        assertEquals("-15,00",round.format(resp1.get(1)));        
        
    }
    
    public void testDivision()
    {                        
        DecimalFormat round= new DecimalFormat("#.00");    
        App aplicacion1= new App();                     
        aplicacion1.cantidad=2;        
        aplicacion1.reales.add("5");        
        aplicacion1.reales.add("8");
        aplicacion1.imaginarios.add("-6");
        
        
        aplicacion1.imaginarios.add("9");
        ArrayList<Double> resp1 = aplicacion1.resta();                         
        assertEquals("-3,00",round.format(resp1.get(0)));
        assertEquals("-15,00",round.format(resp1.get(1)));        
        
    }
    
    public void testModulo()
    {                        
        DecimalFormat round= new DecimalFormat("#.00");    
        App aplicacion1= new App();                     
        aplicacion1.cantidad=2;        
        aplicacion1.reales.add("5");        
        aplicacion1.reales.add("8");
        aplicacion1.imaginarios.add("-6");
        aplicacion1.imaginarios.add("9");
        ArrayList<Double> resp1 = aplicacion1.resta();      
        
        
        assertEquals("-3,00",round.format(resp1.get(0)));
        assertEquals("-15,00",round.format(resp1.get(1)));        
        
    }
    
    public void testConjugado()
    {                        
        DecimalFormat round= new DecimalFormat("#.00");    
        App aplicacion1= new App();                     
        aplicacion1.cantidad=2;        
        aplicacion1.reales.add("5");        
        aplicacion1.reales.add("8");
        aplicacion1.imaginarios.add("-6");
        aplicacion1.imaginarios.add("9");
        ArrayList<Double> resp1 = aplicacion1.resta();                         
        assertEquals("-3,00",round.format(resp1.get(0)));
        assertEquals("-15,00",round.format(resp1.get(1)));        
        
    }
    
    public void testFase()
    {                        
        DecimalFormat round= new DecimalFormat("#.00");    
        App aplicacion1= new App();                     
        aplicacion1.cantidad=2;        
        aplicacion1.reales.add("5");        
        aplicacion1.reales.add("8");
        aplicacion1.imaginarios.add("-6");
        
        
        aplicacion1.imaginarios.add("9");
        ArrayList<Double> resp1 = aplicacion1.resta();                         
        assertEquals("-3,00",round.format(resp1.get(0)));
        assertEquals("-15,00",round.format(resp1.get(1)));        
        
    }
    
    public void testConversiones()
    {                        
        DecimalFormat round= new DecimalFormat("#.00");    
        App aplicacion1= new App();                     
        aplicacion1.cantidad=2;        
        aplicacion1.reales.add("5");        
        aplicacion1.reales.add("8");
        aplicacion1.imaginarios.add("-6");
        aplicacion1.imaginarios.add("9");
        ArrayList<Double> resp1 = aplicacion1.resta();                         
        assertEquals("-3,00",round.format(resp1.get(0)));
        assertEquals("-15,00",round.format(resp1.get(1)));        
        
    }
        
    
    

}
