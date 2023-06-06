package ExerciciosPOO2;

//Criar Classe Pessoas
public class Pessoas {

    // Atributos priv
    private String nome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private double altura;



    
    // gets inserts

    public Pessoas(String nome, int diaNascimento, int mesNascimento, int anoNascimento, double altura) {
        this.nome = nome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getdiaNascimento() {
        return diaNascimento;
    }

    public void setdiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // metodos

    public int idade() {

        return 2023 - anoNascimento;
    }


}
