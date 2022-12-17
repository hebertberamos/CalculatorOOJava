package operacoes;

import numeros.Resultado;

public class Subtracao {
    
    private double subNumero;

    public Subtracao(){
    }

    public Subtracao(double subNumero) {
        this.subNumero = subNumero;
    }

    public double getSubNumero() {
        return subNumero;
    }

    public void setSubNumero(double subNumero) {
        this.subNumero = subNumero;
    }
    
    public void subtrai(Resultado numero){
        double resNumeros = numero.getResultado() - subNumero;
        numero.setResultado(resNumeros);
    }
}
