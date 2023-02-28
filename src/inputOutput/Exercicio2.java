package inputOutput;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double pi = 3.14159;

        double raio = sc.nextDouble();

        double calculoArea = pi * Math.pow(raio,2);

        System.out.printf("A= %.4f",calculoArea);
    }
}