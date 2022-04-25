package br.ted;

//Desenvolva um algoritmo que permita ao usuário informar 10 números inteiros, onde esses números serão armazenados em uma lista. Em seguida preciso que seja exibido em tela as seguintes informações:
//Exiba o menor valor dos 10 números informados;
//Exiba o maior valor dos 10 números informados;
//A soma de todos os números;
//A soma de todos os números pares;
//
//Dicas: Utilize a maioria dos assuntos já abordados em sala de aula (if,else, for, arrays, operações,...)

import java.util.Scanner;

    public class Ted0204 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int menor = 0, maior = 0, soma = 0, pares = 0;

            int[] array = new int[10];

            System.out.println("Digite a seguir 10 números inteiros.");

            for (int i = 0; i < array.length; i++) {

                System.out.print("Digite o " + (i+1) + "º número: ");
                array[i] = scanner.nextInt();

                if (i == 0) {
                    maior = array[i];
                    menor = array[i];
                }

                soma += array[i];

                if (array[i] < menor) {
                    menor = array[i];
                } else if (array[i] > maior) {
                    maior = array[i];
                }

                if (array[i] % 2 == 0) {
                    pares += array[i];
                }

            }

            System.out.println("O menor valor é: " + menor);
            System.out.println("O maior valor é: " + maior);
            System.out.println("A soma de todos os números é: " + soma);
            System.out.println("A soma de todos os números pares é: " + pares);

        }
    }