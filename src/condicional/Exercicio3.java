package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double calculoReajuste = 0;
        double salarioReajuste = 0;
        int reajuste = 0;

        if (salario > 0 && salario <= 400){
            reajuste = 15;
            calculoReajuste = (salario * reajuste)/ 100;
            salarioReajuste = salario + calculoReajuste;
        } else if (salario > 400 && salario <=800 ) {
            reajuste = 12;
            calculoReajuste = (salario * reajuste)/ 100;
            salarioReajuste = salario + calculoReajuste;
        } else if (salario > 800 && salario <= 1200) {
            reajuste = 10;
            calculoReajuste = (salario * reajuste)/ 100;
            salarioReajuste = salario + calculoReajuste;
        } else if (salario > 1200 && salario <= 2000) {
            reajuste = 7;
            calculoReajuste = (salario * reajuste)/ 100;
            salarioReajuste = salario + calculoReajuste;
        } else if (salario > 2000) {
            reajuste = 4;
            calculoReajuste = (salario * reajuste)/ 100;
            salarioReajuste = salario + calculoReajuste;
        }

        System.out.printf("Novo salario: %.2f\n",salarioReajuste);
        System.out.printf("Reajuste ganho: %.2f\n",calculoReajuste);
        System.out.print("Em percentual: " + reajuste + " %");
    }
}