import java.util.Scanner;

import numeros.Resultado;
import operacoes.Divisao;
import operacoes.Multiplicacao;
import operacoes.Soma;
import operacoes.Subtracao;

public class Calc {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    

        System.out.print("primeiro número: ");
        double n1 = sc.nextDouble();
        Resultado res = new Resultado(n1);
        System.out.print("informe a operação que deseja executar: ");
        char operacao = sc.next().charAt(0);
        do{
            switch(operacao){
                case '+':
                    System.out.print("numero: ");
                    double somN = sc.nextDouble();
                    Soma sNumero = new Soma(somN);
                    sNumero.soma(res);
                    System.out.println();
                    System.out.println("resultado: " + res.getResultado());
                break;
                
                case '-': 
                    System.out.print("número para subtrair: ");
                    double subN = sc.nextDouble();
                    Subtracao subNumero = new Subtracao(subN);
                    subNumero.subtrai(res);
                    System.out.println();
                    System.out.println("resultado: " + res.getResultado());
                break;

                case '*':
                    System.out.print("número para multiplicar: ");
                    double multN = sc.nextDouble();
                    Multiplicacao multNumero = new Multiplicacao(multN);
                    multNumero.multiplica(res);
                    System.out.println();
                    System.out.println("resultado: " + res.getResultado());
                break;

                case '/':
                    System.out.print("número para dividir: ");
                    double divN = sc.nextDouble();
                    Divisao divNumero = new Divisao(divN);
                    divNumero.divide(res);
                    System.out.println();
                    System.out.println("resultado: " + res.getResultado());
                break;
            }

            System.out.print("informe a operação: ");
            operacao = sc.next().charAt(0);
        }while(operacao == '+' || operacao == '-' || operacao == '*' || operacao == '/');

        sc.close();
    }
}
