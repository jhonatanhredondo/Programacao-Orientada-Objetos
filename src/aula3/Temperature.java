package aula3;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        final int DAYSOFTHEWEEK = 7;
        int[] temperatures = new int[DAYSOFTHEWEEK];
        int sumofTemperatures = 0;


        for (int i = 0; i < DAYSOFTHEWEEK; i++) {
            temperatures[i] = scanner.nextInt();
            sumofTemperatures += temperatures[i];
        }


        double averageTemperature = (double) sumofTemperatures/DAYSOFTHEWEEK;
        int aboveAverageTemperature = 0;


        for (int temperature:temperatures) {
            if(temperature > averageTemperature) {
                aboveAverageTemperature++;
            }
        }


        System.out.println(aboveAverageTemperature);
    }
}
