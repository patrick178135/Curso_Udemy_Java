package Main.Java.br.com.secao4.exercicio_final;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        double pi = 3.14159;

        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();

        double y = pi*(Math.pow(raio, 2));

        Locale.setDefault(Locale.US);

        System.out.printf("A = %.4f" , y );

        sc.close();

    }
}
