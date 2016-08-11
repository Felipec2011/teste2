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
public class CadastroFuncionarioTest {
    
    public CadastroFuncionarioTest() {
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
     * Test of getNome method, of class CadastroFuncionario.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        CadastroFuncionario instance = new CadastroFuncionario();
        String expResult = null;
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setNome method, of class CadastroFuncionario.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String Nome = "";
        CadastroFuncionario instance = new CadastroFuncionario();
        instance.setNome(Nome);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getCPF method, of class CadastroFuncionario.
     */
    @Test
    public void testGetCPF() {
        System.out.println("getCPF");
        CadastroFuncionario instance = new CadastroFuncionario();
        String expResult = null;
        String result = instance.getCPF();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setCPF method, of class CadastroFuncionario.
     */
    @Test
    public void testSetCPF() {
        System.out.println("setCPF");
        String CPF = "";
        CadastroFuncionario instance = new CadastroFuncionario();
        instance.setCPF(CPF);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getEndereco method, of class CadastroFuncionario.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        CadastroFuncionario instance = new CadastroFuncionario();
        String expResult = null;
        String result = instance.getEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setEndereco method, of class CadastroFuncionario.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        String Endereco = "";
        CadastroFuncionario instance = new CadastroFuncionario();
        instance.setEndereco(Endereco);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
