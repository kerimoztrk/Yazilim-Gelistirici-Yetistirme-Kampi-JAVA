public class Main {
    public static void main(String[] args) {

        String ogrenci1="Engin";
        String ogreci2="Kerim";

        String[]sehirler1=new String[]{"Ankara","İstanbul","İzmir"};

        String[]sehirler2=new String[]{"Antep","Diyarbakır","Urfa"};

        sehirler1=sehirler2;  //sehirler1 in adresi = sehirler2 nin adresi şeklinde yorumlanır.
        sehirler1[0]="Adana";
        System.out.println(sehirler2[0]);

        //Diziler referans tiptir

        int sayi1=10;
        int sayi2=20;
        sayi1=sayi2;
        sayi2=30;
        System.out.println(sayi1);

        //Value types : bool,int,double...
        //Referance Types: array,class,abstract,interface




       /* for (String sehir:sehirler1){
            System.out.println(sehir);
        }
        //iki for da aynı işi yapar üstteki foreach döngüsü alttaki for döngüsü
        for (int i =0 ; i< sehirler1.length; i++){
            System.out.println(sehirler1[i]);
        }

        */


    }
}