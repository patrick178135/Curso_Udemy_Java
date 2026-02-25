package Main.Java.br.com.secao5.execicio_final;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z;

        if (x < y) {
            z = y % x;
        } else {
            z = x % y;
        }

        if (z == 0) {
            System.out.println("SÃO MULTIPLOS");
        } else {
            System.out.println("NÃO SÃO MULTIPLOS");
        }

        sc.close();
    }
}
