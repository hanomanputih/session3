package bangunDatar;

/**
 * Created by IvanAdhi on 09/03/18.
 */
public class PersegiPanjang extends BangunDatar{
    double p;
    double l;


    public PersegiPanjang(double p, double l) {
        this.p = p;
        this.l = l;
    }

    @Override
    double luas() {
        return p*l;
    }

    @Override
    double keliling() {
        return 2*(p+l);
    }
}
