package Main.Java.br.com.secao6.exercicio_final;

import java.util.Scanner;

public class Exercicio4for {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 0; i < x; i++){

            double primeiro = sc.nextDouble();
            double segundo = sc.nextDouble();

            if ( segundo == 0){
                System.out.println("Divisão Inpossível");
            } else {
                System.out.println(primeiro/segundo);
            }
        }

        sc.close();
    }
}
