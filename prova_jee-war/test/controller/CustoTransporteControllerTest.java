/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.CustoTransporte;
import java.util.Arrays;
import java.util.List;
import static java.util.Optional.empty;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Danilo
 */
public class CustoTransporteControllerTest {
    
    private CustoTransporteController c;
    
    public CustoTransporteControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c = new CustoTransporteController();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getC method, of class CustoTransporteController.
     */
    @Test
    public void testGetC() {
        
    }

    /**
     * Test of setC method, of class CustoTransporteController.
     */
    @Test
    public void testSetC() {
        
    }

    /**
     * Test of getV method, of class CustoTransporteController.
     */
    @Test
    public void testGetV() {
        
    }

    /**
     * Test of setV method, of class CustoTransporteController.
     */
    @Test
    public void testSetV() {
        
    }

    /**
     * Test of findAll method, of class CustoTransporteController.
     */
    @Test
    public void testFindAll() {
        System.out.println("Rodando Teste findAll");
        
        Double custo = 62.70;
        
        List<CustoTransporte> actual = Arrays.asList(
                new CustoTransporte(1, 100, 0, 2, 8, custo)
        );        
        List<CustoTransporte> expected = Arrays.asList(
                new CustoTransporte(1, 100, 0, 2, 8, custo)
        );
        
        //Test equals
        assertEquals(actual, expected);        
        assertThat(actual, is(expected));
        assertThat(actual, equalTo(100));
        
        //Test Not
        assertThat(actual, is(not("aaaa")));
        
        //Test List Size
        assertThat(actual.size(), is(2));
        
        //Test check empty list
        assertThat(actual, is(not(empty())));
    }

    /**
     * Test of add method, of class CustoTransporteController.
     */
    @Test
    public void testAdd() {
        
    }

    /**
     * Test of custoDistancia method, of class CustoTransporteController.
     */
    @Test
    public void testCustoDistancia() {
        System.out.println("Rodando Teste Custo Distancia");
                
        //Test equals
        assertEquals(54, c.custoDistancia(100, 0));
        assertEquals(55.60, c.custoDistancia(80, 20));
        
        assertThat(55.60, is(c.custoDistancia(80, 20)));
        
        //Test check empty list
        assertThat(54, is(not(empty())));
    }

    /**
     * Test of custoVeiculo method, of class CustoTransporteController.
     */
    @Test
    public void testCustoVeiculo() {
        System.out.println("Rodando Teste Custo Veiculo");
        
        double subCusto = 54;
        
        //Test equals
        assertEquals(56.70, c.custoVeiculo(2, subCusto));
        
        assertThat(56.70, is(c.custoVeiculo(2, subCusto)));
        
        //Test check empty list
        assertThat(56.70, is(not(empty())));
    }

    /**
     * Test of custoCarga method, of class CustoTransporteController.
     */
    @Test
    public void testCustoCarga() {
        System.out.println("Rodando Teste Custo Carga");
        
        double subCusto = 56.70;
        
        //Test equals
        assertEquals(62.70, c.custoCarga(8, 100, subCusto));
        
        assertThat(62.70, is(c.custoCarga(8, 100, subCusto)));
        
        //Test check empty list
        assertThat(62.70, is(not(empty())));
    }

    /**
     * Test of clearBean method, of class CustoTransporteController.
     */
    @Test
    public void testClearBean() {
        
    }

    /**
     * Test of delete method, of class CustoTransporteController.
     */
    @Test
    public void testDelete() {
        
    }
    
}