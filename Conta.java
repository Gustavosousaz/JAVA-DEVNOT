package Sa2ProjetoBanco.Conta;

import javax.swing.JOptionPane;
import java.util.Scanner;

public abstract class Conta {
    Scanner sc = new Scanner(System.in);
    // atributos
    String nome;
    int nConta;
    double saldo;

    // set get
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // metado vazio
    public void saque() {
        System.out.println("Digite o valor do saque desejado!");
        double saque = sc.nextDouble();
        if (saque <= saldo) {
            saldo -= saque;
            System.out.println("Voce realizou o saque de"+saque + "Seu saldo atual é de"+saldo );
        } else {
            System.out.println("Não foi possivel realizar o saque (SALDO INSUFICIENTE!)");
        }
    }

    public void deposito() {
        System.out.println("Digite o valor do deposito desejado:");
        double deposito = sc.nextDouble();
        saldo = saldo + deposito;
        System.out.println("Você efetuou um deposito de: "+deposito + "seu saldo atual é  " +saldo);
        
    }

    public void emprestimo() {
        System.out.println("Digite o valor de emprestimo desejado");
        double emprestimo = sc.nextDouble();
        if (emprestimo >15 && emprestimo <5000) {
            emprestimo +=saldo ;
            System.out.println("Você efetuou um deposito de: "+deposito + "seu saldo atual é  " +saldo);
            
        } else{
            System.out.println("Não foi possivel efetuar o emprestimo, o valor minino e de R$15,00 reais e o maximo R$5.000,00  ");
        }
        
    }

}
