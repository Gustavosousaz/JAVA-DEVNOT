package VetoresArays;

import java.util.Scanner;

public class Vetores {

    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        // criar meu vetor
        double[] valores = new double[] { 10.5, 15.8, 7.5, -17.6 };
        System.out.println("O 1º Elemento do veotr - valores[0] é");
        System.out.println("O 2º Elemento do veotr - valores[1] é");
        System.out.println("O 3º Elemento do veotr - valores[2] é");
        System.out.println("O 4º Elemento do veotr - valores[3] é");
        System.out.println("Digite um valor para 4º posicão/indice 3");
        valores[3] = sc.nextDouble();
        System.out.println("O novo Valor da 4ºPosição/Indice[3]" + valores[3]);
    }

    public void exemplo2() {
        // criar um vetor(Vazio)
        int valoresInt[] = new int[5];
        System.out.println("Digite 5 Valores Inteiros");
        valoresInt[0] = sc.nextInt();
        valoresInt[1] = sc.nextInt();
        valoresInt[2] = sc.nextInt();
        valoresInt[3] = sc.nextInt();
        valoresInt[4] = sc.nextInt();
        System.out.println("O 1º Elemento do veotr - Indice[0] é" + valoresInt[0]);
        System.out.println("O 2º Elemento do veotr - Indice[1] é" + valoresInt[1]);
        System.out.println("O 3º Elemento do veotr - Indice[2] é" + valoresInt[2]);
        System.out.println("O 4º Elemento do veotr - Indice[3] é" + valoresInt[3]);
        System.out.println("O 5º Elemento do veotr - Indice[4] é" + valoresInt[4]);

    }

    public void exemplo3() {
        // 10 Numeros reais
        double[] valoresInt = new double[10];
        System.out.println("Digite 10 valores Reasis");
        valoresInt[0] = sc.nextDouble();
        valoresInt[1] = sc.nextDouble();
        valoresInt[2] = sc.nextDouble();
        valoresInt[3] = sc.nextDouble();
        valoresInt[4] = sc.nextDouble();
        valoresInt[5] = sc.nextDouble();
        valoresInt[6] = sc.nextDouble();
        valoresInt[7] = sc.nextDouble();
        valoresInt[8] = sc.nextDouble();
        valoresInt[9] = sc.nextDouble();
        System.out.println("Valores Digitados na ordem inversa são");
        System.out.println("Valores Inversos" + valoresInt[9]);
        System.out.println("Valores Inversos" + valoresInt[8]);
        System.out.println("Valores Inversos" + valoresInt[7]);
        System.out.println("Valores Inversos" + valoresInt[6]);
        System.out.println("Valores Inversos" + valoresInt[5]);
        System.out.println("Valores Inversos" + valoresInt[4]);
        System.out.println("Valores Inversos" + valoresInt[3]);
        System.out.println("Valores Inversos" + valoresInt[2]);
        System.out.println("Valores Inversos" + valoresInt[1]);
        System.out.println("Valores Inversos" + valoresInt[0]);

    }

    public void exemplo4() {
        // Ler 4 Notas
        double[] Notas = new double[4];
        System.out.println("Digite as 4 Notas");
        Notas[0] = sc.nextDouble();
        Notas[1] = sc.nextDouble();
        Notas[2] = sc.nextDouble();
        Notas[3] = sc.nextDouble();
        Double Media= (Notas[0]+Notas[1]+Notas[2]+Notas[3])/4;
        System.out.println("A media é " +Media);
    }
}
