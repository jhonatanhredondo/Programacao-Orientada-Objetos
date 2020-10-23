package aula3;

import java.util.Scanner;

public class ArrayIntercalado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numDeItensArray = scanner.nextInt();


        int[] ArrayA = new int[numDeItensArray];
        int[] ArrayB = new int[numDeItensArray];


        for (int i = 0; i < numDeItensArray; i++) {
            ArrayA[i] = scanner.nextInt();
        }
        for (int i = 0; i < numDeItensArray; i++) {
            ArrayB[i] = scanner.nextInt();
        }


        int[] ArrayIntercalado = new int[numDeItensArray*2];


        int indexArray = -1;
        for (int i = 0; i < ArrayA.length; i++) {
            ArrayIntercalado[++indexArray] = ArrayA[i];
            ArrayIntercalado[++indexArray] = ArrayB[i];
        }


        for (int i = 0; i < ArrayIntercalado.length; i++) {
            System.out.printf("%d ", ArrayIntercalado[i]);
        }
    }
}
