package ExerciciosPOO2;
// Crie uma classe Agenda que pode armazenar 10 pessoas e que seja
// capaz de realizar as seguintes operações:
// a. armazenaPessoa(String nome, int idade, float altura);
// b. int buscaPessoa(String nome); // informa em que posição da
// agenda está a pessoa
// c. void imprimeAgenda(); // imprime os dados de todas as pessoas
// da agenda
// d. void imprimePessoa(int index); // imprime os dados da pessoa que
// está na posição “i” da agenda.

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    ArrayList<Pessoas> pessoas = new ArrayList<Pessoas>();

    public void armazenaPessoa(String nome, int idade, float altura) {
    }

    public int buscaPessoa(String nome) {
        int posicao = 0;
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getNome() == nome) {
                return i + 1;
            }

        }
        return  -1;

    }

}
