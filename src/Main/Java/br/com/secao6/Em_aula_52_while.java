package Main.Java.br.com.secao6;

import java.util.Scanner;

public class Em_aula_52_while {

    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);

        int x = sc.nextInt();

        int soma = 0;

        while (x != 0) {

            soma += x;
            x = sc.nextInt();
        }

        System.out.println("x = " + x);
        System.out.println("Soma = " + soma);

        sc.close();
    }
}
