package Main.Java.br.com.secao5.execicio_final;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int tempo;

        if (x >= y) {
            tempo = (24 - x) + y;
        } else {
            tempo = y - x;
        }

        System.out.println("O JOGO DUROU " + tempo + " HORA(S)");

        sc.close();
    }
}
