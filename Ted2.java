package br.ted;

import java.util.Scanner;

public class Ted2 {
    
    public static void main(String[] args){

        Scanner var = new Scanner(System.in);

        String nome, curso;
        int periodo, faltas;
        double nota1, nota2, media, total;

        System.out.println("Qual seu nome completo? ");
        nome = var.nextLine();

        System.out.println("Digite o nome do seu curso: ");
        curso = var.nextLine();

        System.out.println("Em qual período você está? ");
        periodo = var.nextInt();

        System.out.println("Digite sua primeira nota: ");
        nota1 = var.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        nota2 = var.nextDouble();

        System.out.println("Quantas faltas você recebeu? ");
        faltas = var.nextInt();

        total = nota1 + nota2;
        media = total / 2;

        System.out.println("Seu nome completo é " + nome + ".\nVocê faz o curso de " + curso + " e está no período " + periodo + ".\nSua primeira nota foi " + nota1 + " e sua segunda nota foi " + nota2 + ".\nVocê recebeu " + faltas + " faltas ao longo do semestre.\nSua média foi de " + media + " pontos!");


    }

}
