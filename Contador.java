package br.ted;

//Escreva um programa Java que usa o laço do...while para ler números inteiros até que o valor lido seja igual a 0. Em seguida mostre a quantidade de valores positivos e negativos, a soma dos valores e a média aritmética (sem incluir o valor 0 na contagem e no cálculo da média). A média deverá ser exibida como um valor de ponto flutuante.

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input, soma = 0, positivos = 0, negativos = 0;
        double total = 0;

        do {
            System.out.print("Informe um número inteiro (0 para sair): ");

            input = Integer.parseInt(scanner.nextLine());

            if(input != 0){
                total++;
            }

            if(input > 0){
                positivos++;
            }
            else if(input < 0){
                negativos++;
            }

            soma += input;
        }
        while(input != 0);

        if(total == 0){
            System.out.println("Você não informou nenhum número.");
        }
        else{
            System.out.println("Quantidade de números positivos: " + positivos);
            System.out.println("Quantidade de números negativos: " + negativos);
            System.out.println("A soma dos números lidos é: " + soma);
            System.out.println("A média aritmética é: " + (soma / total));
        }
    }
}
