interface Volume{
    double getVolume();
}

interface Area{
    double getArea();
}

abstract class Shape{
    private String name;
    abstract void getName();
    private void Shape(String name){

    }
}

class Circle extends Shape implements Area{
    double radius;
    String name;
     Circle(double radius, String name){
        this.radius = radius;
        this.name = name;
    }
    void getName(){
        System.out.println (name);
    }
    public double getArea() {
        return (Math.pow((3.1416 * (this.radius)),2)) ;
    }
}

class Square extends Shape implements Area{
    public double side;
    String name;
    Square(double side, String name){
        this.side=side;
        this.name = name;
    }
    public double getArea() {
        return(side*side);
    }
    void getName() {
        System.out.println (name);
    }
}

class Cube extends Square implements Volume{
   Cube(double side, String name){
        super(side,name);
    }
    public double getVolume() {
      return side*side*side;
    }
}

class Sphere extends Circle implements Volume{
    Sphere(double radius, String name){
        super(radius,name);
    }
    public double getVolume() {
        return (4/3 * 3.1416* (Math.pow(radius,3)));
    }
}

class Glome extends Sphere implements Volume{
    Glome(double radius, String name) {
        super(radius, name);
    }
}

public class O4 {
    public static void main(String[] args) {

    }
}

