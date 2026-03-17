package Main.Java.br.com.secao8.Em_aula_73_com_poo_metodo.entities;

public class Triangle {

    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }


}
