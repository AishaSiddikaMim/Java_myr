public class Quadrilateral {

    private Point p1, p2, p3, p4;

    public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
        p3 = new Point(x3, y3);
        p4 = new Point(x4, y4);
    }

    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = new Point(p1.getX(), p1.getY());
        this.p2 = new Point(p2.getX(), p2.getY());
        this.p3 = new Point(p3.getX(), p3.getY());
        this.p4 = new Point(p4.getX(), p4.getY());
    }


    public boolean isRectangle() {
        double d1 = p1.distance(p2);
        double d2 = p2.distance(p3);
        double d3 = p3.distance(p4);
        double d4 = p4.distance(p1);
        double d5 = p1.distance(p3);
        double d6 = p2.distance(p4);
        double s1 = p1.slope(p2);
        double s2 = p2.slope(p3);
        double s3 = p3.slope(p4);
        double s4 = p1.slope(p4);
        double s5 = p1.slope(p3);
        double s6 = p2.slope(p4);
        if(d1==d3 && d1!=d2 && d2==d4 && d3!=d4 && d5==d6  && s1==s3 && s2==s4) return true;
        return false;

    }

    public boolean isSquare() {
        double d1 = p1.distance(p2);
        double d2 = p2.distance(p3);
        double d3 = p3.distance(p4);
        double d4 = p4.distance(p1);
        double d5 = p1.distance(p3);
        double d6 = p2.distance(p4);
        double s1 = p1.slope(p2);
        double s2 = p2.slope(p3);
        double s3 = p3.slope(p4);
        double s4 = p1.slope(p4);
        double s5 = p1.slope(p3);
        double s6 = p2.slope(p4);
        if(d1==d2 && d2==d3 && d3==d4 && d4==d1 && d5==d6 && s1==s3 && s2==s4 ) return true;
        return false;

    }


    public boolean isRhombus() {
        double d1 = p1.distance(p2);
        double d2 = p2.distance(p3);
        double d3 = p3.distance(p4);
        double d4 = p4.distance(p1);
        double d5 = p1.distance(p3);
        double d6 = p2.distance(p4);
        double s1 = p1.slope(p2);
        double s2 = p2.slope(p3);
        double s3 = p3.slope(p4);
        double s4 = p1.slope(p4);
        double s5 = p1.slope(p3);
        double s6 = p2.slope(p4);
        if(d1==d2 && d2==d3 && d3==d4 && d4==d1 && d5!=d6 && s5*s6 ==-1 ) return true;
        return false;

    }

    public boolean isParallelogram() {
        double d1 = p1.distance(p2);
        double d2 = p2.distance(p3);
        double d3 = p3.distance(p4);
        double d4 = p4.distance(p1);
        double d5 = p1.distance(p3);
        double d6 = p2.distance(p4);
        double s1 = p1.slope(p2);
        double s2 = p2.slope(p3);
        double s3 = p3.slope(p4);
        double s4 = p1.slope(p4);
        double s5 = p1.slope(p3);
        double s6 = p2.slope(p4);
        if(d1==d3 && d1!=d2 && d2==d4 && d3!=d4 && d5!=d6 && s1==s3 && s2==s4) return true;
        return false;

    }

    public boolean isOrdinary() {
        double d1 = p1.distance(p2);
        double d2 = p2.distance(p3);
        double d3 = p3.distance(p4);
        double d4 = p4.distance(p1);
        double d5 = p1.distance(p3);
        double d6 = p2.distance(p4);
        double s1 = p1.slope(p2);
        double s2 = p2.slope(p3);
        double s3 = p3.slope(p4);
        double s4 = p1.slope(p4);
        double s5 = p1.slope(p3);
        double s6 = p2.slope(p4);
        if(isRectangle() == false && isSquare() == false && isRhombus() == false && isParallelogram() == false) return true;
        return false;

    }

    public String toString(){
        return "p1= " + p1.toString() + "p2= " + p2.toString() + "p3= " + p3.toString() + "p4= " + p4.toString();
    }


}