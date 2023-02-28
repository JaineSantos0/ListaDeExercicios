package inputOutput;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tempoEmSegundos = sc.nextInt();

        int calculoHora = tempoEmSegundos / 3600;

        int calculoMinutos = tempoEmSegundos / 60;

        int calculoSegundos = tempoEmSegundos - (calculoMinutos * 60);

        System.out.println(calculoHora + " : " + calculoMinutos + " : " + calculoSegundos);
    }
}