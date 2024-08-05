package com.exemplofaculdade.faculdade.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplofaculdade.faculdade.Entidade.Entrada;
import com.exemplofaculdade.faculdade.Entidade.Resultado;
import com.exemplofaculdade.faculdade.Service.CalculadoraService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/calculos")
public class CalculadoraController {

  @Autowired
  private CalculadoraService calculoService;

  @GetMapping("/somar")
  public ResponseEntity<Resultado> somar(@RequestBody Entrada entrada) {
    try {
      Resultado resultado = this.calculoService.somar(entrada);
      return new ResponseEntity<>(resultado, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }

  }

}
