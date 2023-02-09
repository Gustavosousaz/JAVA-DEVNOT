package CalculadoraCustoViagem;

/**
 * CustoViagem
 */
public class CustoViagem {
public static void main(String[] args){ 
    int distanciaPercorrida = 148;// em km
    double consumoTransporte = 10;// em km/l
    double preçocombustivel = 5.2;// em R$
    double quantidadelitroscombustivel = distanciaPercorrida/consumoTransporte;
    double custoTotal = quantidadelitroscombustivel*preçocombustivel;
    System.out.println("O custo total da viagem foi de");
    System.out.println("R$"+custoTotal);
}
}



   