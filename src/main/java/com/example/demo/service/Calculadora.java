package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class Calculadora {
   
     public int somar(int a, int b) {
        return a + b;
    }

    public double dividir(double a, double b) {
    if (b == 0) {
        throw new IllegalArgumentException("Divisão por zero não é permitida.");
    }
    return a / b;
    }


    public int subtrair(int a, int b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

}
