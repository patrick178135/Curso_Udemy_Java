package Main.Java.br.com.secao4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Em_aula_34 {

    public  static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;

        s1 = sc.nextLine(); //nextline (a variavel vai receber o valor inserido até a próxima quebra de linha)
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
