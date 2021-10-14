/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Estudiante;
import java.awt.Image;
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
public class EstudianteJFrameTest {
    
    public EstudianteJFrameTest() {
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
     * Test of getIconImage method, of class EstudianteJFrame.
     */
    @Test
    public void testGetIconImage() {
        System.out.println("getIconImage");
        EstudianteJFrame instance = new EstudianteJFrame();
        Image expResult = null;
        Image result = instance.getIconImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recuperardatoscrearGUI method, of class EstudianteJFrame.
     */
    @Test
    public void testRecuperardatoscrearGUI() {
        System.out.println("recuperardatoscrearGUI");
        int i = 0;
        EstudianteJFrame instance = new EstudianteJFrame();
        Estudiante expResult = null;
        Estudiante result = instance.recuperardatoscrearGUI(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class EstudianteJFrame.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EstudianteJFrame.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
