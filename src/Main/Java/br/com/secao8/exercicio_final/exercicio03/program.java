package Main.Java.br.com.secao8.exercicio_final.exercicio03;

import Main.Java.br.com.secao8.exercicio_final.exercicio03.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Student name: ");
        student.name = sc.nextLine();

        System.out.print("Note 1: ");
        student.note1 = sc.nextDouble();

        System.out.print("Note 2: ");
        student.note2 = sc.nextDouble();

        System.out.print("Note 3: ");
        student.note3 = sc.nextDouble();

        System.out.println(student);

        if (student.finalGrade() >= 60){
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING " + String.format("%.2f",student.missingPoints()) + " POINTS");
        }

        sc.close();
    }

}
