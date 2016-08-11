/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrofuncionarios;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2311134
 */
public class RegistroVendasTest {
    
    public RegistroVendasTest() {
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
     * Test of getNomeMercadoriaVendida method, of class RegistroVendas.
     */
    @Test
    public void testGetNomeMercadoriaVendida() {
        System.out.println("getNomeMercadoriaVendida");
        RegistroVendas instance = new RegistroVendas();
        String expResult = null;
        String result = instance.getNomeMercadoriaVendida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setNomeMercadoriaVendida method, of class RegistroVendas.
     */
    @Test
    public void testSetNomeMercadoriaVendida() {
        System.out.println("setNomeMercadoriaVendida");
        String NomeMercadoriaVendida = "";
        RegistroVendas instance = new RegistroVendas();
        instance.setNomeMercadoriaVendida(NomeMercadoriaVendida);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getCodMercadoriaVendida method, of class RegistroVendas.
     */
    @Test
    public void testGetCodMercadoriaVendida() {
        System.out.println("getCodMercadoriaVendida");
        RegistroVendas instance = new RegistroVendas();
        String expResult = null;
        String result = instance.getCodMercadoriaVendida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setCodMercadoriaVendida method, of class RegistroVendas.
     */
    @Test
    public void testSetCodMercadoriaVendida() {
        System.out.println("setCodMercadoriaVendida");
        String CodMercadoriaVendida = null;
        RegistroVendas instance = new RegistroVendas();
        instance.setCodMercadoriaVendida(CodMercadoriaVendida);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getPrecoMercadoriaVendida method, of class RegistroVendas.
     */
    @Test
    public void testGetPrecoMercadoriaVendida() {
        System.out.println("getPrecoMercadoriaVendida");
        RegistroVendas instance = new RegistroVendas();
        float expResult = 0.0F;
        float result = instance.getPrecoMercadoriaVendida();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPrecoMercadoriaVendida method, of class RegistroVendas.
     */
    @Test
    public void testSetPrecoMercadoriaVendida() {
        System.out.println("setPrecoMercadoriaVendida");
        float PrecoMercadoriaVendida = 0.0F;
        RegistroVendas instance = new RegistroVendas();
        instance.setPrecoMercadoriaVendida(PrecoMercadoriaVendida);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
