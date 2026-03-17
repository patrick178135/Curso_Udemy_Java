package Main.Java.br.com.secao6.exercicio_final;

import java.util.Scanner;

public class Exercicio6for {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 1; i <= x; i++){
            int y = x % i;
            if (y == 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
