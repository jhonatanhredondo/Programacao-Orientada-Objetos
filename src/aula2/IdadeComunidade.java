package aula2;

import java.util.Scanner;

public class IdadeComunidade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        int numPessoas = 0;
        int maioresIdade = 0;
        int pessoasIdosas = 0;
        int somaIdade = 0;
        while(true) {
            idade = input.nextInt();
            if(idade < 0) {
                break;
            } else {
                numPessoas++;
                somaIdade += idade;
                if(idade >= 18) {
                    maioresIdade++;
                }
                if(idade >= 75) {
                    pessoasIdosas++;
                }
            }
        }
        System.out.printf("%.2f\n%d\n%.2f%%", (float) somaIdade/numPessoas, maioresIdade, ((float)pessoasIdosas/numPessoas)*100);
    }


}
