public class Idman {

    private int burpee_sayısı;
    private int pushup_sayısı;
    private int situp_sayısı;
    private int squat_sayısı;

    public Idman(int burpee_sayısı, int pushup_sayısı, int situp_sayısı, int squat_sayısı) {
        this.burpee_sayısı = burpee_sayısı;
        this.pushup_sayısı = pushup_sayısı;
        this.situp_sayısı = situp_sayısı;
        this.squat_sayısı = squat_sayısı;
    }

    public int getBurpee_sayısı() {
        return burpee_sayısı;
    }

    public void setBurpee_sayısı(int burpee_sayısı) {
        this.burpee_sayısı = burpee_sayısı;
    }

    public int getPushup_sayısı() {
        return pushup_sayısı;
    }

    public void setPushup_sayısı(int pushup_sayısı) {
        this.pushup_sayısı = pushup_sayısı;
    }

    public int getSitup_sayısı() {
        return situp_sayısı;
    }

    public void setSitup_sayısı(int situp_sayısı) {
        this.situp_sayısı = situp_sayısı;
    }

    public int getSquat_sayısı() {
        return squat_sayısı;
    }

    public void setSquat_sayısı(int squat_sayısı) {
        this.squat_sayısı = squat_sayısı;
    }

    public void hareketYap(String hareketTuru, int sayi) {

        if (hareketTuru.equals("Burpee"))
            burpeeYap(sayi);

        else if (hareketTuru.equals("Pushup"))
            pushupYap(sayi);

        else if (hareketTuru.equals("Situp"))
            situpYap(sayi);

        else if (hareketTuru.equals("Squat"))
            squatupYap(sayi);

        else
            System.out.println("Geçersiz hareket");

    }

    public void burpeeYap(int sayi) {

        if (burpee_sayısı == 0)
            System.out.println("Yapacak burpee kalmadı");
        if (burpee_sayısı - sayi < 0) {
            System.out.println("Hedeflediğin burpee sayısını geçtin tebrikler");
            burpee_sayısı = 0;
            System.out.println("Kalan Burpee : " + burpee_sayısı);
        } else {

            burpee_sayısı -= sayi;
            System.out.println("Kalan Burpee : " + burpee_sayısı);

        }

    }

    public void pushupYap(int sayi) {

        if (pushup_sayısı == 0)
            System.out.println("Yapacak pushup kalmadı");
        if (pushup_sayısı - sayi < 0) {
            System.out.println("Hedeflediğin pushup sayısını geçtin tebrikler");
            pushup_sayısı = 0;
            System.out.println("Kalan pushup : " + pushup_sayısı);
        } else {

            pushup_sayısı -= sayi;
            System.out.println("Kalan pushup : " + pushup_sayısı);

        }
    }

    public void situpYap(int sayi) {

        if (situp_sayısı == 0)
            System.out.println("Yapacak situp kalmadı");
        if (situp_sayısı - sayi < 0) {
            System.out.println("Hedeflediğin situp sayısını geçtin tebrikler");
            situp_sayısı = 0;
            System.out.println("Kalan situp : " + situp_sayısı);
        } else {

            situp_sayısı -= sayi;
            System.out.println("Kalan situp : " + situp_sayısı);

        }
    }

    public void squatupYap(int sayi) {

        if (squat_sayısı == 0)
            System.out.println("Yapacak squat kalmadı");
        if (squat_sayısı - sayi < 0) {
            System.out.println("Hedeflediğin squat sayısını geçtin tebrikler");
            squat_sayısı = 0;
            System.out.println("Kalan squat : " + squat_sayısı);
        } else {

            squat_sayısı -= sayi;
            System.out.println("Kalan squat : " + squat_sayısı);

        }
    }

    public boolean idmanBittiMi() {
        return ((burpee_sayısı == 0) && (pushup_sayısı == 0) && (squat_sayısı == 0) && (situp_sayısı == 0));
    }
}
