package Main.Java.br.com.secao4;

import java.util.Locale;

public class Exercicio01 {

    public static void main(String[] args){

        String product1 = "Computer";
        String pruduct2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products:\n%s, which price is $ %.2f\n%s, which price is $ %.2f\n", product1, price1,pruduct2, price2);
        System.out.println(" ");
        System.out.printf("Record: %d years old, code %d and gender: %s\n", age, code, gender);
        System.out.print("\n");
        System.out.printf("Measue with eight decimal place: %f\nRouded (three decimal place): %.3f\n", measure, measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f\n", measure);

    }
}

