public class Box {
    int L, W, H;

    Box(int l, int w, int h)
    {
        L = l;
        W = w;
        H = h;
    }

    public String toString() {
        return this.L + " " + this.W + " " + this.H;
    }
}
