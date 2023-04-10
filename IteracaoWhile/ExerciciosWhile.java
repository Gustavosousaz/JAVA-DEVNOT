package IteracaoWhile;

import java.util.Scanner;

public class ExerciciosWhile {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        int vetorA[] = new int[] { 3, 5, 7, 11, 13 };
        int vetorB[] = new int[5];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = vetorA[i];
            System.out.println("VetorB[" + i + "]=" + vetorB[i]);
            i++;
        }

    }

    public void exercicio2() {
        int vetorA[] = new int[] { 5, 10, 15, 20, 25, 30, 35, 40 };
        int vetorB[] = new int[8];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = vetorA[i] * 2;
            System.out.println("o vetorB é[" + i + "]=" + vetorB[i]);
            i++;
        }

    }

    public void exercicio3() {
        int vetorA[] = new int[] { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75 };
        int vetorB[] = new int[15];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = vetorA[i] * vetorA[i];
            System.out.println("o vetorB é[" + i + "]=" + vetorB[i]);
            i++;
        }

    }

    public void exercicio4() {
        int vetorA[] = new int[] { 5, 7, 9, 10, 13, 15, 17, 21, 25, 29, 34, 41, 47, 56, 59 };
        double vetorB[] = new double[15];
        int i = 0;
        while (i < 15) {
            vetorB[i] = Math.sqrt(vetorA[i]);
            System.out.println("O vetor B[" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    public void exercicio5() {
        int vetorA[] = new int[] { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
        double vetorB[] = new double[10];
        int i=0;
        while (i<10) {
            vetorB[i]=vetorA[i]*i;
            System.out.println("O vetor B["+i+"]="+vetorB[i]);
            i++;
        }


    }

    public void exercicio6() {
        int vetorA[] = new int[] { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
        int vetorB[] = new int[] { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
        double vetorC[] = new double[10];
        int i = 0;
        while (i<10) {
            vetorC[i]=vetorA[i]+vetorB[i];
            System.out.println("O valor da soma é["+i+"]="+vetorC[i]);
            i++;
        }
    }

}
