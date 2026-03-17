package Main.Java.br.com.secao6.exercicio_final;

import java.util.Scanner;

public class Exercicio2for {

    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);

        int x = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < x; i++){
            int y = sc.nextInt();

            if (y >= 10 && y <= 20){
                in += 1;
            } else {
                out += 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}
