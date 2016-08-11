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
public class CadastroClienteTest {
    
    public CadastroClienteTest() {
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
     * Test of getNome method, of class CadastroCliente.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        CadastroCliente instance = new CadastroCliente();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setNome method, of class CadastroCliente.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String Nome = "";
        CadastroCliente instance = new CadastroCliente();
        instance.setNome(Nome);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getCPF method, of class CadastroCliente.
     */
    @Test
    public void testGetCPF() {
        System.out.println("getCPF");
        CadastroCliente instance = new CadastroCliente("123");
        String expResult = "";
        String result = instance.getCPF();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setCPF method, of class CadastroCliente.
     */
    @Test
    public void testSetCPF() {
        System.out.println("setCPF");
        String CPF = "";
        CadastroCliente instance = new CadastroCliente();
        instance.setCPF(CPF);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getEndereco method, of class CadastroCliente.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        CadastroCliente instance = new CadastroCliente();
        String expResult = "";
        String result = instance.getEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setEndereco method, of class CadastroCliente.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        String Endereco = "";
        CadastroCliente instance = new CadastroCliente();
        instance.setEndereco(Endereco);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
