package repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();

        while (nota1 < 0 || nota1 > 10) {
            System.out.println("nota invalida");
            nota1 = sc.nextDouble();
        }

        double nota2 = sc.nextDouble();

        while (nota2 < 0 || nota2 > 10){
            System.out.println("nota invalida");
            nota2 = sc.nextDouble();
        }

        double calculoMedia = (nota1 + nota2) / 2;
        System.out.printf("media = %.2f",calculoMedia);
    }
}