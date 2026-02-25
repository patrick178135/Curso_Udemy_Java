package Main.Java.br.com.secao4.exercicio_final;

import java.util.Scanner;

public class Exercicio1 {
    public static void main() {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = a + b;

        System.out.println("SOMA =  " + x);

        sc.close();
    }
}
