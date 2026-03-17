package Main.Java.br.com.secao6;

import java.util.Scanner;

public class Em_aula_57_for {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int soma = 0;

        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println("Soma: " + soma);

        sc.close();
    }
}
