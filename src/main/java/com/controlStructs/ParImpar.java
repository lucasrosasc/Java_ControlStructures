package com.controlStructs;

import java.util.Scanner;

public class ParImpar {

    public static void intervaloNumeros(int numeroMaior, int numeroMenor, boolean parOuImpar) {
        System.out.println(numeroMaior);
        for (int i = (numeroMaior - 1); i > numeroMenor; i--) {
            if ((parOuImpar) && (i % 2 == 0)) {
                System.out.println(i);
            } else if ((!parOuImpar) && (i % 2 != 0)) {
                System.out.println(i);
            }
        }
        System.out.println(numeroMenor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        boolean controle1 = true;
        boolean controle2 = true;
        boolean controle3 = true;
        boolean par = true;
        System.out.println("--- Par ou Ímpar ---");

        while (controle1) {
            System.out.println("Digite um número inteiro: ");
            try {
                int input = scanner.nextInt();
                numero1 = input;
                controle1 = false;
            } catch (Exception e) {
                System.out.println("Erro: Por favor, digite um número válido.");
                scanner.next();
            }
        }

        System.out.println("Digite um número inteiro maior que o primeiro.");
        while (controle2) {
            try {
                int input = scanner.nextInt();
                if (input > numero1) {
                    numero2 = input;
                    controle2 = false;
                }
            } catch (Exception e) {
                System.out.println("Erro: Por favor, digite um número válido.");
                scanner.next();
            }
        }

        while (controle3) {
            System.out.println("Escolha entre par ou ímpar. Digite sua escolha:");
            try {
                String input = scanner.next();
                if (input.equalsIgnoreCase("par") || input.equalsIgnoreCase("p")) {
                    controle3 = false;
                } else if(input.equalsIgnoreCase("ímpar") || input.equalsIgnoreCase("impar") || input.equalsIgnoreCase("i")) {
                    par = false;
                    controle3 = false;
                }
            } catch (Exception e) {
                System.out.println("Erro: Por favor, digite par(ou p) ou ímpar(ou i).");
                scanner.next();
            }
        }
        scanner.close();

        String escolha = (par == true) ? "pares" : "ímpares";
        System.out.printf("O intervalo de números %s entre %s e %s \n", escolha, numero2, numero1);
        intervaloNumeros(numero2, numero1, par);




    }
}
