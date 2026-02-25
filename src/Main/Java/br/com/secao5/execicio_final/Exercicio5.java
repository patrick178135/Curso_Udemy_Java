package Main.Java.br.com.secao5.execicio_final;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int produto = sc.nextInt();
        int quantidade = sc.nextInt();
        double total;

        switch (produto){
            case 1:
                total = quantidade * 4.00;
                break;
            case 2:
                total = quantidade * 4.50;
                break;
            case 3:
                total = quantidade * 5.00;
                break;
            case 4:
                total = quantidade * 2.00;
                break;
            case 5:
                total = quantidade * 1.50;
                break;
            default: total = 0;
        }

        System.out.println("TOTAL A PAGAR: R$ " + total);

        sc.close();
    }
}
