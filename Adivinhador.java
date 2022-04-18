package br.ted;

//Escreva um programa Java que gera um número aleatório (randômico) entre 0 e 10 (incluindo estes dois valores) e peça ao usuário para adivinhá-lo. Use um laço while para registrar as tentativas feitas e, a cada tentativa, dê dicas informando se o número gerado é maior ou menor que a tentativa feita. Finalmente mostre a quantidade de tentativas feitas até que o número fosse acertado.

import java.util.Scanner;
import java.util.Random;
public class Adivinhador {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random aleatorio = new Random();

        int input, tentativas = 1, numAleatorio;

        numAleatorio = aleatorio.nextInt(10);

        System.out.println("Informe um número de 0 a 10: ");

        input = scan.nextInt();

        while (input != numAleatorio) {

            if (input >  numAleatorio) {

                System.out.println("Errou! Tente um número menor.\nInforme um número de 0 a 10: ");
                input = scan.nextInt();
                tentativas++;
            }


            else if (input < numAleatorio) {
                System.out.println("Errou! Tente um número maior.\nInforme um número de 0 a 10: ");
                input = scan.nextInt();
                tentativas++;
            }
        }

        if (input ==  numAleatorio) {
            System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");

        }
    }
}
