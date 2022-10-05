package second;

public class Methods {

    public static void methodAll(){
        rakamlariTopla();

        int c = topla(10,26);
        System.out.println(c);

        int k = bol(10);
        System.out.println(k);

        int toplam2 = topla2(1,5,10,19);
        System.out.println(toplam2);
    }

    public static void rakamlariTopla(){ //parametresiz + void
        int a = 5;
        int b = 6;
        int c = a + b;
        System.out.println(c);
    }

    public static int topla(int a, int b){ //parametreli
        return a+b;
    }

    public static int bol(int a){
        return 20/a;
    }

    public static int topla2(int... sayilar){
        int toplam = 0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}
