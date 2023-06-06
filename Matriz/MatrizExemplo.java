package Matriz;

import java.util.Random;
import java.util.Scanner;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplo1() {
        // criar uma matriz 10x9, preencher, imprimir e manipular
        // declarar matriz
        int matriz[][] = new int[10][9];// 10 linhas x 9 colunas
        // preencher a minha matriz
        for (int i = 0; i < 10; i++) {// laço referente a primeira dimensão [10]
            for (int j = 0; j < 9; j++) { // laçp referente a segunda dimensão [9]
                matriz[i][j] = rd.nextInt(9);
            }

        }
        // mostrar a minha matriz (imprimir)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println("Matriz[" + i + "][" + j + "]=" + matriz[i][j]);
            }
        }
        // imrprimir em formato de matriz
        for (int i = 0; i < 10; i++) {
            System.out.println("|");
            for (int j = 0; j < 9; j++) {
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

        // somar todos os elementos da 4ª Linha
        int somalinha = 0;
        for (int i = 0; i < 9; i++) {
            somalinha += matriz[3][i];
        }
        System.out.println("+++++++++++++");
        System.out.println("Soma da 4º Linha é " + somalinha);

        // somar todos os elementos da 4º Coluna
        int somacoluna = 0;
        for (int i = 0; i < 10; i++) {
            somacoluna += matriz[i][3];
        }
        System.out.println("++++++++++++++++");
        System.out.println("Soma da 4º Coluna é " + somacoluna);
    }

    public void exemplo2() {
        // criar uma matriz 5x5, preencher, imprimir e manipular
        int matriz[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i==j) matriz[i][j]=1;{
                } else matriz[i][j]=0;
                
            }

        }

    }
}
