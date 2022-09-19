package kodlama.io;

public class ForWhileDoWhileDonguleri {

    public static void donguler(){

        //          FOR DONGUSU

        for (int i = 0; i<10; i++){
            System.out.println(i);
        }
        System.out.println("Dongu bitdi");

        //         WHILE DONGUSU

        int b = 0;
        while (b<10){
            //Direkt olarak sart kontrol edilir
            System.out.println(b);
            b++;
        }
        System.out.println("While dongusu bitdi");

        //        DO WHILE

        int c =0;
        do{
            // Belirtilen deyisken yapilir sonra kontrol edilir...
            System.out.println(c);
            c++;

        }while(c<10);

    }
}
