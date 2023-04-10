package IteracaoWhile;

import java.util.Random;
import java.util.Scanner;

public class ExemploWhile {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        int interacao = 0;
        while (interacao < 10) {
            interacao += 1;
            System.out.println("essa é a interação de nº" + interacao);

        }

    }

    public void exemplo2() {
        Random rd = new Random();
        int numeroAleatorio = rd.nextInt(10);
        boolean TenteNovamente = true;
        System.out.println("Aperte CTRL+C, a qualquer momento para parar.");
        while (TenteNovamente) {
            System.out.println("Tente adivinhar o número!");
            int numero = sc.nextInt();
            if (numero == numeroAleatorio) {
                System.out.println("Acertou Mizeravel!");
                TenteNovamente = false;
            } else {
                System.out.println("Errou Mizeravi");
            }
        }

    }

    public void exemplo3() {
        int vetor[] = new int[5];
        int i = 0;
        while (i < 5) {
            System.out.println("Digite o valor par ao vetor["+i+"]");
            vetor[i] = sc.nextInt();
            i++;
        }
        while (i<5) {
            System.out.println(vetor[i]);
            i++; 
            
        }
        

    }
}
