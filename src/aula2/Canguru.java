package aula2;

import java.util.Scanner;

public class Canguru {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int posicaoInicialA = input.nextInt();
        int tamanhoPuloA = input.nextInt();
        int posicaoInicialB = input.nextInt();
        int tamanhoPuloB = input.nextInt();
        if(posicaoInicialA > posicaoInicialB) {
            if(tamanhoPuloA >= tamanhoPuloB) {
                if(posicaoInicialB + tamanhoPuloB == posicaoInicialA) {
                    System.out.println("SIM");
                } else {
                    System.out.println("NAO");
                }
            } else {
                if(tamanhoPuloB > tamanhoPuloA * 2) {
                    if(tamanhoPuloA + posicaoInicialA == tamanhoPuloB) {
                        System.out.println("SIM");
                    }
                    else {
                        System.out.println("NAO");
                    }
                } else {
                    System.out.println("SIM");
                }
            }
        } else if(posicaoInicialA == posicaoInicialB) {
            if(tamanhoPuloA == tamanhoPuloB) {
                System.out.println("SIM");
            } else {
                System.out.println("NAO");
            }
        } else {
            if(tamanhoPuloB >= tamanhoPuloA) {
                if(tamanhoPuloA + posicaoInicialA == posicaoInicialB) {
                    System.out.println("SIM");
                } else {
                    System.out.println("NAO");
                }
            } else {
                if(tamanhoPuloA > tamanhoPuloB*2) {
                    if(tamanhoPuloB + posicaoInicialB == tamanhoPuloA) {
                        System.out.println("SIM");
                    } else {
                        System.out.println("NAO");
                    }
                } else {
                    System.out.println("SIM");
                }
            }
        }
    }
}
