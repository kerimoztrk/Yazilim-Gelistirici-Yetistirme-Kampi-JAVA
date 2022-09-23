import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String harf="a";

        ArrayList<String>kalınSesliHarfler=new ArrayList<>();
        kalınSesliHarfler.add("A");
        kalınSesliHarfler.add("I");
        kalınSesliHarfler.add("O");
        kalınSesliHarfler.add("U");

        ArrayList<String >inceSesliHarfler=new ArrayList<>();
        inceSesliHarfler.add("E");
        inceSesliHarfler.add("İ");
        inceSesliHarfler.add("Ö");
        inceSesliHarfler.add("Ü");

        harf =harf.toUpperCase();

        if (inceSesliHarfler.contains(harf)){
            System.out.println("İnce sesli harf");
        }
        else if(kalınSesliHarfler.contains(harf)){
            System.out.println("Kalın sesli harf");

        }else{
            System.out.println("Geçersiz giriş");
        }


    }
}