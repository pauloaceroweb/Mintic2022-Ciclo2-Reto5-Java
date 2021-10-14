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
public class EstudianteTest {
    
    public EstudianteTest() {
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
     * Test of setNombres method, of class Estudiante.
     */
    @Test
    public void testSetNombres() {
        System.out.println("setNombres");
        String nom = "";
        Estudiante instance = new Estudiante();
        instance.setNombres(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellidos method, of class Estudiante.
     */
    @Test
    public void testSetApellidos() {
        System.out.println("setApellidos");
        String ape = "";
        Estudiante instance = new Estudiante();
        instance.setApellidos(ape);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNacimiento method, of class Estudiante.
     */
    @Test
    public void testSetNacimiento() {
        System.out.println("setNacimiento");
        String nac = "";
        Estudiante instance = new Estudiante();
        instance.setNacimiento(nac);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCorreoInst method, of class Estudiante.
     */
    @Test
    public void testSetCorreoInst() {
        System.out.println("setCorreoInst");
        String coi = "";
        Estudiante instance = new Estudiante();
        instance.setCorreoInst(coi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCorreoPers method, of class Estudiante.
     */
    @Test
    public void testSetCorreoPers() {
        System.out.println("setCorreoPers");
        String cop = "";
        Estudiante instance = new Estudiante();
        instance.setCorreoPers(cop);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCelular method, of class Estudiante.
     */
    @Test
    public void testSetCelular() {
        System.out.println("setCelular");
        long cel = 0L;
        Estudiante instance = new Estudiante();
        instance.setCelular(cel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFijo method, of class Estudiante.
     */
    @Test
    public void testSetFijo() {
        System.out.println("setFijo");
        long tel = 0L;
        Estudiante instance = new Estudiante();
        instance.setFijo(tel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrograma method, of class Estudiante.
     */
    @Test
    public void testSetPrograma() {
        System.out.println("setPrograma");
        String prog = "";
        Estudiante instance = new Estudiante();
        instance.setPrograma(prog);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombres method, of class Estudiante.
     */
    @Test
    public void testGetNombres() {
        System.out.println("getNombres");
        Estudiante instance = new Estudiante();
        String expResult = "";
        String result = instance.getNombres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellidos method, of class Estudiante.
     */
    @Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        Estudiante instance = new Estudiante();
        String expResult = "";
        String result = instance.getApellidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNacimiento method, of class Estudiante.
     */
    @Test
    public void testGetNacimiento() {
        System.out.println("getNacimiento");
        Estudiante instance = new Estudiante();
        String expResult = "";
        String result = instance.getNacimiento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCorreoInst method, of class Estudiante.
     */
    @Test
    public void testGetCorreoInst() {
        System.out.println("getCorreoInst");
        Estudiante instance = new Estudiante();
        String expResult = "";
        String result = instance.getCorreoInst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCorreoPers method, of class Estudiante.
     */
    @Test
    public void testGetCorreoPers() {
        System.out.println("getCorreoPers");
        Estudiante instance = new Estudiante();
        String expResult = "";
        String result = instance.getCorreoPers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCelular method, of class Estudiante.
     */
    @Test
    public void testGetCelular() {
        System.out.println("getCelular");
        Estudiante instance = new Estudiante();
        long expResult = 0L;
        long result = instance.getCelular();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFijo method, of class Estudiante.
     */
    @Test
    public void testGetFijo() {
        System.out.println("getFijo");
        Estudiante instance = new Estudiante();
        long expResult = 0L;
        long result = instance.getFijo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrograma method, of class Estudiante.
     */
    @Test
    public void testGetPrograma() {
        System.out.println("getPrograma");
        Estudiante instance = new Estudiante();
        String expResult = "";
        String result = instance.getPrograma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Estudiante.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Estudiante instance = new Estudiante();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
