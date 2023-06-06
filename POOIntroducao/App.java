package POOIntroducao;

public class App {
    public static void main(String[] args) {
        // criar 3 objetos ResgistraAluno
        RegistraAluno ana = new RegistraAluno();
        RegistraAluno beto = new RegistraAluno();
        RegistraAluno carlos = new RegistraAluno();
        // Dados 
        ana.setNome("Ana Machado");
        ana.setEndereco("Rua flores 123");
        ana.setIdade(29);
        ana.setNotaCiencias(9.4);
        ana.setNotaMatematica(8.5);
        ana.setNotaPortugues(7.9);
        // Imprimindo informações
        System.out.println("--------------------------------------");
         System.out.println(ana.getNome());
         System.out.println("Contador: " + RegistraAluno.getQuantidadeAlunos());
         System.out.println("Endereço:"+ ana.getEndereco());
         System.out.println("Idade:"+ana.getIdade());
         System.out.println("Media:" +ana.getMedia());
         // Dados
        beto.setNome("Roberto da Silva");
        beto.setEndereco("Rua Machado 555");
        beto.setIdade(15);
        beto.setNotaCiencias(8.7);
        beto.setNotaMatematica(8.5);
        beto.setNotaPortugues(9.2);
        // imprimindo informações
        System.out.println("--------------------------------------");
         System.out.println(beto.getNome());
         System.out.println("Contador: " + RegistraAluno.getQuantidadeAlunos());
         System.out.println("Endereço:"+ beto.getEndereco());
         System.out.println("Idade:"+beto.getIdade());
         System.out.println("Media:" +beto.getMedia());
         // Dados
        carlos.setNome("Carlos Alberto");
        carlos.setEndereco("Parque Aquariano 587");
        carlos.setIdade(33);
        carlos.setNotaCiencias(7.4);
        carlos.setNotaMatematica(6.9);
        carlos.setNotaPortugues(5.2);
        // imprimindo informações
        System.out.println("--------------------------------------");
         System.out.println(carlos.getNome());
         System.out.println("Contador: " + RegistraAluno.getQuantidadeAlunos());
         System.out.println("Endereço:"+ carlos.getEndereco());
         System.out.println("Idade:"+carlos.getIdade());
         System.out.println("Media:" +carlos.getMedia());
    }
}
