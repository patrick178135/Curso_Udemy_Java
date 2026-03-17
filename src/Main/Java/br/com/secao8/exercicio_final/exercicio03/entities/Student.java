package Main.Java.br.com.secao8.exercicio_final.exercicio03.entities;

public class Student {

    public String name;
    public double note1;
    public double note2;
    public double note3;

    public double finalGrade() {
        return note1 + note2 + note3;
    }

    public double missingPoints() {
        return 60.00 - finalGrade();
    }

    public String toString() {
        return "FINAL GRAD = " + String.format("%.2f", finalGrade());
    }
 }
