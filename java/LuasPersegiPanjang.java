import java.util.Scanner;
class LuasPersegiPanjang {
    public static void main(String args[]){

        System.out.println("Hitung Luas Persegi Panjang dengan Inputan");
        System.out.println("=================================");
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();

        double luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah: " + luas);

        System.out.println("=================================");

    }
}