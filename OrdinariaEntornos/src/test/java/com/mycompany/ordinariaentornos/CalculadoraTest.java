/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ordinariaentornos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author daw123 Autor del programa
 * @version 12.0 Version del proyecto
 * @since 2022 El año en el que se crea el proyecto
 * 
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of getSuma method, of class Calculadora.
     *
     */
    
    @Test
    
    public void testadd() {
        System.out.println("add");
        double a = 1.0;
        double b = 1.0;
        Calculadora instance = new Calculadora();
        double expResult = 2.0;
        double result = instance.add(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    /**
     * 
     */
    @org.junit.jupiter.api.Test
    /**
     * @see addsTwoNumbers es el metodo en el que se requiere los dos numeros, primero y segundo
     */
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		Calculadora calculator = new Calculadora();
		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}
    /**
     * @serialData add Es el campo donde seleccionamos los siguientes parametros
     * @param primero es el primer numero de la calculadora
     * @param segundo es el segundo numero de la calculadora
     * @param expectedResult es el resultado esperado de la operación
     * @return nos devuelve que el primero numero mas el segundo nos da como resultado el resultado esperado
     */
    @ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1,    3,   4",
			"20,  30, 50",
			"2,  100, 102"
	})
	void add(int primero, int segundo, int expectedResult) {
		Calculadora calculator = new Calculadora();
		assertEquals(expectedResult, calculator.add(primero, segundo),
				() ->primero + " + " + segundo + " es igual a " + expectedResult);
	}
    
}
