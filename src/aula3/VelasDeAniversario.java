package aula3;

import java.util.Scanner;

public class VelasDeAniversario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int idadeDaCrianca = scanner.nextInt();
        int[] tamanhoVelas = new int[idadeDaCrianca];


        for (int i = 0; i < idadeDaCrianca; i++) {
            tamanhoVelas[i] = scanner.nextInt();
        }


        int maiorVela = 0;
        int numDeVelasMaior = 0;


        for (int vela: tamanhoVelas) {
            if(vela == maiorVela) {
                numDeVelasMaior++;
            }
            if(vela > maiorVela) {
                maiorVela = vela;
                numDeVelasMaior = 1;
            }

        }


        System.out.println(numDeVelasMaior);
    }
}
