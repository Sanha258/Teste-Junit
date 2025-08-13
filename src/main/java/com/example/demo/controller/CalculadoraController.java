package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Calculadora;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

@RequestMapping("api/calculadora")
public class CalculadoraController {

  @Autowired
  private Calculadora calculadora;

  @GetMapping("/somar")
  public int somar(@RequestParam int a, @RequestParam int b) {
      return calculadora.somar(a,  b);
  }
  
  @GetMapping("/subtrair")
  public int subtrair(@RequestParam int a, @RequestParam int b) {
      return calculadora.subtrair(a, b);
  }

  @GetMapping("/multiplicar")
  public double multiplicar(@RequestParam int a, @RequestParam int b) {
      return calculadora.multiplicar(a, b);
  }

  @GetMapping("/dividir")
  public double dividir(@RequestParam int a, @RequestParam int b) {
      return calculadora.dividir(a, b);
  }

  @GetMapping("/testarEhPar/{numero}")
  public boolean ehPar(@PathVariable int numero) {
      return calculadora.ehPar(numero);
  }
  
  
  


}
