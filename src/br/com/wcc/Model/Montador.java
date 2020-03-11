package br.com.wcc.Model;

import java.util.Random;

/**
 * Montador
 */
public class Montador implements Produto {

    Random random = new Random();
    private int valorTamanho = random.nextInt(50);
    private String[] componentes;

    Placa placa = new Placa(valorTamanho, componentes);

    @Override
    public void montar() {
        ComponenteEnum[] valorEnum = ComponenteEnum.values();
        for(int i = 1; i < valorTamanho; i++){
            valorEnum[random.nextInt(valorEnum.length-1)];
           

        }
        
    }
    
}