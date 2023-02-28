package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double[] A = new Double[10];

        for (int i = 0; i < A.length; i++) {
            double x = sc.nextDouble();
            A[i] = x;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= 10) {
                System.out.println("A[" + i + "]" + " = " + A[i]);
            }
        }
    }
}