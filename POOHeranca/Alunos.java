package POOHeranca;

public class Alunos extends Pessoas {
    // atributos especificos
    private int matricula;
    private double mediasemestre;
    private String curso;
    private String turma;

    
    // metados especificos

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public double getMediasemestre() {
        return mediasemestre;
    }
    public void setMediasemestre(double mediasemestre) {
        this.mediasemestre = mediasemestre;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }

    
}
