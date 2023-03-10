public class mobilBeraksi{
    public static void main (String[] args){
    //membuat object
    mobil xenia=new mobil();
    xenia.HidupkanMesin();
    xenia.maju();
    xenia.Belok();
    xenia.Mundur();

    xenia.tahunProduksi=2020;
    xenia.warnaMobil="Hitam";
    xenia.jenisMobil="MPV";

    System.out.println("Nama Mobil Xenia");
    System.out.println("Jenis Mobil\t\t:"+xenia.jenisMobil);
    System.out.println("Tahun Mobil\t\t:"+xenia.tahunProduksi);
    System.out.println("Warna Mobil\t\t:"+xenia.warnaMobil);
    }

}