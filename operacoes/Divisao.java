package operacoes;

import numeros.Resultado;

public class Divisao {
    
    private double dNumero;

    public Divisao(){
    }

    public Divisao(double dNumero) {
        this.dNumero = dNumero;
    }

    public double getnDivisao() {
        return dNumero;
    }

    public void setnDivisao(double dNumero) {
        this.dNumero = dNumero;
    }
    
    public void divide(Resultado numero){
        double resNumeros = numero.getResultado() / dNumero;
        numero.setResultado(resNumeros);
    }
}
