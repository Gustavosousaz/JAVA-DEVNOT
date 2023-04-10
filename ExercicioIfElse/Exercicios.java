package ExercicioIfElse;

import java.util.Scanner;

public class Exercicios {

    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.print("Digite o primeiro valor:");
        int valor1 = sc.nextInt();

        System.out.print("Digite o segundo valor:");
        int valor2 = sc.nextInt();

        if (valor1 > valor2) {
            System.out.println("O maior valor é:" + valor1);
        } else if (valor1 == valor2) {
            System.out.println("Erro não pode por o mesmo valor");
        } else {
            System.out.println("O maior valor é:" + valor2);
        }

        // Se por o mesmo valor ele não ira funcionar

    }

    public void exercicio2() {
        System.out.print("Digite o ano de nascimento: ");
        int AnoNascimento = sc.nextInt();

        int idade = 2023 - AnoNascimento;

        if (idade >= 16) { // para votar tem que ter no minino 16 anos
            System.out.println("Parabéns, você poderá votar este ano!.");
        } else {
            System.out.println("Você não poderá votar este ano por ser menor de 16 anos!.");
        }

    }

    public void exercicio3() {
        // Define a senha válida
        int senhaValida = 1234;

        try (// Lê a senha fornecida pelo usuário
                Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite a senha: ");
            int senha = sc.nextInt();

            // Verifica se a senha fornecida é válida
            if (senha == senhaValida) {
                System.out.println("ACESSO PERMITIDO!");
            } else {
                System.out.println("TENTE NOVAMENTE! ACESSO NEGADO");
            }
            
        }
    }

public void exercicio5 () {
     System.out.println("Escreva o Primeiro valor");
     int a = sc.nextInt();
     System.out.println("Escreva o Segundo valor");
     int b = sc.nextInt();
     System.out.println("Escreva o Terceiro valor");
     int c = sc.nextInt();
    
     if (a <= b && b <= c) {
     System.out.println(a+""+b+""+c);}
    
     else if (a <= c && c <= b) {
     System.out.println(a+""+c+""+b);}
    
     else if (b <= c && c <= a) {
     System.out.println(b+""+c+""+a);}
     else if (b <= a && a <= c) {
     System.out.println(b+""+a+""+c);}
    
     else if (c <= a && a <= b) {
     System.out.println(c+""+a+""+b);}
     else
     System.out.println(c+""+b+""+a);

}

public void exercicio6() {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Digite a altura (em metros): ");
        double altura = sc.nextDouble();
        System.out.print("Digite o sexo (1 para feminino, 2 para masculino): ");
        int sexo = sc.nextInt();

        double pesoIdeal;
        if (sexo == 1) {
            pesoIdeal = 62.1 * altura - 44.7;
        } else if (sexo == 2) {
            pesoIdeal = 72.7 * altura - 58;
        } else {
            System.out.println("Opção inválida para o sexo.");
            return;
        }

        System.out.printf("O peso ideal para uma pessoa de %.2f metros de altura e sexo %d é %.2f kg.", altura,
                sexo, pesoIdeal);
    }
}

public void exercicio7() {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Informe a Nota 1 do aluno");
        int nota1 = sc.nextInt();
        System.out.println("Informe a Nota 2 do aluno");
        int nota2 = sc.nextInt();
        double mediaAluno = nota1;
        mediaAluno += nota2;
        mediaAluno /= 2;
        System.out.println("a média do aluno é " + mediaAluno);

        boolean mediaAprovado = mediaAluno >= 50;
        System.out.println("o aluno está aprovado por nota? " + mediaAprovado);

        System.out.println("informe a frequencia do aluno:");
        int frequenciaAluno = sc.nextInt();
        boolean frequenciaAprovado = frequenciaAluno >= 75;
        System.out.println("o aluno esta aprovado por frequencia? " + frequenciaAprovado);

        boolean aprovacaoFinal = (mediaAprovado == true) && (frequenciaAprovado == true);
        if (aprovacaoFinal == true) {
            System.out.println("o aluno está aprovado no curso");
        } else {
            if (mediaAprovado == false) {
                System.out.println("o aluno foi reprovado por nota");
            } else if (frequenciaAprovado == false) {
                System.out.println("o aluno foi reprovado por frequência");
            }
            System.out.println("o aluno está reprovado no curso");
        }
    }
}
}