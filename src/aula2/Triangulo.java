package aula2;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lado1 = input.nextInt();
        int lado2 = input.nextInt();
        int lado3 = input.nextInt();
        if(lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Erro");
            return;
        }
        if(lado1 > (lado2 + lado3) || lado2 > (lado1 + lado3) || lado3 > (lado1 + lado2)) {
            System.out.println("Nao forma triangulo");
            return;
        }
        if(lado1 == lado2 && lado1 == lado3) {
            System.out.println("Equilatero");
        } else if((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)){
            System.out.println("Isosceles");
        } else {
            System.out.println("Escaleno");
        }
    }
}
