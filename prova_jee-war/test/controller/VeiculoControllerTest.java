/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Veiculo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.Optional.empty;
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
public class VeiculoControllerTest {
    
    private VeiculoController v;
    
    public VeiculoControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        v = new VeiculoController();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getV method, of class VeiculoController.
     */
    @Test
    public void testGetV() {
        
    }

    /**
     * Test of setV method, of class VeiculoController.
     */
    @Test
    public void testSetV() {
        
    }

    /**
     * Test of getListaVeiculos method, of class VeiculoController.
     */
    @Test
    public void testGetListaVeiculos() {
        System.out.println("Rodando Teste getListaVeiculos");
        
        List<Veiculo> actual = new ArrayList<>();
        actual.add(new Veiculo(1, "Caminhão baú"));
        actual.add(new Veiculo(2, "Caminhão caçamba"));
        
        List<Veiculo> expected = new ArrayList<>();
        expected.add(new Veiculo(1, "Caminhão baú"));
        expected.add(new Veiculo(2, "Caminhão caçamba"));
        
        //Test equals
        assertEquals(actual, expected);        
        assertThat(actual, is(expected));
        
        //Test List Size
        assertThat(actual.size(), is(2));
        
        //Test check empty list
        assertThat(actual, is(not(empty())));
    }

    /**
     * Test of getVeiculo method, of class VeiculoController.
     */
    @Test
    public void testGetVeiculo() {
        System.out.println("Rodando Teste getVeiculo");
        
        Double custo = 1.0;
        
        Integer actual = 1;
        List<Veiculo> expected = Arrays.asList(
                new Veiculo(1, "Caminhão baú", BigDecimal.valueOf(custo))
        );
        
        //Test equals
        assertEquals(expected, v.getVeiculo(actual));        
        assertThat(expected, is(v.getVeiculo(actual)));
        
    }

    /**
     * Test of findAll method, of class VeiculoController.
     */
    @Test
    public void testFindAll() {
        System.out.println("Rodando Teste findAll");
        
        Double custo = 1.0;
        
        List<Veiculo> actual = Arrays.asList(
                new Veiculo(1, "Caminhão baú", BigDecimal.valueOf(custo)),
                new Veiculo(2, "Caminhão caçamba", BigDecimal.valueOf(custo)),
                new Veiculo(3, "Carreta", BigDecimal.valueOf(custo))
        );        
        List<Veiculo> expected = Arrays.asList(
                new Veiculo(1, "Caminhão baú", BigDecimal.valueOf(custo)),
                new Veiculo(2, "Caminhão caçamba", BigDecimal.valueOf(custo)),
                new Veiculo(3, "Carreta", BigDecimal.valueOf(custo))
        );
        
        //Test equals
        assertEquals(actual, expected);        
        assertThat(actual, is(expected));
        
        //Test Not
        assertThat(actual, is(not("aaaa")));
        
        //Test List Size
        assertThat(actual.size(), is(3));
        
        //Test check empty list
        assertThat(actual, is(not(empty())));
    }

    /**
     * Test of add method, of class VeiculoController.
     */
    @Test
    public void testAdd() {
        
    }

    /**
     * Test of clearBean method, of class VeiculoController.
     */
    @Test
    public void testClearBean() {
        
    }

    /**
     * Test of delete method, of class VeiculoController.
     */
    @Test
    public void testDelete() {
        
    }
    
}
