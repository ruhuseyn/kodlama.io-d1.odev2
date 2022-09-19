package kodlama.io;

public class AsalSayi {
    public static void asalSayi(){
        int number = 13;
        boolean asalSayi = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                asalSayi = false;
            }
        }
        if (asalSayi) {
            System.out.println("Sade ededdir");
        } else {
            System.out.println("Sade eded deyildir");
        }
    }
}
