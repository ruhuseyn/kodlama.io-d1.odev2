package kodlama.io;

public class SwitchBloklari {

    public static void switchBloklari(){

        int deger = 3;

        switch(deger){
            case 2:
                System.out.println("Cok kotu");
                break;
            case 3:
                System.out.println("Not: Ortalama iyi");
                break;
            case 4:
                System.out.println("Not: Iyi gectiniz.");
                break;
            case 5:
                System.out.println("Not: Cok iyi. Tebriklerr");
                break;
            default:
                System.out.println("Girdiginiz deger yanlis...");
        }
    }
}
