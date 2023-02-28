package condicional;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();

        if (numero1 < numero2 && numero1 < numero3) {
           if(numero2 < numero3) {
               System.out.println(numero1);
               System.out.println(numero2);
               System.out.println(numero3);
           } else {
               System.out.println(numero1);
               System.out.println(numero3);
               System.out.println(numero2);
           }
        } else if (numero2 < numero3) {
            if (numero3 < numero1) {
                System.out.println(numero2);
                System.out.println(numero3);
                System.out.println(numero1);
            } else {
                System.out.println(numero2);
                System.out.println(numero1);
                System.out.println(numero3);
            }
        } else{
            if (numero2 < 1) {
                System.out.println(numero3);
                System.out.println(numero2);
                System.out.println(numero1);
            } else {
                System.out.println(numero3);
                System.out.println(numero1);
                System.out.println(numero2);
            }
        }

        System.out.println();
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);
    }
}