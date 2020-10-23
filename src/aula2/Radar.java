package aula2;

import java.util.Scanner;

public class Radar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Limite = input.nextInt();
        float Multa = input.nextFloat();
        float Adicional = input.nextFloat();
        int Velocidade = input.nextInt();
        if(Velocidade > Limite) {
            Multa += Adicional * (Velocidade - Limite);
        } else {
            Multa = 0.00f;
        }
        System.out.printf("%.2f", Multa);
    }
}
