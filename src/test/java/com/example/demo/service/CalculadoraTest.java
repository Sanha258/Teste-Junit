package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculadoraTest {

    @Autowired
    private Calculadora service;

    @Test
    void testeSoma() {
        double resultado = service.somar(2, 3);
        assertEquals(5.0, resultado);
    }

    @Test
    void testeDividir() {
        double resultado = service.dividir(3.0, 2.0);
        assertEquals(1.5, resultado);
    }
   
    @Test
    void testeSubtrair() {
        double resultado = service.subtrair(5, 2);
        assertEquals(3.0, resultado);
    }

    @Test
    void testeMultiplicar() {
        double resultado = service.multiplicar(3.0, 2.0);
        assertEquals(6.0, resultado);
    }

    @Test
    void testarEhPar() {
    Calculadora calc = new Calculadora();
    assertTrue(calc.ehPar(4)); // número par
    }
    
    @Test
    void testeDividirPorZero() {
        Exception exception = assertThrows(IllegalArgumentException.class,()-> {
            service.dividir(10.0, 0.0);
        });
        assertEquals("Divisão por zero não é permitida.", exception.getMessage());
    }

    @Test
    void  testarNull() {
        String valor = null;
        assertNull(valor, "O valor não deve ser nulo");
    }

    @Test
    void testarObjeto() {
        Calculadora c = new Calculadora();
        assertSame(c,c,  "deve ser a mesma instancia" );
        assertNotSame(c, service, "deve ser a mesma instancia" );
        
    }

    @Test
    void testarArray() {
        int[] esperado = {1,2,3};
        int[] atual = {1,2,3};
        assertArrayEquals(esperado, atual, "os arrays devem ser iguais" );
    }

    
}        
