package repetitiva;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int somaImpares = 0;
        int valor1 = 0;

        if (numero1 > numero2){
            valor1 = numero1;
            numero1 = numero2;
            numero2 = valor1;
        }

        for (int i = numero1; i < numero2; i ++) {
            if (i != numero1 && i % 2 != 0) {
                somaImpares += i;
            }
        }

        System.out.print(somaImpares);
    }
}