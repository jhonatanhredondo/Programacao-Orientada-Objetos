package aula3;

import java.util.Scanner;

public class Tijolos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int alturaTijolo = scanner.nextInt();
        int larguraTijolo = scanner.nextInt();
        int comprimentoTijolo = scanner.nextInt();
        int alturaJanela = scanner.nextInt();
        int larguraJanela = scanner.nextInt();
        int dimensoesJanela = alturaJanela + larguraJanela;


        if(alturaTijolo + larguraTijolo < dimensoesJanela || larguraTijolo + comprimentoTijolo < dimensoesJanela) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}
