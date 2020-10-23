package aula2;

import java.util.Scanner;

public class Tinta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float largura = input.nextFloat();
        float altura = input.nextFloat();
        float custo = input.nextFloat();
        float rendimento = input.nextFloat();
        float numLatas = (altura * largura)/rendimento;
        numLatas = Math.round(numLatas);
        System.out.println((int)numLatas);
        System.out.printf("%.2f", custo * (int) numLatas);
    }
}
