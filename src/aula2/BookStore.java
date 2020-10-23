package aula2;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number_books = input.nextInt();
        if(number_books <= 0) {
            System.out.println("Erro");
            return;
        }
        double criterioA = (number_books * 0.25) + 7.5;
        double criterioB = (number_books * 0.5) + 2.5;
        if(criterioA < criterioB) {
            System.out.println("Criterio A");
        } else if (criterioA > criterioB) {
            System.out.println("Criterio B");
        } else {
            System.out.println("Indiferente");
        }
    }
}
