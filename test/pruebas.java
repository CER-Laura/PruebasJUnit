
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;
import pruebasjunit.PruebasJUnit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


/**
 *
 * @author Laura
 */
public class pruebas {
    @Test
    public void testSumar(){
        int res = pruebasjunit.funciones.sumar(4, 6);
        int esp = 10;
        assertEquals(res, esp);
    }
    @Test
    public void testRestar(){
        int res = pruebasjunit.funciones.restar(4, 6);
        int esp = -2;
        assertEquals(res, esp);
        //fail("Vamos a fallar el test");
    }
    @Test
    public void testMultiplicar(){
        int res = pruebasjunit.funciones.multiplicar(4, 6);
        int esp = 24;
        assertEquals(res, esp);
    }
    /*@Test
    public void testDividir(){
        double res = pruebasjunit.funciones.dividir(6, 3);
        double esp = 2;
        assertEquals(res, esp);
    }*/
    @Test
    public void testDividirDec(){
        double res = pruebasjunit.funciones.dividir(439, 3);
        double esp = 146.333;
        assertEquals(res, esp, 0.001);
    }
    @Test 
    public void testPositivo(){
       boolean res = pruebasjunit.funciones.esPositivo(4); 
       assertTrue(res);
    }
    @Test 
    public void testMayor(){
       int res = pruebasjunit.funciones.mayor(3,4);
       int esp = 4;
       assertEquals(res,esp);
    }
    
}






/*  @Test
    public void testDividirDec(){
        double res = pruebasjunit.funciones.dividir(6, 4);
        double esp = 1.5;
        assertEquals(res, esp, 0.01);
    }*/