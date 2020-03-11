package br.com.wcc.Model;


/**
 * Placa
 */
public class Placa {
    private final int tamanho;
  private String[] componentes;
    

    public Placa(int tamanho, String[] componentes) {
        this.tamanho = tamanho;
        this.componentes = componentes;
    }

   
    public int getTamanho() {
        return tamanho;
    }

    public String[] getComponentes() {
        return componentes;
    }

    public void setComponentes(String[] componentes) {
        this.componentes = componentes;
    }

  
}