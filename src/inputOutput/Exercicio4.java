package inputOutput;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        int notaCem = valor / 100;

        int notaCinquenta = (valor - (notaCem * 100)) / 50;

        int notaVinte = (valor - ((notaCem * 100) + (notaCinquenta * 50))) / 20;

        int notaDez = (valor - ((notaCem * 100) + (notaCinquenta * 50) + (notaVinte * 20))) / 10 ;

        int notaCinco = (valor - ((notaCem * 100) + (notaCinquenta * 50) + (notaVinte * 20)
                + (notaDez * 10))) / 5  ;

        int notaDois = (valor - ((notaCem * 100) + (notaCinquenta * 50) + (notaVinte * 20)
                + (notaDez * 10) + (notaCinco * 5))) / 2 ;

        int notaUm = (valor - ((notaCem * 100) + (notaCinquenta * 50) + (notaVinte * 20)
                + (notaDez * 10) + (notaCinco * 5) + (notaDois * 2)));

        System.out.printf("%d nota(s) de R$ 100,00 %n",notaCem);
        System.out.printf("%d nota(s) de R$ 50,00 %n",notaCinquenta);
        System.out.printf("%d nota(s) de R$ 20,00 %n",notaVinte);
        System.out.printf("%d nota(s) de R$ 10,00 %n",notaDez);
        System.out.printf("%d nota(s) de R$ 5,00 %n",notaCinco);
        System.out.printf("%d nota(s) de R$ 2,00 %n",notaDois);
        System.out.printf("%d nota(s) de R$ 1,00 %n",notaUm);
    }
}