package Sa2ProjetoBanco;

import javax.lang.model.util.ElementScanner14;
import javax.swing.JOptionPane;

import Sa2ProjetoBanco.Conta.Conta;
import Sa2ProjetoBanco.Conta.ContaPF;
import Sa2ProjetoBanco.Conta.ContaPJ;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        // criar os vetores de objetos
        ContaPF contasPf[] = new ContaPF[10];
        ContaPJ contasPj[] = new ContaPJ[10];
        // criar a aplicação do banco
        boolean aberta = true;
        int PF = 0;
        int PJ = 0;
        while (aberta) {
            int acao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha a ção desejada:"
                            + "\n 1- ABRIR  CONTA PJ"
                            + "\n 2- ABRIR  CONTA PF"
                            + "\n 3- BUSCAR CONTA PJ"
                            + "\n 4- BUSCAR CONTA  PF "
                            + "\n 5- SAIR"));

            if (acao == 1) {
                // Criar conta PJ
                contasPj[PJ] = new ContaPJ();
                // preencher as informações da conta
                contasPj[PJ].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                contasPj[PJ].setnCnpj(JOptionPane.showInputDialog("Informe o CNPJ:"));
                contasPj[PJ].setSaldo(2500);
                contasPj[PJ].setnConta(1000 + PJ);
                JOptionPane.showMessageDialog(null,
                        " CONTA  CRIADA COM SUCESSO! " + "\n CLIENTE: " + contasPj[PJ].getNome() + "\n CONTA: "
                                + contasPj[PJ].getnConta() + "\n CNPJ: " + contasPj[PJ].getnCnpj());
                PJ++;
            }
            if (acao == 2) {
                // Criar conta PF
                contasPf[PF] = new ContaPF();
                // preencher as informações da conta
                contasPf[PF].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                contasPf[PF].setnCpf(JOptionPane.showInputDialog("Informe o CPF:"));
                contasPf[PF].setSaldo(6800);
                contasPf[PF].setnConta(1250 + PF);
                JOptionPane.showMessageDialog(null,
                        " CONTA  CRIADA COM SUCESSO! " + "\n CLIENTE: " + contasPj[PF].getNome() + "\n CONTA: "
                                + contasPf[PF].getnConta() + "\n CNPJ: " + contasPf[PF].getnCpf());
                PF++;
            }

            else if (acao == 3) {// buscar a conta já criada da PF
                int nContaBusca = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº da conta buscada:"));
                int contaAtual = 0;
                for (int i = 0; i < contasPf.length; i++) {
                    // busca pelo nº da conta
                    if (nContaBusca == contasPf[i].getnConta()) {
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null, "Conta Encontrada");
                        // operacao
                    }
                }
                boolean acessar = true;
                while (acessar) {
                    int acao2 = Integer.parseInt(JOptionPane.showInputDialog(
                            "Ação desejada:"
                                    + "\n 1- VERIFICAR SALDO ATUAL"
                                    + "\n 2-EFETUE UM SAQUE"
                                    + "\n 3-FAÇA UM DEPOSITO"
                                    + "\n 4-FAÇA UM EMPRESTIMo"
                                    + "\n 5-SAIR"));
                    if (acao2 == 1) {
                        contasPf[contaAtual].getSaldo();
                    } else if (acao2 == 2) {
                        contasPf[contaAtual].saque();
                    }

                    else if (acao2 == 3) {
                        contasPf[contaAtual].deposito();
                    } else if (acao2 == 4) {
                        contasPf[contaAtual].emprestimo();
                    } else {
                        acessar = false;
                    }
                }
            }

            if (acao == 4) {// buscar a conta já criada da PJ
                int nContaBusca = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº da conta buscada:"));
                int contaAtual = 0;
                for (int i = 0; i < contasPj.length; i++) {
                    // busca pelo nº da conta
                    if (nContaBusca == contasPj[i].getnConta()) {
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null, "Conta Encontrada");
                        break;

                    }
                }

                boolean acessar = true;
                while (acessar) {
                    int acao2 = Integer.parseInt(JOptionPane.showInputDialog(
                            "Ação desejada:"
                                    + "\n 1- verificar saldo"
                                    + "\n 2-Saque"
                                    + "\n 3-Deposito"
                                    + "\n 4-Emprestimo"
                                    + "\n 5-Sair"));

                    if (acao2 == 1) {
                        contasPj[contaAtual].getSaldo();
                    } else if (acao2 == 2) {
                        contasPj[contaAtual].saque();
                    }

                    else if (acao2 == 3) {
                        contasPj[contaAtual].deposito();
                    } else if (acao2 == 4) {
                        contasPj[contaAtual].emprestimo();
                    } else {
                        acessar = false;
                    }

                }
            }

        }
    }
}
