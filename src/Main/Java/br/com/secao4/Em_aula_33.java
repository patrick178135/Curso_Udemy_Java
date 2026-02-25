package Main.Java.br.com.secao4;

import java.util.Locale;
import java.util.Scanner;

public class Em_aula_33 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc  = new Scanner(System.in);

        String a; // Mude o tipo da variável dependenod do tipo de dado a ser coletado
        int b;
        double c;
        char x;

        a = sc.next(); // Para String
        b = sc.nextInt(); // Para inteiro
        c = sc.nextDouble(); // Para ponto flutuante
        x = sc.next().charAt(0); // Para Char (charaAt(0) - pega o primeiro caracter da string)

        System.out.println("Dados digitados: ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(x);

        sc.close();

    }
}

// Dados inseridos: Pedro 10 40 gr