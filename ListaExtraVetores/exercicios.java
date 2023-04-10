package ListaExtraVetores;

import java.util.Scanner;

public class exercicios {
    public void ex1() {
        Scanner sc = new Scanner(System.in);
        int vetorA[] = new int[]{5,10,15,20,25};
        int vetorb[] = new int[5];
        vetorb[0]=vetorA[0];
        vetorb[1]=vetorA[1];
        vetorb[2]=vetorA[2];
        vetorb[3]=vetorA[3];
        vetorb[4]=vetorA[4];
        System.out.println("o vetorB é");
        System.out.println(vetorb[0]);
        System.out.println(vetorb[1]);
        System.out.println(vetorb[2]);
        System.out.println(vetorb[3]);
        System.out.println(vetorb[4]);
    }

    public void ex2() {
        int vetorA[] = new int[]{5,10,15,20,25,30,35,40};
        int vetorB[] = new int[8];
        vetorB[0]=vetorA[0]*2;
        vetorB[1]=vetorA[1]*2;
        vetorB[2]=vetorA[2]*2;
        vetorB[3]=vetorA[3]*2;
        vetorB[4]=vetorA[4]*2;
        vetorB[5]=vetorA[5]*2;  
        vetorB[6]=vetorA[6]*2;
        vetorB[7]=vetorA[7]*2;
        System.out.println("o vetorB é");
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);
        System.out.println(vetorB[5]);
        System.out.println(vetorB[6]);
        System.out.println(vetorB[7]);
        

    }
    public void ex3() {
        int vetorA[] = new int[]{5,10,15,20,25,30,35,40,45,50,55,60,65,70,75};
        int vetorB[] = new int[15];
        vetorB[0]=vetorA[0]*vetorA[0];
        vetorB[1]=vetorA[1]*vetorA[1];
        vetorB[2]=vetorA[2]*vetorA[2];
        vetorB[3]=vetorA[3]*vetorA[3];
        vetorB[4]=vetorA[4]*vetorA[4];
        vetorB[5]=vetorA[5]*vetorA[5];  
        vetorB[6]=vetorA[6]*vetorA[6];
        vetorB[7]=vetorA[7]*vetorA[7];
        vetorB[8]=vetorA[8]*vetorA[8];
        vetorB[9]=vetorA[9]*vetorA[9];
        vetorB[10]=vetorA[10]*vetorA[10];
        vetorB[11]=vetorA[11]*vetorA[11];
        vetorB[12]=vetorA[12]*vetorA[12];
        vetorB[13]=vetorA[13]*vetorA[13];  
        vetorB[14]=vetorA[14]*vetorA[14];
        System.out.println("o vetorB é");
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);
        System.out.println(vetorB[5]);
        System.out.println(vetorB[6]);
        System.out.println(vetorB[7]);
        
        
    }
}
