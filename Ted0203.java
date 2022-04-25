package br.ted;

//Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
//a maior e a menor altura do grupo;
//média de altura do sexo igual a masculino;
//o número de registros de sexo igual a feminino.

import java.util.Scanner;

public class Ted0203 {

    public static void main(String[] args) {
        
        float altura, somaAltHomens=0, maiorAltura=0, menorAltura=100;
        int sexo, totalMulheres=0, totalHomens=0;

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<4; i++) {

            System.out.print("Insira o sexo da " + (i+1) + "ª pessoa!\nFeminino = 0 // Masculino = 1: ");
            sexo = scanner.nextInt();

            System.out.print("Digite a altura da " + (i+1) + "ª pessoa: ");
            altura = scanner.nextFloat();

            if (sexo == 0) {
                totalMulheres++;
            } else if (sexo == 1) {
                totalHomens++;
                somaAltHomens = somaAltHomens + altura;
            } else {
                System.out.println("Você deve escolher entre 0 ou 1!");
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (altura < menorAltura){
                menorAltura = altura;
            }
        }


        System.out.println("\nA maior e menor altura do grupo, respectivamente, foram: " + maiorAltura + "m e " + menorAltura + "m.\nA média de altura do sexo masculino foi de " + (somaAltHomens / totalHomens) + "m.\nForam registradas no total " + totalMulheres + " mulheres." );

        scanner.close();

    }

}
