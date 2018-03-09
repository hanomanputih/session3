package bangunDatar;

/**
 * Created by IvanAdhi on 09/03/18.
 */
public class Main {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(3.9);
        System.out.println("Luas Lingkaran: " + l.luas());
        System.out.println("Keliling Lingkaran: " + l.keliling());

        PersegiPanjang p = new PersegiPanjang(5.87, 6.77);
        System.out.println("Luas PersegiPanjang: " + p.luas());
        System.out.println("Keliling PersegiPanjang: " + p.keliling());

    }


}
