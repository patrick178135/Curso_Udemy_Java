package Main.Java.br.com.secao5.execicio_final;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int y = x % 2;

        if (y == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        sc.close();
    }
}
