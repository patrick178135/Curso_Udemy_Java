package Main.Java.br.com.secao4.exercicio_final;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc =new Scanner(System.in);

        int  codigo1, codigo2, quantidade1, quantidade2;
        double valor1, valor2, total1, total2, total_final;

        codigo1 = sc.nextInt();
        quantidade1 = sc.nextInt();
        valor1 = sc.nextDouble();

        total1 = quantidade1 * valor1;

        codigo2 = sc.nextInt();
        quantidade2 = sc.nextInt();
        valor2 = sc.nextDouble();

        total2 = quantidade2 * valor2;

        total_final = total1 + total2;

        System.out.printf("VALOR A PAGAR: R$ %.2f ", total_final);

        sc.close();
    }
}
