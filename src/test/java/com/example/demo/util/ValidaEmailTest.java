package com.example.demo.util;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidaEmailTest {
    

    String emailValido = "phillip.mlk@gmail.com";
    String emailInvalido = "teste.cSom";
    String emailNull = null;

    @Test
    void caracterArroba(){
        assertTrue(ValidaEmail.validaCaracterArroba(emailValido), "tem @");
        assertFalse(ValidaEmail.validaCaracterArroba(emailInvalido), "o email invalido nao tem @");
        

    }

    @Test
    void caracterArrobaNull(){
        assertFalse(ValidaEmail.validaCaracterArroba(emailNull), "o email invalido n contem @");
    }
}
