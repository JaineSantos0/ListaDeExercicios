package repetitiva;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int calculo = 0;

        for (int i = 1; i <= n; i++){
            if (i % 2 == 0) {
                calculo = i * i;
                System.out.println(i + "^2 = " + calculo);
            }
        }
    }
}