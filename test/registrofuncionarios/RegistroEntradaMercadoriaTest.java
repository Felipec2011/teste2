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
public class RegistroEntradaMercadoriaTest {
    
    public RegistroEntradaMercadoriaTest() {
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
     * Test of getNomeMercadoria method, of class RegistroEntradaMercadoria.
     */
    @Test
    public void testGetNomeMercadoria() {
        System.out.println("getNomeMercadoria");
        RegistroEntradaMercadoria instance = new RegistroEntradaMercadoria();
        String expResult = null;
        String result = instance.getNomeMercadoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setNomeMercadoria method, of class RegistroEntradaMercadoria.
     */
    @Test
    public void testSetNomeMercadoria() {
        System.out.println("setNomeMercadoria");
        String NomeMercadoria = "";
        RegistroEntradaMercadoria instance = new RegistroEntradaMercadoria();
        instance.setNomeMercadoria(NomeMercadoria);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getCodMercadoria method, of class RegistroEntradaMercadoria.
     */
    @Test
    public void testGetCodMercadoria() {
        System.out.println("getCodMercadoria");
        RegistroEntradaMercadoria instance = new RegistroEntradaMercadoria();
        String expResult = null;
        String result = instance.getCodMercadoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setCodMercadoria method, of class RegistroEntradaMercadoria.
     */
    @Test
    public void testSetCodMercadoria() {
        System.out.println("setCodMercadoria");
        String CodMercadoria = "";
        RegistroEntradaMercadoria instance = new RegistroEntradaMercadoria();
        instance.setCodMercadoria(CodMercadoria);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getPrecoMercadoria method, of class RegistroEntradaMercadoria.
     */
    @Test
    public void testGetPrecoMercadoria() {
        System.out.println("getPrecoMercadoria");
        RegistroEntradaMercadoria instance = new RegistroEntradaMercadoria();
        float expResult = 0.0F;
        float result = instance.getPrecoMercadoria();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setPrecoMercadoria method, of class RegistroEntradaMercadoria.
     */
    @Test
    public void testSetPrecoMercadoria() {
        System.out.println("setPrecoMercadoria");
        float PrecoMercadoria = 0.0F;
        RegistroEntradaMercadoria instance = new RegistroEntradaMercadoria();
        instance.setPrecoMercadoria(PrecoMercadoria);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
