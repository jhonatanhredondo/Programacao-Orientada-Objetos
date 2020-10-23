package aula2;

import java.util.Scanner;

public class Uber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limite = input.nextInt();
        float valor1 = input.nextFloat();
        float valor2 = input.nextFloat();
        int km = input.nextInt();
        if(km >= limite) {
            System.out.printf("%.2f", valor2*km);
        } else {
            System.out.printf("%.2f", valor1*km);
        }
    }
}
