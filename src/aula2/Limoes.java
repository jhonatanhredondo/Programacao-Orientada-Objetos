package aula2;

import java.util.Scanner;

public class Limoes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int C = input.nextInt();
        int numdeUm = (N - C) + 1;
        int soma = 0;
        if(N > 0 && C > 0) {
            while(C > 1) {
                soma += C;
                C--;
            }
            soma+=numdeUm;
        }
        System.out.println(soma);
    }
}
