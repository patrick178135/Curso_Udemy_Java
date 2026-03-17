package Main.Java.br.com.secao6.exercicio_final;

import java.util.Scanner;

public class Exercicio1for {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while (x <= 0 || x > 1000){
            x = sc.nextInt();
        }

        for (int i = 0; i < x; i++ ){
            int y = i % 2;
            if( y != 0 ){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
