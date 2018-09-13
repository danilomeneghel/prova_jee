/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.CustoTransporte;
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
public class CustoTransporteControllerTest {
    
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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getC method, of class CustoTransporteController.
     */
    @Test
    public void testGetC() {
        System.out.println("getC");
        CustoTransporteController instance = new CustoTransporteController();
        CustoTransporte expResult = null;
        CustoTransporte result = instance.getC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setC method, of class CustoTransporteController.
     */
    @Test
    public void testSetC() {
        System.out.println("setC");
        CustoTransporte c = null;
        CustoTransporteController instance = new CustoTransporteController();
        instance.setC(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getV method, of class CustoTransporteController.
     */
    @Test
    public void testGetV() {
        System.out.println("getV");
        CustoTransporteController instance = new CustoTransporteController();
        Veiculo expResult = null;
        Veiculo result = instance.getV();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setV method, of class CustoTransporteController.
     */
    @Test
    public void testSetV() {
        System.out.println("setV");
        Veiculo v = null;
        CustoTransporteController instance = new CustoTransporteController();
        instance.setV(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class CustoTransporteController.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        CustoTransporteController instance = new CustoTransporteController();
        List<CustoTransporte> expResult = null;
        List<CustoTransporte> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class CustoTransporteController.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        CustoTransporteController instance = new CustoTransporteController();
        String expResult = "";
        String result = instance.add();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of custoDistancia method, of class CustoTransporteController.
     */
    @Test
    public void testCustoDistancia() {
        System.out.println("custoDistancia");
        int distanciaRodPav = 0;
        int distanciaRodNaoPav = 0;
        double subCusto = 0.0;
        CustoTransporteController instance = new CustoTransporteController();
        double expResult = 0.0;
        double result = instance.custoDistancia(distanciaRodPav, distanciaRodNaoPav, subCusto);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of custoVeiculo method, of class CustoTransporteController.
     */
    @Test
    public void testCustoVeiculo() {
        System.out.println("custoVeiculo");
        int veiculo = 0;
        double subCusto = 0.0;
        CustoTransporteController instance = new CustoTransporteController();
        double expResult = 0.0;
        double result = instance.custoVeiculo(veiculo, subCusto);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of custoCarga method, of class CustoTransporteController.
     */
    @Test
    public void testCustoCarga() {
        System.out.println("custoCarga");
        int carga = 0;
        int distanciaTotal = 0;
        double subCusto = 0.0;
        CustoTransporteController instance = new CustoTransporteController();
        double expResult = 0.0;
        double result = instance.custoCarga(carga, distanciaTotal, subCusto);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearBean method, of class CustoTransporteController.
     */
    @Test
    public void testClearBean() {
        System.out.println("clearBean");
        CustoTransporteController instance = new CustoTransporteController();
        instance.clearBean();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class CustoTransporteController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        CustoTransporte c = null;
        CustoTransporteController instance = new CustoTransporteController();
        instance.delete(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
