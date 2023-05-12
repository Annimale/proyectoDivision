/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package proyecto_division;

import java.util.InputMismatchException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ivamar
 */
public class DivisionTest {
    
    public DivisionTest() {
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

    @Test
    public void testCalcularDivision() throws Exception {
        System.out.println("calcularDivision");
        float dividendo = 10.0F;
        float divisor = 5.0F;
        float expResult = 2.0F;
        float result = Division.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testDivisionPorCero() {
    System.out.println("calcularDivision");
    float dividendo = 10.0F;
    float divisor = 0.0F;
    try {
        float result = Division.calcularDivision(dividendo, divisor);
        fail("Excepción por división entre 0");
    } catch (Exception e) {
        assertEquals("Error. El divisor no puede ser 0.", e.getMessage());
    }
}
    public void testMissmatchException() throws InputMismatchException, Exception {
        System.out.println("calcularDivision");
        float dividendo = 5.0F;
        float divisor = 0.0F;
        float expResult = 0.0F;
        float result = Division.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
}
