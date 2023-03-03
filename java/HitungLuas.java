class HitungLuas {
    public static void main(String args[]){

        System.out.println("Hitung Luas Lingkaran");
        System.out.println("=================================");
        Double phi,llingkaran;
        int r;

        phi=3.14;
        r=20;
        llingkaran=(phi*r*r);

        System.out.println("Phi\t:"+phi);
        System.out.println("Jari\t:"+r);
        System.out.println("Luas Lingkaran\t:"+llingkaran);
        System.out.println("=================================");


        System.out.println("Hitung Luas Persegi");
        System.out.println("=================================");
        int p,l,lpersegi;

        p=20;
        l=10;
        lpersegi=(p*l);

        System.out.println("Panjang\t:"+p);
        System.out.println("Lebar\t:"+l);
        System.out.println("Luas Persegi Panjang\t:"+lpersegi);
        System.out.println("=================================");
    }
}