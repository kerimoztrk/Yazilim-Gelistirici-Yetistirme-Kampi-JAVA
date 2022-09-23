public class Main {
    public static void main(String[] args) {

        int[] sayilar=new int[]{1,2,3,4,5,6,7,8,9,10};
        int aranacak=92;

        boolean varMi=sayiBul(sayilar,aranacak);
        mesajVer(varMi,aranacak);



    }
    public static void mesajVer(boolean varMi,int aranacak){


        String mesaj = "";
        if (varMi == true) {
            mesaj = "Sayı mevcuttur: " + aranacak;
           System.out.println(mesaj);

        } else {
            mesaj="Sayı mevcut değildir: " + aranacak;
            System.out.println(mesaj);
        }
    }

    public static boolean sayiBul(int[]sayilar,int aranacak) {
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        return varMi;
    }
}

//Bir fonksiyon yaz  bool değer döndürsün ve fonksiyonun adı sayiBul olsun.
// Fonksiyon iki parametre alsın. Parametre1= dizi , Parametre2=Dizinin icinde aranacak sayi olsun.
// Aranacak sayı dizide yoksa false döndürsün.