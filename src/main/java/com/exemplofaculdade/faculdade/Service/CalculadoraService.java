package com.exemplofaculdade.faculdade.Service;

import org.springframework.stereotype.Service;

import com.exemplofaculdade.faculdade.Entidade.Entrada;
import com.exemplofaculdade.faculdade.Entidade.Resultado;

@Service
public class CalculadoraService {
  public Resultado somar(Entrada entrada) {

    Resultado resultado = new Resultado();
    Integer soma = 0;

    if (entrada.getLista() != null) {
      for (int i = 0; i < entrada.getLista().size(); i++) {
        soma += entrada.getLista().get(i);
      }
    }
    resultado.setSoma(soma);
    double media = (soma / entrada.getLista().size());
    resultado.setMedia(media);

    return resultado;
  }

}
