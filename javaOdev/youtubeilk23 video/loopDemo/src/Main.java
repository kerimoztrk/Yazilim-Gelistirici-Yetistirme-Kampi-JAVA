public class Main {
    public static void main(String[] args) {
        //For
        for (int i=2;i<10;i+=2){
            System.out.println(i);
        }
        System.out.println("Döngü bitti");

        //while
        int i =1;
        while (i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While döngüsü bitti");

        //do-while

        int j =100;
        do {
            System.out.println(j);
        }while (j<10){
            System.out.println("Do-While döngüsü bitti");
        }
    }
}