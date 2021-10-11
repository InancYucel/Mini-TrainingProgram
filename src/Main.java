import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("İdman programına hoşgeldiniz");

        String idmanlar = "Geçerli Hareketler... \n"
                + "Burpee\n"
                + "Pushup\n"
                + "Situp\n"
                + "Squat\n";
        System.out.println(idmanlar);
        System.out.println("Bir idman oluşturun");

        System.out.println("Burpee Sayısı:");
        int Burpee = scanner.nextInt();

        System.out.println("Pushup Sayısı:");
        int Pushup = scanner.nextInt();

        System.out.println("Situp Sayısı:");
        int Situp = scanner.nextInt();

        System.out.println("Squat Sayısı:");
        int Squat = scanner.nextInt();
        scanner.nextLine(); //dummy

        Idman idman = new Idman(Burpee, Pushup, Situp, Squat);

        while(idman.idmanBittiMi() == false){

            System.out.println("Hareket Türü (Burpee Pushup, Situp, Squat)");
            String tur = scanner.nextLine();
            System.out.println("Bu hareketten kaç tane yapacaksınız?");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur,sayi);


        }
    }

}
