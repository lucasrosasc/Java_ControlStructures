package com.controlStructs;

import java.util.Scanner;

public class CalculoImc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Calculadora de IMC ---");
        double altura = 0;
        double peso = 0;

        while (peso == 0) {
            System.out.println("Digite seu peso em kg. Use números inteiros.");
            try {
                int inputPeso = scanner.nextInt();
                peso = (double) inputPeso;
            } catch (Exception e) {
                System.out.println("Erro: Por favor, digite um número válido.");
                scanner.next();
            }
        }
        System.out.printf("Seu peso é %s kg. \n", peso);

        while (altura == 0) {
            System.out.println("Digite sua altura em cm. Use números inteiros.");
            try {
                int inputAltura = scanner.nextInt();
                altura = (double) inputAltura;

            } catch (Exception e) {
                System.out.println("Erro: Por favor, digite um número válido.");
                scanner.next();
            }
        }

        System.out.printf("Sua altura é %s cm. \n", altura);
        double imc = (peso / (altura * altura)) * 10000;

        scanner.close();
        System.out.format("Seu IMC é de %.2f. Sua situação é: \n", imc);
        if (imc < 18.5) {
                System.out.println("Abaixo do peso");
            } else if (imc <= 24.9) {
                System.out.println("Peso ideal");
            } else if (imc <= 29.9) {
                System.out.println("Levemente acima do peso");
            } else if (imc <= 34.9) {
                System.out.println("Obesidade Grau I");
            } else if (imc <= 39.9) {
                System.out.println("Obesidade Grau IObesidade Grau II (Severa)");
            } else {
                System.out.println("Obesidade III (Mórbida)");
            }

    }
}
