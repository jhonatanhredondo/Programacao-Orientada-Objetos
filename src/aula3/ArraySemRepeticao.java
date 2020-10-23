package aula3;

import java.util.Scanner;

public class ArraySemRepeticao {
    public static void main(String[] args) {
        final int TAMVETOR = 10;
        Scanner scanner = new Scanner(System.in);
        int[] ArraySemRepeticoes = new int[TAMVETOR];


        for (int i = 0; i < TAMVETOR/2; i++) {
            ArraySemRepeticoes[i] = scanner.nextInt();
        }


        for (int i = 0; i < TAMVETOR/2; i++) {
            for (int j = 0; j < TAMVETOR/2; j++) {
                if(ArraySemRepeticoes[i] == ArraySemRepeticoes[j] && i != j) {
                    System.out.println("Erro");
                    return;
                }
            }
        }



        int jaestanoArray = -1;
        int VariavelTeste;
        int index = (TAMVETOR/2) - 1;
        while(index < TAMVETOR - 1) {
            for (int i = 0; i <= index; i++) {
                System.out.printf("%d ", ArraySemRepeticoes[i]);
            }
            System.out.printf("\n");
            VariavelTeste = scanner.nextInt();
            for (int j = 0; j <= index; j++) {
                if (VariavelTeste == ArraySemRepeticoes[j]) {
                    jaestanoArray = j;
                    break;
                }
            }
            if (jaestanoArray >= 0) {
                while (jaestanoArray < index) {
                    ArraySemRepeticoes[jaestanoArray] = ArraySemRepeticoes[++jaestanoArray];
                }
                index--;
                if(index == -1) {
                    break;
                }
            } else {
                index++;
                ArraySemRepeticoes[index] = VariavelTeste;
            }

            jaestanoArray = -1;
            if(index == TAMVETOR - 1) {
                for (int i = 0; i <= index; i++) {
                    System.out.printf("%d ", ArraySemRepeticoes[i]);
                }
            }
        }
    }
}
