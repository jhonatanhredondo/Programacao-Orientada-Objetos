package aula3;

import java.util.Scanner;

public class PapaiNoel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numPresentesTreno  = scanner.nextInt();
        int[] pesosPresentes = new int[numPresentesTreno];
        int pesoLadoDireito = 0;
        int pesoLadoEsquerdo = 0;


        for (int i = 0; i < numPresentesTreno; i++) {
            int pesoInserido = scanner.nextInt();
            if(i%2 == 0) {
                pesoLadoEsquerdo += pesoInserido;
                if((pesoLadoEsquerdo - pesoLadoDireito) > 5) {
                    System.out.println("N");
                    return;
                } else {
                    pesosPresentes[i] = pesoInserido;
                }
            } else {
                pesoLadoDireito += pesoInserido;
                if((pesoLadoDireito - pesoLadoEsquerdo) > 5) {
                    System.out.println("N");
                    return;
                } else {
                    pesosPresentes[i] = pesoInserido;
                }
            }
        }


        System.out.println("S");
    }
}
