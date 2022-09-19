package kodlama.io;

public class Diziler {

    public static void diziler(){
        java.lang.String ogrenci1 = "Engin";
        java.lang.String ogrenci2 = "Derin";
        java.lang.String ogrenci3 = "Salih";
        java.lang.String ogrenci4 = "Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-------------------------------");


        String[] ogrenciler1 = new String[]{"Engin","Saliha","Derin"};


        for (int i = 0; i<ogrenciler1.length;i++){
            System.out.println(ogrenciler1[i]);
        }

        for (String ogrencilers: ogrenciler1){
            System.out.println(ogrencilers);
        }
    }
}
