package Sa2ProjetoBanco;

import javax.swing.JOptionPane;

import Sa2ProjetoBanco.Conta.Conta;
import Sa2ProjetoBanco.Conta.ContaPF;
import Sa2ProjetoBanco.Conta.ContaPJ;

/**
 * App
 */
public class App {

    private static int contPJ;

    public static void main(String[] args) {
        //criar os vetores de objetos
        String conta;
        ContaPF contasPf[] = new ContaPF[10];
        ContaPJ contasPj[] = new ContaPJ[10];
        //criar a aplicação do banco
        boolean aberta = true;
        int PF = 0;
        int PJ = 0;
        while(aberta){
            int acao = Integer.parseInt(JOptionPane.showInputDialog(
                "Escolha a ção desejada:"
                +"\n 1- Criar Conta PF"
                +"\n 2- Criar Conta PJ"
                +"\n 3- Buscar Conta PF"
                +"\n 4- Buscar Conta PJ "
                +"\n 5- Sair"
            ));

            if(acao ==1){
                // Criar conta PF
                conta = JOptionPane.showInputDialog("Deseja criar uma conta PF ou PJ: ");
                //preencher as informações da conta
               conta .equals("PF");
                    contasPj[PJ].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                    contasPj[PJ].setnCnpj(JOptionPane.showInputDialog("Informe o CPF:"));

            if(acao ==2){
                // Criar conta PJ
                conta = JOptionPane.showInputDialog("Deseja criar uma conta PF ou PJ: ");
                //preencher as informações da conta
                conta .equals("PJ");
                contasPf[PF].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                contasPf[PF].setnCnpj(JOptionPane.showInputDialog("Informe o CNPJ:"));
            }

            if(acao==3){//buscar a conta já criada da PF
                int nContaBusca = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº da conta buscada:"));
                for (int i = 0; i < contasPf.length; i++) {
                    //busca pelo nº da conta
                    if(nContaBusca == contasPf[i].getnConta()){
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null,"Conta Encontrada");
                    }
                }

            if(acao==4){//buscar a conta já criada da PF
                int nContaBusca = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº da conta buscada:"));
                for (int i = 0; i < contasPf.length; i++) {
                    //busca pelo nº da conta
                    if(nContaBusca == contasPj[i].getnConta()){
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null,"Conta Encontrada");
                    }
                }





                boolean acessar = true;
                while(acessar){
                    int acao2   = Integer.parseInt(JOptionPane.showInputDialog(
                    "Ação desejada:"
                    +"\n 1- verificar saldo"
                    +"\n 2-Saque"));
                    if(acao2 == 1){
                    contasPf[contaAtual].getSaldo();
                } else if (acao2 ==2){
                    contasPf[contaAtual].saque();
                }
                                    
                }
            }

        }
        
    }
}
