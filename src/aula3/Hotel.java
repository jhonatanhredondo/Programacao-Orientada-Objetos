package aula3;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int estadoInicialLampadaA = scanner.nextInt();
        int estadoInicialLampadaB = scanner.nextInt();
        int estadoFinalLampadaA = scanner.nextInt();
        int estadoFinalLampadaB = scanner.nextInt();
        int numDeInterruptoresApertados = 0;



        while(true) {
            if(estadoFinalLampadaB != estadoInicialLampadaB) {
                numDeInterruptoresApertados++;
                if(estadoInicialLampadaA == 0) {
                    estadoInicialLampadaA = 1;
                } else {
                    estadoInicialLampadaA = 0;
                }
                if(estadoInicialLampadaB == 0) {
                    estadoInicialLampadaB = 1;
                } else {
                    estadoInicialLampadaB = 0;
                }
            }
            if(estadoInicialLampadaA != estadoFinalLampadaA) {
                numDeInterruptoresApertados++;
                if(estadoInicialLampadaA == 0) {
                    estadoInicialLampadaA = 1;
                } else {
                    estadoInicialLampadaA = 0;
                }
            }
            if(estadoFinalLampadaA == estadoInicialLampadaA && estadoFinalLampadaB == estadoInicialLampadaB) {
                break;
            }
        }



        System.out.println(numDeInterruptoresApertados);

    }
}
