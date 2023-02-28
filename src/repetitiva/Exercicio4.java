package repetitiva;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            int calculoI = i * i;
            System.out.println(i + " " + calculoI + " " + calculoI * i);
        }
    }
}