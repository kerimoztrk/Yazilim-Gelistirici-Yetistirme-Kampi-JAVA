public class Main {
    public static void main(String[] args) {
    sayiBulmaca();
    }

    public static void sayiBulmaca(){
        int[]sayilar=new int[]{1,2,5,7,9,0};
        int arananSayi=5;
        boolean varMi=false;

        for (int sayi:sayilar){
            if (arananSayi==sayi){
                varMi=true;
                break;

            }
        }

        if (varMi){
            mesajVer(" Aranan sayi dizide mevcuttur. "+arananSayi);

        }else{
            mesajVer("Aranan sayi dizide yoktur. "+arananSayi);
        }
    }

        public static void mesajVer(String mesaj){
            System.out.println(mesaj);

        }
    }
