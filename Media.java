package br.ted;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {

        Scanner var = new Scanner(System.in);

        double nota1, nota2, nota3, media, rec, p_final, total;

        System.out.println("Digite sua primeira nota: ");
        nota1 = var.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        nota2 = var.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        nota3 = var.nextDouble();

        total = nota1 + nota2 + nota3;
        media = total / 3;
        rec = 10 - media + 2;
        p_final = 10 - media;

        System.out.println("Sua média foi de " + media + " pontos.");

        if( (media >= 0) && (media <= 4.9) ){
            System.out.println("Você ficou em recuperação!");
            System.out.println("Para passar você precisa de pelo menos " + rec + " pontos na prova de recuperação!");
        } else if( (media >= 5 ) && (media <= 6.9) ) {
            System.out.println("Você está na final :(");
            System.out.println("Para passar você precisa de pelo menos " + p_final + " pontos na prova final!");
        } else {
            System.out.println("Você foi aprovado por média! xD");
        }

    }

}


