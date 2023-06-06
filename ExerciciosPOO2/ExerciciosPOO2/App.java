package ExerciciosPOO2;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Pessoas pessoas = new Pessoas("Gustavo", 26, 05, 2005, 1.78);

        System.out
                .println("Nome:" + pessoas.getNome() + " Idade:" + pessoas.idade() + " Altura:" + pessoas.getAltura());
    }

    // buscar objt da agenda(nome)

    String nomeBuscado = JOptionPane.showInputDialog(
            "Inform o Nome Buscado!");
    int cont = 0; // Contador
    boolean procure = true;while(procure){
        procure=false;// enquando procure for verdaderio ficara rodando em loop infinito
            if(nomeBuscado.equals(contatos=[cont].getNome())){
                procure=false;// aqui para o loop
                JOptionPane.sh"Idade:"+contatos[cont].getAnoNascimento()+"n Altura;"+contatos[cont].getAltura());
    }
    cont++;
            
    }
}
