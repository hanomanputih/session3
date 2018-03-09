package bangunDatar;

/**
 * Created by IvanAdhi on 09/03/18.
 */
public class Lingkaran extends BangunDatar{
    double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    @Override
    double luas() {
        return Math.PI*r*r;
    }

    @Override
    double keliling() {
        return 2*Math.PI*r;
    }
}
