public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Kerim";
        String ogrenci2 = "Engin";
        String ogrenci3 = "Emre";
        String ogrenci4 = "Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-----------------------");
        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Kerim";
        ogrenciler[1] = "Engin";
        ogrenciler[2] = "Emre";
        ogrenciler[3] = "Ahmet";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("-----------------------");
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }


    }
}