package inputOutput;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        int soma = numero1 + numero2;

        System.out.println("Soma = " + soma);
    }
}