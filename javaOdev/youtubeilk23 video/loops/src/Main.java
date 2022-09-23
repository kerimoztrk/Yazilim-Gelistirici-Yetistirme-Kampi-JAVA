public class Main {
    public static void main(String[] args) {

        String urun="Laptop";
        for (int index=1;index <10;index++)
        {
            System.out.println(urun+index);
        }
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }

        int sayi = 10;

        while (sayi <= 100) {
            System.out.println(sayi);
            sayi = sayi + 10;
        }

        int sayi2 = 11;
        do {
            System.out.println(sayi2);
            sayi = sayi + 10;
        } while (sayi2 > 100);






    }
}