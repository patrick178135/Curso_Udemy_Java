package Main.Java.br.com.secao4.exercicio_final;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int horas_trabalhadas = sc.nextInt();
        double valor_hora = sc.nextDouble();

        double salario = horas_trabalhadas * valor_hora;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}
