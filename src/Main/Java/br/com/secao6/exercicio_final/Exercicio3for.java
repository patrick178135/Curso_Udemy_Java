package Main.Java.br.com.secao6.exercicio_final;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3for {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc =new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 0; i < x; i++){

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2 + b * 3 + c * 5)/10;

            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
