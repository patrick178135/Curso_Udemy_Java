package Main.Java.br.com.secao8.exercicio_final.exercicio01.entities;

public class Rectangle {

    public double width;
    public double height;

    public double area(){
        return width *height;
    }

    public double perimeter(){
        return (width * 2) + (height * 2);
    }

    public double diagona(){
        return Math.sqrt(width * width + height * height);
    }

}
