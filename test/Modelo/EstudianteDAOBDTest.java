/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hp
 */
public class EstudianteDAOBDTest {
    
    public EstudianteDAOBDTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of crearestudianteDAOBD method, of class EstudianteDAOBD.
     */
    @Test
    public void testCrearestudianteDAOBD() {
        System.out.println("crearestudianteDAOBD");
        Estudiante est = null;
        String table = "";
        EstudianteDAOBD instance = new EstudianteDAOBD();
        boolean expResult = false;
        boolean result = instance.crearestudianteDAOBD(est, table);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BuscarEstudianteDAOBD method, of class EstudianteDAOBD.
     */
    @Test
    public void testBuscarEstudianteDAOBD() {
        System.out.println("BuscarEstudianteDAOBD");
        Estudiante est = null;
        String table = "";
        EstudianteDAOBD instance = new EstudianteDAOBD();
        Estudiante expResult = null;
        Estudiante result = instance.BuscarEstudianteDAOBD(est, table);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ModificarEstudianteDAOBD method, of class EstudianteDAOBD.
     */
    @Test
    public void testModificarEstudianteDAOBD() {
        System.out.println("ModificarEstudianteDAOBD");
        Estudiante est = null;
        String table = "";
        EstudianteDAOBD instance = new EstudianteDAOBD();
        boolean expResult = false;
        boolean result = instance.ModificarEstudianteDAOBD(est, table);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarEstudianteDAOBD method, of class EstudianteDAOBD.
     */
    @Test
    public void testEliminarEstudianteDAOBD() {
        System.out.println("EliminarEstudianteDAOBD");
        Estudiante est = null;
        String table = "";
        EstudianteDAOBD instance = new EstudianteDAOBD();
        boolean expResult = false;
        boolean result = instance.EliminarEstudianteDAOBD(est, table);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LeeposEstudianteDAOBD method, of class EstudianteDAOBD.
     */
    @Test
    public void testLeeposEstudianteDAOBD() {
        System.out.println("LeeposEstudianteDAOBD");
        int pos = 0;
        String table = "";
        EstudianteDAOBD instance = new EstudianteDAOBD();
        Object[] expResult = null;
        Object[] result = instance.LeeposEstudianteDAOBD(pos, table);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desconectar method, of class EstudianteDAOBD.
     */
    @Test
    public void testDesconectar() {
        System.out.println("desconectar");
        EstudianteDAOBD instance = new EstudianteDAOBD();
        instance.desconectar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
