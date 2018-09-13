/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Veiculo;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danil
 */
public class VeiculoControllerTest {
    
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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getV method, of class VeiculoController.
     */
    @Test
    public void testGetV() {
        System.out.println("getV");
        VeiculoController instance = new VeiculoController();
        Veiculo expResult = null;
        Veiculo result = instance.getV();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setV method, of class VeiculoController.
     */
    @Test
    public void testSetV() {
        System.out.println("setV");
        Veiculo v = null;
        VeiculoController instance = new VeiculoController();
        instance.setV(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaVeiculos method, of class VeiculoController.
     */
    @Test
    public void testGetListaVeiculos() {
        System.out.println("getListaVeiculos");
        VeiculoController instance = new VeiculoController();
        List<Veiculo> expResult = null;
        List<Veiculo> result = instance.getListaVeiculos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVeiculo method, of class VeiculoController.
     */
    @Test
    public void testGetVeiculo() {
        System.out.println("getVeiculo");
        int id = 0;
        VeiculoController instance = new VeiculoController();
        String expResult = "";
        String result = instance.getVeiculo(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class VeiculoController.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        VeiculoController instance = new VeiculoController();
        List<Veiculo> expResult = null;
        List<Veiculo> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class VeiculoController.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        VeiculoController instance = new VeiculoController();
        String expResult = "";
        String result = instance.add();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearBean method, of class VeiculoController.
     */
    @Test
    public void testClearBean() {
        System.out.println("clearBean");
        VeiculoController instance = new VeiculoController();
        instance.clearBean();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class VeiculoController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Veiculo v = null;
        VeiculoController instance = new VeiculoController();
        instance.delete(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
