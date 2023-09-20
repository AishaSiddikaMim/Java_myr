public class Circle {
    private double h, k, r;

    public Circle(double h, double k, double r) {
        this.h = h;
        this.k = k;
        this.r = r;
    }

    public int insideCircle(Point p) {
        double d1 = (Math.pow((p.getX() - h), 2) - Math.pow((p.getY() - k), 2));
        double d2 = r * r;
        if (d1 < d2) {
            return 0;
        }
        if (d1 > d2) {
            return -1;
        }
        if (d1 == d2) {
            return 1;
        }

    }
}

