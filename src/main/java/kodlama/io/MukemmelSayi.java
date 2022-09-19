package kodlama.io;

public class MukemmelSayi {

    public static void mukemmelSayi(){

        int number = 13;
        int total = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                total+=i;
            }
        }
        if (total == number) {
            System.out.println("Mukemmel sayidir");
        } else {
            System.out.println("Mukemmel sayi degildir");
        }
    }
}
