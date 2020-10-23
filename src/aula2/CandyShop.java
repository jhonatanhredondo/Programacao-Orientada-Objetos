package aula2;

import java.util.Scanner;

public class CandyShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int C = input.nextInt();
        int M = input.nextInt();
        if(M > 1) {
            if ((N/C) < M) {
                System.out.println(N/C);
            } else {
                System.out.println((N/C) + ((N/C)/M));
            }
        }
    }
}
