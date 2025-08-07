package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
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
        double resultado = service.subtrair(5.0, 2.0);
        assertEquals(3.0, resultado);
    }

    @Test
    void testeMultiplicar() {
        double resultado = service.multiplicar(3.0, 2.0);
        assertEquals(6.0, resultado);
    }

    @Test
    void testarEhPar () {
        assertFalse(service.ehPar(5));
        assertTrue(service.ehPar(3));
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
}        
