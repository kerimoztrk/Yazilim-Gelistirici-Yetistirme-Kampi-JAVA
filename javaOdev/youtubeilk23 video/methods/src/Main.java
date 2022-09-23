public class Main {
            public static void main(String[] args) {
             mesajVer("Engin");
             mesajVer("Kerim");
             mesajVer("Emre");
             hesapla();

                System.out.println(topla(6,3));

                System.out.println(toplananIkıSayininYuzdeOnu(10,90));







            }

    public static void mesajVer(String isim){
        System.out.println("Merhaba"+isim);
        //onlarca satır olduğunu düşünelim
    }
    public static void hesapla(){
        System.out.println("Hesaplandı");
        //onlarca satır olduğunu düşünelim
    }

    public static int topla(int sayi1,int sayi2){
                int toplam=sayi1+sayi2;
                return toplam;
    }

    //toplanan iki sayinin %10 unu bul
    public static double toplananIkıSayininYuzdeOnu(int sayi1,int sayi2){
        int toplam=topla(sayi1,sayi2);
        double sonuc=toplam*10/100;
        return sonuc;
    }

    //return olanlar bir hesaplamanın sonucudur genel olarak
    public static double krediHesapla(double krediMiktari){
                //hesaplar yapılır
                return 125000;
    }

}