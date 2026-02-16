package Main.Java.br.com.secao4;

import java.util.Locale;

public class Em_aula {

    public static void main(String[] args){

        int x = 29;
        double y = 12.659754;
        String nome = "Pedro";

        System.out.println("Olá mundo!");
        System.out.print("Bom dia!");
        System.out.println("Boa tarde!");
        System.out.println(x);
        System.out.println(y);
        System.out.printf("%.2f\n", y);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f\n", y);
        System.out.println("Concatenando " + x);
        System.out.printf("Teste = %.2f teste2\n", y);
        System.out.printf("%s tem %d anos e ganha R$ %.2f por hora\n", nome, x, y);
        System.out.print("Teste linha nova");
    }
}
