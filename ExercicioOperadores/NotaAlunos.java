package ExercicioOperadores;

import java.util.Scanner;

public class NotaAlunos {
    public void notaFrequencia() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota 1");
        double nota1 = scanner.nextInt();

        System.out.println("Digite a nota 2");
        double nota2 = scanner.nextInt();

        System.out.println("Informe a frequencia do aluno");
        double frequencia = scanner.nextInt();

        double media = (nota1 + nota2) / 2;

        System.out.println("Média maior que 50:" + (media >= 50));
        System.out.println("Frequencia maior que 75:" + (frequencia >= 75));
        System.out.println("Aluno aprovado:" + (frequencia > 75 && media >= 50));
    }
}
    