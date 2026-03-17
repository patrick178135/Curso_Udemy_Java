package Main.Java.br.com.secao6.exercicio_final;

import java.util.Scanner;

public class Exercicio3while {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        int codigo = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (codigo != 4) {

            switch (codigo){
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
            }

            codigo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

    }
}
