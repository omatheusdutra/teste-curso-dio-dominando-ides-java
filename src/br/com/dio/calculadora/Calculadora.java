package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Digite o primeiro valor: ");
        int a = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        int b = scan.nextInt();

        
        double soma = soma(a, b);
        double subtracao = subtracao(a, b);
        double multiplicacao = multiplicacao(a, b);
        double divisao = divisao(a, b);

        
        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtração: " + subtracao);
        System.out.println("Resultado da multiplicação: " + multiplicacao);
        System.out.println("Resultado da divisão: " + divisao);
    }

    
    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtracao(int a, int b) {
        return a - b;
    }

    public static double divisao(int a, int b) {
        return (double) a / b;
    }

    public static int multiplicacao(int a, int b) {
        return a * b;
    }
}
