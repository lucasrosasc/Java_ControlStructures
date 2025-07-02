package com.controlStructs;

import java.util.Scanner;

public class MultiplosN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = 0;
        boolean controle1 = true;
        boolean controle2 = true;

        System.out.println("--- Múltiplos de N ---");

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
        do {
            try {
                int input = scanner.nextInt();
                if ((input > numero1) && (input % numero1 != 0)) {
                    controle2 = false;
                    System.out.printf("%s não é múltiplo de %s. \n", input, numero1);
                }
            } catch (Exception e) {
                System.out.println("Erro: Por favor, digite um número válido.");
                scanner.next();
            }
        } while (controle2);


        scanner.close();

    }
}
