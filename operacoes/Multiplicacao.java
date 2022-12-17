package operacoes;

import numeros.Resultado;

public class Multiplicacao {
    
    private double mNumero;

    public Multiplicacao(){
    }

    public Multiplicacao(double mNumero) {
        this.mNumero = mNumero;
    }

    public double getmNumero() {
        return mNumero;
    }

    public void setmNumero(double mNumero) {
        this.mNumero = mNumero;
    }
    
    public void multiplica(Resultado resultado){
        double resNumeros = resultado.getResultado() * mNumero;
        resultado.setResultado(resNumeros);
    }
}
