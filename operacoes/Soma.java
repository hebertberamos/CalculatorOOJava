package operacoes;

import numeros.Resultado;

public class Soma{

    private double sNumero;

    public Soma(){
    }

    public Soma(double sNumero) {
        this.sNumero = sNumero;
    }

    public double getSNumero() {
        return sNumero;
    }

    public void setsNumero(double sNumero) {
        this.sNumero = sNumero;
    }
    
    public void soma(Resultado resultado){
        double resNumeros = resultado.getResultado() + sNumero ;
        resultado.setResultado(resNumeros);
    }
}
