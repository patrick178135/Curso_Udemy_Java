package Main.Java.br.com.secao8.exercicio_final.exercicio01;

import Main.Java.br.com.secao8.Em_aula_74_75_com_poo.entities.Product;
import Main.Java.br.com.secao8.exercicio_final.exercicio01.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        
        System.out.print("widht: ");
        rectangle.width = sc.nextDouble();

        System.out.print("height: ");
        rectangle.height = sc.nextDouble();

        System.out.println("AREA = " + rectangle.area());
        System.out.println("PERIMETER = " + rectangle.perimeter());
        System.out.println("DIAGONAL = " + rectangle.diagona());


        sc.close();
    }
}
