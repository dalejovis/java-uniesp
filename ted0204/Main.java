package br.ted.ted0204;

//Desenvolva um algoritmo que permita ao usuário informar 10 números inteiros, onde esses números serão armazenados em uma lista. Em seguida preciso que seja exibido em tela as seguintes informações:
//        Exiba o menor valor dos 10 números informados;
//        Exiba o maior valor dos 10 números informados;
//        A soma de todos os números;
//        A soma de todos os números pares;
//
//        Dicas: Utilize a maioria dos assuntos já abordados em sala de aula (if,else, for, arrays, operações,...)


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exibidor exibidor = new Exibidor();

        int i = 0;

        while (i < 10){
            System.out.println("Teste" + i);
            i ++;
        }
    }
}
