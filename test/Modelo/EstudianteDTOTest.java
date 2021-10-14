/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class EstudianteDTOTest {
    
    public EstudianteDTOTest() {
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
     * Test of CrearEstudianteDTO method, of class EstudianteDTO.
     */
    @Test
    public void testCrearEstudianteDTO() {
        System.out.println("CrearEstudianteDTO");
        String nom = "";
        String ape = "";
        String nac = "";
        String coi = "";
        String cop = "";
        long cel = 0L;
        long tel = 0L;
        String prog = "";
        EstudianteDTO instance = new EstudianteDTO();
        Estudiante expResult = null;
        Estudiante result = instance.CrearEstudianteDTO(nom, ape, nac, coi, cop, cel, tel, prog);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BuscarEstudianteDTO method, of class EstudianteDTO.
     */
    @Test
    public void testBuscarEstudianteDTO() {
        System.out.println("BuscarEstudianteDTO");
        String coi = "";
        EstudianteDTO instance = new EstudianteDTO();
        Estudiante expResult = null;
        Estudiante result = instance.BuscarEstudianteDTO(coi);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ModificarEstudianteDTO method, of class EstudianteDTO.
     */
    @Test
    public void testModificarEstudianteDTO() {
        System.out.println("ModificarEstudianteDTO");
        String coi = "";
        String cop = "";
        long cel = 0L;
        long tel = 0L;
        String prog = "";
        EstudianteDTO instance = new EstudianteDTO();
        Estudiante expResult = null;
        Estudiante result = instance.ModificarEstudianteDTO(coi, cop, cel, tel, prog);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarEstudianteDTO method, of class EstudianteDTO.
     */
    @Test
    public void testEliminarEstudianteDTO() {
        System.out.println("EliminarEstudianteDTO");
        String coi = "";
        EstudianteDTO instance = new EstudianteDTO();
        Estudiante expResult = null;
        Estudiante result = instance.EliminarEstudianteDTO(coi);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
