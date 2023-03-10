import java.util.Scanner;
class LuasLingkaran {
    public static void main(String args[]){
        System.out.println("Hitung Luas Lingkaran dengan Inputan");
        System.out.println("=================================");    

        Scanner input = new Scanner(System.in);

        double phi = 3.14;

        System.out.print("Masukkan jari jari : ");
        double jari = input.nextDouble();

        double luas = phi * jari * jari;
        System.out.println("Luas persegi panjang adalah: " + luas);

        System.out.println("=================================");
    }
}