public class Triangle {
    Point p1, p2, p3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
        p3 = new Point(x3, y3);
    }

    public String toString(){
        return "p1 = " + p1.toString() + " p2 = " + p2.toString() + " p3 = " + p3.toString();
    }

}
