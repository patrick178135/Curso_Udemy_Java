package Main.Java.br.com.secao8.exercicio_final.exercicio02;

import Main.Java.br.com.secao8.exercicio_final.exercicio02.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.printf("Employee: " + employee.name + ", $" + employee.netSalary());

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Upadate data: " + employee);

        sc.close();
    }
}
