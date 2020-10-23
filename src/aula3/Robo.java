package aula3;

import java.util.Scanner;

public class Robo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int posicaoRoboX = scanner.nextInt();
        int posicaoRoboY = scanner.nextInt();
        int orientacaoRoboGraus = scanner.nextInt();
        int feixeEscolhido = scanner.nextInt();
        int distanciaMedidaFeixe = scanner.nextInt();



        if(feixeEscolhido < -90 || feixeEscolhido > 180) {
            System.out.println("Erro");
            return;
        }
        if(distanciaMedidaFeixe <= 0) {
            System.out.println("Erro");
            return;
        }



        //double r = (Math.pow(Math.pow(posicaoRoboX, 2) + Math.pow(posicaoRoboY, 2), 0.5));
        double arcTangente = Math.toRadians(orientacaoRoboGraus);
        double r = Math.toRadians(distanciaMedidaFeixe);

         double coordenadaX = distanciaMedidaFeixe*(Math.cos(Math.toRadians(orientacaoRoboGraus)));
         double coordenadaY = distanciaMedidaFeixe*(Math.sin(orientacaoRoboGraus));

        if(feixeEscolhido <= 90) {
            System.out.printf("(%d, %d)", Math.round(coordenadaX), Math.round(coordenadaY) + distanciaMedidaFeixe);
        } else {
            System.out.printf("(%d, %d)", Math.round(coordenadaX) + distanciaMedidaFeixe, Math.round(coordenadaY));
        }
    }
}
