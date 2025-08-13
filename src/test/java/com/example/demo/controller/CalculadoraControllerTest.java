package com.example.demo.controller;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@DisplayName("teste de integração")
public class CalculadoraControllerTest {
    
    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("deve retornar soma correta via API")
    void deveRetornarSomaCorretoViaAPI() throws Exception {
        mockMvc.perform(get("/api/calculadora/somar")
                .param("a", "5") 
                .param("b", "6"))
                .andExpect(status().isOk())
                .andExpect(content().string("11"));
    }

    @Test
    @DisplayName("deve retornar subtracao correta via API")
    void deveRetornarSubtracaoCorretoViaAPI() throws Exception {
        mockMvc.perform(get("/api/calculadora/subtrair")
                .param("a", "10") 
                .param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("5"));
    }

    @Test
    @DisplayName("deve retornar multiplicacao correta via API")
    void deveRetornarMultiplicacaoCorretoViaAPI() throws Exception {
        mockMvc.perform(get("/api/calculadora/multiplicar")
                .param("a", "10") 
                .param("b", "10"))
                .andExpect(status().isOk())
                .andExpect(content().string("100.0"));
    }

    @Test
    @DisplayName("deve retornar divisao correta via API")
    void deveRetornarDivisaoCorretoViaAPI() throws Exception {
        mockMvc.perform(get("/api/calculadora/dividir")
                .param("a", "15") 
                .param("b", "3"))
                .andExpect(status().isOk())
                .andExpect(content().string("5.0"));
    }

    @Test
    @DisplayName("deve retornar ehPar correta via API")
    void deveRetornarEhParCorretoViaAPI() throws Exception {
        mockMvc.perform(get("/api/calculadora/testarEhPar/4"))
                .andExpect(status().isOk())
                .andExpect(content().string("true"));
    }
}
