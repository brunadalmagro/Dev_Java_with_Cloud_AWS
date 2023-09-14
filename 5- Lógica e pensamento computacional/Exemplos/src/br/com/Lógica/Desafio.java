package br.com.Lógica;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitoDeEntradas = new Scanner(System.in);
        float valorSalario = leitoDeEntradas.nextFloat();
        float valorBeneficios = leitoDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = 0.05f * valorSalario;
        }
        else if (valorSalario >= 1100 && valorSalario <= 2500) {
            valorImposto = 0.10f * valorSalario;
        }
        else {
            valorImposto = 0.15f * valorSalario;
        }
        // TODO Criar as demais condições para as alíquotas de 10.00% e 15.00%.

        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.printf("%.2f%n", saida);
    }
}
