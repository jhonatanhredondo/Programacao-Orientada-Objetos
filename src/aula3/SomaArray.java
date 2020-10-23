package aula3;

import java.util.Scanner;

public class SomaArray {
    public static void main(String[] args) {
        final int ARRAYSIZE = 5;
        final int MAXSIZEINT = 2147483647;
        final int MINSIZEINT = -2147483000;
        Scanner scanner = new Scanner(System.in);


        int[] FirstArray = new int[ARRAYSIZE];
        int[] SecondArray = new int[ARRAYSIZE];


        for (int i = 0; i < ARRAYSIZE; i++) {
            FirstArray[i] = scanner.nextInt();
            if(FirstArray[i] >= MAXSIZEINT || FirstArray[i] <= MINSIZEINT) {
                System.out.println("Erro");
                return;
            }
        }


        for (int i = 0; i < ARRAYSIZE; i++) {
            SecondArray[i] = scanner.nextInt();
            if(SecondArray[i] >= MAXSIZEINT || SecondArray[i] <= MINSIZEINT) {
                System.out.println("Erro");
                return;
            }
        }


        int[] SumArray = new int[ARRAYSIZE];
        for (int i = 0; i < ARRAYSIZE; i++) {
            SumArray[i] = FirstArray[i] + SecondArray[i];
            if(SumArray[i] >= MAXSIZEINT || SumArray[i] <= MINSIZEINT) {
                System.out.println("Erro");
                return;
            }
        }


        System.out.printf("%d, %d, %d, %d, %d", SumArray[0], SumArray[1], SumArray[2], SumArray[3], SumArray[4]);
    }
}
