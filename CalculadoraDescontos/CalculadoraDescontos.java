package CalculadoraDescontos;

import java.util.Scanner;

public class CalculadoraDescontos {
    public void calcular20() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o Preço do Produto");
        double precoProduto= sc.nextDouble();
        final int desconto20=20;
        double precoComDescontos=precoProduto-(precoProduto*desconto20/100);
        System.out.println("O preço com Desconto é " +precoComDescontos +"reais");
        

    }

    public void calcular30() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o Preço do Produto");
            double precoProduto;
            final int desconto30=30;
            double precoComDescontos=precoProduto-(precoProduto*desconto30/100);
            System.out.println("O preço com Desconto é " +precoComDescontos +"reais");     
       

    }
    
}
